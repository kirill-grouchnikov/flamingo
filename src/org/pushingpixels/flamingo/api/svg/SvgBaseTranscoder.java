/*
 * Copyright (c) 2005-2016 Flamingo Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *  o Redistributions of source code must retain the above copyright notice, 
 *    this list of conditions and the following disclaimer. 
 *     
 *  o Redistributions in binary form must reproduce the above copyright notice, 
 *    this list of conditions and the following disclaimer in the documentation 
 *    and/or other materials provided with the distribution. 
 *     
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of 
 *    its contributors may be used to endorse or promote products derived 
 *    from this software without specific prior written permission. 
 *     
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR 
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR 
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, 
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, 
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; 
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
 */
package org.pushingpixels.flamingo.api.svg;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Field;

import org.apache.batik.ext.awt.LinearGradientPaint;
import org.apache.batik.ext.awt.MultipleGradientPaint;
import org.apache.batik.ext.awt.MultipleGradientPaint.ColorSpaceEnum;
import org.apache.batik.ext.awt.MultipleGradientPaint.CycleMethodEnum;
import org.apache.batik.ext.awt.RadialGradientPaint;
import org.apache.batik.ext.awt.geom.ExtendedGeneralPath;
import org.apache.batik.gvt.CompositeGraphicsNode;
import org.apache.batik.gvt.CompositeShapePainter;
import org.apache.batik.gvt.FillShapePainter;
import org.apache.batik.gvt.GraphicsNode;
import org.apache.batik.gvt.ShapeNode;
import org.apache.batik.gvt.ShapePainter;
import org.apache.batik.gvt.StrokeShapePainter;

/**
 * SVG to Java2D transcoder.
 * 
 * @author Kirill Grouchnikov.
 */
abstract class SvgBaseTranscoder {
	/**
	 * Listener.
	 */
	protected TranscoderListener listener;

	/**
	 * Print writer that wraps the {@link TranscoderListener#getWriter()} of the
	 * registered {@link #listener}.
	 */
	protected PrintWriter externalPrintWriter;

	/**
	 * Print writer that wraps the {@link TranscoderListener#getWriter()} of the
	 * registered {@link #listener}.
	 */
	protected PrintWriter printWriter;

	/**
	 * Class name for the generated Java2D code.
	 */
	protected String javaClassName;

	/**
	 * Package name for the generated Java2D code.
	 */
	protected String javaPackageName;

	protected boolean javaToImplementResizableIconInterface;

	protected boolean javaToImplementSubstanceIconInterfaces;

	protected final static String TOKEN_PACKAGE = "TOKEN_PACKAGE";

	protected final static String TOKEN_CLASSNAME = "TOKEN_CLASSNAME";

	protected final static String TOKEN_PAINTING_CODE = "TOKEN_PAINTING_CODE";

	protected final static String TOKEN_ORIG_X = "TOKEN_ORIG_X";

	protected final static String TOKEN_ORIG_Y = "TOKEN_ORIG_Y";

	protected final static String TOKEN_ORIG_WIDTH = "TOKEN_ORIG_WIDTH";

	protected final static String TOKEN_ORIG_HEIGHT = "TOKEN_ORIG_HEIGHT";

	/**
	 * Creates a new transcoder.
	 * 
	 * @param uri
	 *            URI of the SVG image.
	 * @param javaClassname
	 *            Classname for the generated Java2D code.
	 */
	public SvgBaseTranscoder(String javaClassname) {
		this.javaClassName = javaClassname;
		this.javaToImplementResizableIconInterface = false;
	}

	public void setJavaToImplementResizableIconInterface(
			boolean javaToImplementResizableIconInterface) {
		this.javaToImplementResizableIconInterface = javaToImplementResizableIconInterface;
	}
	
	public void setJavaToImplementSubstanceInterfaces() {
		this.javaToImplementSubstanceIconInterfaces = true;
	}

	public void setJavaPackageName(String javaPackageName) {
		this.javaPackageName = javaPackageName;
	}

	/**
	 * Sets the listener.
	 * 
	 * @param listener
	 *            Listener.
	 */
	public void setListener(TranscoderListener listener) {
		this.listener = listener;
		this.setPrintWriter(new PrintWriter(this.listener.getWriter()));
	}

	public void setPrintWriter(PrintWriter printWriter) {
		this.externalPrintWriter = printWriter;
	}

	/**
	 * Transcodes the SVG image into Java2D code.
	 */
	public void transcode(GraphicsNode gvtRoot) {
		String template = this.javaToImplementSubstanceIconInterfaces 
				? "SvgTranscoderTemplateSubstance.templ" :
					(this.javaToImplementResizableIconInterface 
						? "SvgTranscoderTemplateResizable.templ"
						: "SvgTranscoderTemplatePlain.templ");
		// load the template
		InputStream templateStream = SvgBaseTranscoder.class
				.getResourceAsStream(template);
		StringBuffer templateBuffer = new StringBuffer();
		BufferedReader templateReader = new BufferedReader(
				new InputStreamReader(templateStream));
		try {
			while (true) {
				String line = templateReader.readLine();
				if (line == null)
					break;
				templateBuffer.append(line + "\n");
			}
			templateReader.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		String templateString = templateBuffer.toString();

		if (javaPackageName != null) {
			templateString = templateString.replaceAll(TOKEN_PACKAGE,
					"package " + javaPackageName + ";");
		} else {
			templateString = templateString.replaceAll(TOKEN_PACKAGE, "");
		}

		templateString = templateString.replaceAll(TOKEN_CLASSNAME,
				javaClassName);
		templateString = templateString.replaceAll(TOKEN_CLASSNAME,
				javaClassName);
		templateString = templateString.replaceAll(TOKEN_CLASSNAME,
				javaClassName);

		ByteArrayOutputStream paintingCodeStream = new ByteArrayOutputStream();
		this.printWriter = new PrintWriter(paintingCodeStream);
		transcodeGraphicsNode(gvtRoot, "");
		this.printWriter.close();

		String paintingCode = new String(paintingCodeStream.toByteArray());
		templateString = templateString.replaceAll(TOKEN_PAINTING_CODE,
				paintingCode);

		Rectangle2D bounds = gvtRoot.getBounds();

		templateString = templateString.replaceAll(TOKEN_ORIG_X, ""
				+ (int) Math.ceil(bounds.getX()));
		templateString = templateString.replaceAll(TOKEN_ORIG_Y, ""
				+ (int) Math.ceil(bounds.getY()));
		templateString = templateString.replaceAll(TOKEN_ORIG_WIDTH, ""
				+ (int) Math.ceil(bounds.getWidth()));
		templateString = templateString.replaceAll(TOKEN_ORIG_HEIGHT, ""
				+ (int) Math.ceil(bounds.getHeight()));

		this.externalPrintWriter.println(templateString);
		this.externalPrintWriter.close();

		if (listener != null)
			listener.finished();
	}

	/**
	 * Transcodes the specified path iterator.
	 * 
	 * @param pathIterator
	 *            Path iterator.
	 */
	private void transcodePathIterator(PathIterator pathIterator) {
		float[] coords = new float[6];
		printWriter.println("shape = new GeneralPath();");
		for (; !pathIterator.isDone(); pathIterator.next()) {
			int type = pathIterator.currentSegment(coords);
			switch (type) {
			case PathIterator.SEG_CUBICTO:
				// offset(offset + 1);
				// printWriter.println("CUBICTO " + coords[0] + ":" + coords[1]
				// + ":" + coords[2] + ":" + coords[3] + ":"
				// + coords[4] + ":" + coords[5]);
				printWriter.println("((GeneralPath)shape).curveTo(" + coords[0]
						+ ", " + coords[1] + ", " + coords[2] + ", "
						+ coords[3] + ", " + coords[4] + ", " + coords[5]
						+ ");");
				break;
			case PathIterator.SEG_QUADTO:
				// offset(offset + 1);
				// printWriter.println("QUADTO " + coords[0] + ":" + coords[1]
				// + ":" + coords[2] + ":" + coords[3]);
				printWriter.println("((GeneralPath)shape).quadTo(" + coords[0]
						+ ", " + coords[1] + ", " + coords[2] + ", "
						+ coords[3] + ");");
				break;
			case PathIterator.SEG_MOVETO:
				// offset(offset + 1);
				// printWriter.println("MOVETO " + coords[0] + ":" + coords[1]);
				printWriter.println("((GeneralPath)shape).moveTo(" + coords[0]
						+ ", " + coords[1] + ");");
				break;
			case PathIterator.SEG_LINETO:
				// offset(offset + 1);
				// printWriter.println("LINETO " + coords[0] + ":" + coords[1]);
				printWriter.println("((GeneralPath)shape).lineTo(" + coords[0]
						+ ", " + coords[1] + ");");
				break;
			// through
			case PathIterator.SEG_CLOSE:
				// offset(offset + 1);
				// printWriter.println("CLOSE");
				printWriter.println("((GeneralPath)shape).closePath();");
				break;
			}
		}
	}

	/**
	 * Transcodes the specified shape.
	 * 
	 * @param shape
	 *            Shape.
	 * @throws UnsupportedOperationException
	 *             if the shape is unsupported.
	 */
	private void transcodeShape(Shape shape)
			throws UnsupportedOperationException {
		if (shape instanceof ExtendedGeneralPath) {
			transcodePathIterator(((ExtendedGeneralPath) shape)
					.getPathIterator(null));
			return;
		}
		if (shape instanceof GeneralPath) {
			transcodePathIterator(((GeneralPath) shape).getPathIterator(null));
			return;
		}
		if (shape instanceof Rectangle2D) {
			Rectangle2D rect = (Rectangle2D) shape;
			printWriter.println("shape = new Rectangle2D.Double(" + rect.getX()
					+ ", " + rect.getY() + ", " + rect.getWidth() + ", "
					+ rect.getHeight() + ");");
			return;
		}
		if (shape instanceof RoundRectangle2D) {
			RoundRectangle2D rRect = (RoundRectangle2D) shape;
			printWriter.println("shape = new RoundRectangle2D.Double("
					+ rRect.getX() + ", " + rRect.getY() + ", "
					+ rRect.getWidth() + ", " + rRect.getHeight() + ", "
					+ rRect.getArcWidth() + ", " + rRect.getArcHeight() + ");");
			return;
		}
		if (shape instanceof Ellipse2D) {
			Ellipse2D ell = (Ellipse2D) shape;
			printWriter.println("shape = new Ellipse2D.Double(" + ell.getX()
					+ ", " + ell.getY() + ", " + ell.getWidth() + ", "
					+ ell.getHeight() + ");");
			return;
		}
		if (shape instanceof Line2D.Float) {
			Line2D.Float l2df = (Line2D.Float) shape;
			printWriter.format("shape = new Line2D.Float(%ff,%ff,%ff,%ff);\n",
					l2df.x1, l2df.y1, l2df.x2, l2df.y2);
			return;
		}
		throw new UnsupportedOperationException(shape.getClass()
				.getCanonicalName());
	}

	/**
	 * Transcodes the specified linear gradient paint.
	 * 
	 * @param paint
	 *            Linear gradient paint.
	 * @throws IllegalArgumentException
	 *             if the fractions are not strictly increasing.
	 */
	private void transcodeLinearGradientPaint(LinearGradientPaint paint)
			throws IllegalArgumentException {
		Point2D startPoint = paint.getStartPoint();
		Point2D endPoint = paint.getEndPoint();
		float[] fractions = paint.getFractions();
		Color[] colors = paint.getColors();
		CycleMethodEnum cycleMethod = paint.getCycleMethod();
		ColorSpaceEnum colorSpace = paint.getColorSpace();
		AffineTransform transform = paint.getTransform();

		float previousFraction = -1.0f;
		for (float currentFraction : fractions) {
			if (currentFraction < 0f || currentFraction > 1f) {
				throw new IllegalArgumentException("Fraction values must "
						+ "be in the range 0 to 1: " + currentFraction);
			}

			if (currentFraction < previousFraction) {
				throw new IllegalArgumentException("Keyframe fractions "
						+ "must be non-decreasing: " + currentFraction);
			}

			previousFraction = currentFraction;
		}

		StringBuffer fractionsRep = new StringBuffer();
		if (fractions == null) {
			fractionsRep.append("null");
		} else {
			String sep = "";
			fractionsRep.append("new float[] {");
			previousFraction = -1.0f;
			for (float currentFraction : fractions) {
				fractionsRep.append(sep);
				if (currentFraction == previousFraction)
					currentFraction += 0.000000001f;
				fractionsRep.append(currentFraction + "f");
				sep = ",";

				previousFraction = currentFraction;
			}
			fractionsRep.append("}");
		}

		StringBuffer colorsRep = new StringBuffer();
		if (fractions == null) {
			colorsRep.append("null");
		} else {
			String sep = "";
			colorsRep.append("new Color[] {");
			for (Color color : colors) {
				colorsRep.append(sep);
				colorsRep.append("new Color(" + color.getRed() + ", "
						+ color.getGreen() + ", " + color.getBlue() + ", "
						+ color.getAlpha() + ")");
				sep = ",";
			}
			colorsRep.append("}");
		}

		String cycleMethodRep = null;
		if (cycleMethod == MultipleGradientPaint.NO_CYCLE) {
			cycleMethodRep = "MultipleGradientPaint.CycleMethod.NO_CYCLE";
		}
		if (cycleMethod == MultipleGradientPaint.REFLECT) {
			cycleMethodRep = "MultipleGradientPaint.CycleMethod.REFLECT";
		}
		if (cycleMethod == MultipleGradientPaint.REPEAT) {
			cycleMethodRep = "MultipleGradientPaint.CycleMethod.REPEAT";
		}

		String colorSpaceRep = null;
		if (colorSpace == MultipleGradientPaint.SRGB) {
			colorSpaceRep = "MultipleGradientPaint.ColorSpaceType.SRGB";
		}
		if (colorSpace == MultipleGradientPaint.LINEAR_RGB) {
			colorSpaceRep = "MultipleGradientPaint.ColorSpaceType.LINEAR_RGB";
		}

		double[] transfMatrix = new double[6];
		transform.getMatrix(transfMatrix);

		this.printWriter
				.println("paint = new LinearGradientPaint(new Point2D.Double("
						+ startPoint.getX() + ", " + startPoint.getY()
						+ "), new Point2D.Double(" + endPoint.getX() + ", "
						+ endPoint.getY() + "), " + fractionsRep.toString()
						+ ", " + colorsRep.toString() + ", " + cycleMethodRep
						+ ", " + colorSpaceRep + ", new AffineTransform("
						+ transfMatrix[0] + "f, " + transfMatrix[1] + "f, "
						+ transfMatrix[2] + "f, " + transfMatrix[3] + "f, "
						+ transfMatrix[4] + "f, " + transfMatrix[5] + "f));");

		// offset(offset);
		// printWriter.println("LinearGradientPaint");
		// // offset(offset + 1);
		// printWriter.println("START : " + paint.getStartPoint());
		// // offset(offset + 1);
		// printWriter.println("END : " + paint.getEndPoint());
		// // offset(offset + 1);
		// printWriter.println("FRACTIONS : " + paint.getFractions());
		// // offset(offset + 1);
		// printWriter.println("CYCLE_METHOD : " + paint.getCycleMethod());
		// // offset(offset + 1);
		// printWriter.println("COLOR_SPACE : " + paint.getColorSpace());
		// // offset(offset + 1);
		// printWriter.println("GRADIENT_TRANSFORM : " + paint.getTransform());
	}

	/**
	 * Transcodes the specified radial gradient paint.
	 * 
	 * @param paint
	 *            Radial gradient paint.
	 * @throws IllegalArgumentException
	 *             if the fractions are not strictly increasing.
	 */
	private void transcodeRadialGradientPaint(RadialGradientPaint paint)
			throws IllegalArgumentException {
		// offset(offset);
		Point2D centerPoint = paint.getCenterPoint();
		float radius = paint.getRadius();
		Point2D focusPoint = paint.getFocusPoint();
		float[] fractions = paint.getFractions();
		Color[] colors = paint.getColors();
		CycleMethodEnum cycleMethod = paint.getCycleMethod();
		ColorSpaceEnum colorSpace = paint.getColorSpace();
		AffineTransform transform = paint.getTransform();

		float previousFraction = -1.0f;
		for (float currentFraction : fractions) {
			if (currentFraction < 0f || currentFraction > 1f) {
				throw new IllegalArgumentException("Fraction values must "
						+ "be in the range 0 to 1: " + currentFraction);
			}

			if (currentFraction < previousFraction) {
				throw new IllegalArgumentException("Keyframe fractions "
						+ "must be non-decreasing: " + currentFraction);
			}

			previousFraction = currentFraction;
		}

		StringBuffer fractionsRep = new StringBuffer();
		if (fractions == null) {
			fractionsRep.append("null");
		} else {
			String sep = "";
			fractionsRep.append("new float[] {");
			previousFraction = -1.0f;
			for (float currentFraction : fractions) {
				fractionsRep.append(sep);
				if (currentFraction == previousFraction)
					currentFraction += 0.000000001f;
				fractionsRep.append(currentFraction + "f");
				sep = ",";

				previousFraction = currentFraction;
			}
			fractionsRep.append("}");
		}

		StringBuffer colorsRep = new StringBuffer();
		if (fractions == null) {
			colorsRep.append("null");
		} else {
			String sep = "";
			colorsRep.append("new Color[] {");
			for (Color color : colors) {
				colorsRep.append(sep);
				colorsRep.append("new Color(" + color.getRed() + ", "
						+ color.getGreen() + ", " + color.getBlue() + ", "
						+ color.getAlpha() + ")");
				sep = ",";
			}
			colorsRep.append("}");
		}

		String cycleMethodRep = null;
		if (cycleMethod == MultipleGradientPaint.NO_CYCLE) {
			cycleMethodRep = "MultipleGradientPaint.CycleMethod.NO_CYCLE";
		}
		if (cycleMethod == MultipleGradientPaint.REFLECT) {
			cycleMethodRep = "MultipleGradientPaint.CycleMethod.REFLECT";
		}
		if (cycleMethod == MultipleGradientPaint.REPEAT) {
			cycleMethodRep = "MultipleGradientPaint.CycleMethod.REPEAT";
		}

		String colorSpaceRep = null;
		if (colorSpace == MultipleGradientPaint.SRGB) {
			colorSpaceRep = "MultipleGradientPaint.ColorSpaceType.SRGB";
		}
		if (colorSpace == MultipleGradientPaint.LINEAR_RGB) {
			colorSpaceRep = "MultipleGradientPaint.ColorSpaceType.LINEAR_RGB";
		}

		double[] transfMatrix = new double[6];
		transform.getMatrix(transfMatrix);

		this.printWriter
				.println("paint = new RadialGradientPaint(new Point2D.Double("
						+ centerPoint.getX() + ", " + centerPoint.getY()
						+ "), " + radius + "f, new Point2D.Double("
						+ focusPoint.getX() + ", " + focusPoint.getY() + "), "
						+ fractionsRep.toString() + ", " + colorsRep.toString()
						+ ", " + cycleMethodRep + ", " + colorSpaceRep
						+ ", new AffineTransform(" + transfMatrix[0] + "f, "
						+ transfMatrix[1] + "f, " + transfMatrix[2] + "f, "
						+ transfMatrix[3] + "f, " + transfMatrix[4] + "f, "
						+ transfMatrix[5] + "f));");
		//				
		// printWriter.println("RadialGradientPaint");
		// // offset(offset + 1);
		// printWriter.println("CENTER : " + paint.getCenterPoint());
		// // offset(offset + 1);
		// printWriter.println("RADIUS : " + paint.getRadius());
		// // offset(offset + 1);
		// printWriter.println("FOCUS : " + paint.getFocusPoint());
		// // offset(offset + 1);
		// printWriter.println("FRACTIONS : " + paint.getFractions());
		// // offset(offset + 1);
		// printWriter.println("COLORS : " + paint.getColors());
		// // offset(offset + 1);
		// printWriter.println("CYCLE_METHOD : " + paint.getCycleMethod());
		// // offset(offset + 1);
		// printWriter.println("COLOR_SPACE : " + paint.getColorSpace());
		// // offset(offset + 1);
		// printWriter.println("GRADIENT_TRANSFORM : " + paint.getTransform());
	}

	/**
	 * Transcodes the specified paint.
	 * 
	 * @param paint
	 *            Paint.
	 * @throws UnsupportedOperationException
	 *             if the paint is unsupported.
	 */
	private void transcodePaint(Paint paint)
			throws UnsupportedOperationException {
		if (paint instanceof RadialGradientPaint) {
			transcodeRadialGradientPaint((RadialGradientPaint) paint);
			return;
		}
		if (paint instanceof LinearGradientPaint) {
			transcodeLinearGradientPaint((LinearGradientPaint) paint);
			return;
		}
		if (paint instanceof Color) {
			// offset(offset);
			// printWriter.println((Color) paint);
			Color c = (Color) paint;
			printWriter.println("paint = new Color(" + c.getRed() + ", "
					+ c.getGreen() + ", " + c.getBlue() + ", " + c.getAlpha()
					+ ");");
			return;
		}
		if (paint == null) {
			// offset(offset);
			printWriter.println("No paint");
			return;
		}

		throw new UnsupportedOperationException(paint.getClass()
				.getCanonicalName());
	}

	/**
	 * Transcodes the specified shape painter.
	 * 
	 * @param painter
	 *            Shape painter.
	 * @throws UnsupportedOperationException
	 *             if the shape painter is unsupported.
	 */
	private void transcodeShapePainter(ShapePainter painter)
			throws UnsupportedOperationException {
		if (painter == null)
			return;
		if (painter instanceof CompositeShapePainter) {
			transcodeCompositeShapePainter((CompositeShapePainter) painter);
			return;
		}
		if (painter instanceof FillShapePainter) {
			transcodeFillShapePainter((FillShapePainter) painter);
			return;
		}
		if (painter instanceof StrokeShapePainter) {
			transcodeStrokeShapePainter((StrokeShapePainter) painter);
			return;
		}
		throw new UnsupportedOperationException(painter.getClass()
				.getCanonicalName());
	}

	/**
	 * Transcodes the specified composite shape painter.
	 * 
	 * @param painter
	 *            Composite shape painter.
	 */
	private void transcodeCompositeShapePainter(CompositeShapePainter painter) {
		// offset(offset);
		// printWriter.println("CompositeShapePainter");
		for (int i = 0; i < painter.getShapePainterCount(); i++) {
			transcodeShapePainter(painter.getShapePainter(i));
		}
	}

	/**
	 * Transcodes the specified fill shape painter.
	 * 
	 * @param painter
	 *            Fill shape painter.
	 */
	private void transcodeFillShapePainter(FillShapePainter painter) {
		try {
			Field paintFld = FillShapePainter.class.getDeclaredField("paint");
			paintFld.setAccessible(true);
			Paint paint = (Paint) paintFld.get(painter);
			if (paint == null)
				return;
			transcodePaint(paint);
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		Shape shape = painter.getShape();
		// offset(offset);
		// printWriter.println("FillShapePainter");
		transcodeShape(shape);
		printWriter.println("g.setPaint(paint);");
		printWriter.println("g.fill(shape);");
	}

	/**
	 * Transcodes the specified stroke shape painter.
	 * 
	 * @param painter
	 *            Stroke shape painter.
	 */
	private void transcodeStrokeShapePainter(StrokeShapePainter painter) {
		Shape shape = painter.getShape();
		// offset(offset);
		// printWriter.println("StrokeShapePainter");
		try {
			Field paintFld = StrokeShapePainter.class.getDeclaredField("paint");
			paintFld.setAccessible(true);
			Paint paint = (Paint) paintFld.get(painter);
			if (paint == null)
				return;
			transcodePaint(paint);
			// offset(offset + 1);
			// printWriter.println(paint);
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		try {
			Field strokeFld = StrokeShapePainter.class
					.getDeclaredField("stroke");
			strokeFld.setAccessible(true);
			Stroke stroke = (Stroke) strokeFld.get(painter);
			// offset(offset + 1);

			BasicStroke bStroke = (BasicStroke) stroke;
			float width = bStroke.getLineWidth();
			int cap = bStroke.getEndCap();
			int join = bStroke.getLineJoin();
			float miterlimit = bStroke.getMiterLimit();
			float[] dash = bStroke.getDashArray();
			float dash_phase = bStroke.getDashPhase();

			StringBuffer dashRep = new StringBuffer();
			if (dash == null) {
				dashRep.append("null");
			} else {
				String sep = "";
				dashRep.append("new float[] {");
				for (float _dash : dash) {
					dashRep.append(sep);
					dashRep.append(_dash + "f");
					sep = ",";
				}
				dashRep.append("}");
			}
			printWriter.println("stroke = new BasicStroke(" + width + "f,"
					+ cap + "," + join + "," + miterlimit + "f," + dashRep
					+ "," + dash_phase + "f);");
		} catch (Exception exc) {
			exc.printStackTrace();
		}

		transcodeShape(shape);
		printWriter.println("g.setPaint(paint);");
		printWriter.println("g.setStroke(stroke);");
		printWriter.println("g.draw(shape);");
	}

	/**
	 * Transcodes the specified shape node.
	 * 
	 * @param node
	 *            Shape node.
	 * @param comment
	 *            Comment (for associating the Java2D section with the
	 *            corresponding SVG section).
	 */
	private void transcodeShapeNode(ShapeNode node, String comment) {
		// offset(offset);
		// printWriter.println("ShapeNode");

		printWriter.println("// " + comment);
		ShapePainter sPainter = node.getShapePainter();
		transcodeShapePainter(sPainter);
	}

	/**
	 * Transcodes the specified composite graphics node.
	 * 
	 * @param node
	 *            Composite graphics node.
	 * @param comment
	 *            Comment (for associating the Java2D section with the
	 *            corresponding SVG section).
	 */
	private void transcodeCompositeGraphicsNode(CompositeGraphicsNode node,
			String comment) {
		printWriter.println("// " + comment);
		// offset(offset);
		// printWriter.println("CompositeGraphicsNode");
		int count = 0;
		for (Object obj : node.getChildren()) {
			transcodeGraphicsNode((GraphicsNode) obj, comment + "_" + count);
			count++;
		}
	}

	/**
	 * Transcodes the specified graphics node.
	 * 
	 * @param node
	 *            Graphics node.
	 * @param comment
	 *            Comment (for associating the Java2D section with the
	 *            corresponding SVG section).
	 * @throws UnsupportedOperationException
	 *             if the graphics node is unsupported.
	 */
	private void transcodeGraphicsNode(GraphicsNode node, String comment)
			throws UnsupportedOperationException {
		AlphaComposite composite = (AlphaComposite) node.getComposite();
		if (composite != null) {
			int rule = composite.getRule();
			float alpha = composite.getAlpha();
			printWriter.println("g.setComposite(AlphaComposite.getInstance("
					+ rule + ", " + alpha + "f * origAlpha));");
		}
		AffineTransform transform = node.getTransform();
		printWriter.println("AffineTransform defaultTransform_" + comment
				+ " = g.getTransform();");
		if (transform != null) {
			// printWriter.println("g.transform(new AffineTransform());");
			// } else {
			double[] transfMatrix = new double[6];
			transform.getMatrix(transfMatrix);
			printWriter.println("g.transform(new AffineTransform("
					+ transfMatrix[0] + "f, " + transfMatrix[1] + "f, "
					+ transfMatrix[2] + "f, " + transfMatrix[3] + "f, "
					+ transfMatrix[4] + "f, " + transfMatrix[5] + "f));");
		}

		try {
			if (node instanceof ShapeNode) {
				transcodeShapeNode((ShapeNode) node, comment);
				return;
			}
			if (node instanceof CompositeGraphicsNode) {
				transcodeCompositeGraphicsNode((CompositeGraphicsNode) node,
						comment);
				return;
			}
			throw new UnsupportedOperationException(node.getClass()
					.getCanonicalName());
		} finally {
			printWriter.println("g.setTransform(defaultTransform_" + comment
					+ ");");
		}
	}
}
