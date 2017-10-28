package utest.svg.transcoded;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MultipleGradientPaint;
import java.awt.Paint;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/flamingo">Flamingo SVG transcoder</a>.
 */
public class Network_wireless implements
		org.pushingpixels.flamingo.api.common.icon.ResizableIcon {
	/**
	 * Paints the transcoded SVG image on the specified graphics context. You
	 * can install a custom transformation on the graphics context to scale the
	 * image.
	 * 
	 * @param g
	 *            Graphics context.
	 */
    @SuppressWarnings("unused")
	public static void paint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
         
        float origAlpha = 1.0f;
        Composite origComposite = ((Graphics2D)g).getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    AffineTransform defaultTransform_ = g.getTransform();
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.4064171f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(2.4600489139556885f, 0.0f, 0.0f, 2.4600489139556885f, -49.40945816040039f, -67.96373748779297f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(30.203561782836914, 44.56548309326172), 6.5659914f, new Point2D.Double(30.203561782836914, 44.56548309326172), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.3384619951248169f, -1.4354759471951642E-15f, 29.481779098510742f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.769554, 44.565483);
((GeneralPath)shape).curveTo(36.769554, 45.792847, 33.82986, 46.78782, 30.203562, 46.78782);
((GeneralPath)shape).curveTo(26.577265, 46.78782, 23.63757, 45.792847, 23.63757, 44.565483);
((GeneralPath)shape).curveTo(23.63757, 43.33812, 26.577265, 42.343147, 30.203562, 42.343147);
((GeneralPath)shape).curveTo(33.82986, 42.343147, 36.769554, 43.33812, 36.769554, 44.565483);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new RadialGradientPaint(new Point2D.Double(24.445690155029297, 35.878170013427734), 20.530962f, new Point2D.Double(24.445690155029297, 35.878170013427734), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(220, 220, 220, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9950579404830933f, -1.6515269512350966E-32f, 0.0f, 1.9950579404830933f, -24.324880599975586f, -35.700870513916016f));
shape = new RoundRectangle2D.Double(4.414728164672852, 3.5233452320098877, 40.06192398071289, 40.06192398071289, 10.909647941589355, 10.909647941589355);
g.setPaint(paint);
g.fill(shape);
paint = new Color(155, 155, 155, 255);
stroke = new BasicStroke(1.0f,0,2,10.0f,null,0.0f);
shape = new RoundRectangle2D.Double(4.414728164672852, 3.5233452320098877, 40.06192398071289, 40.06192398071289, 10.909647941589355, 10.909647941589355);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000004f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.224903, 38.95567);
((GeneralPath)shape).lineTo(24.819939, 24.359674);
((GeneralPath)shape).lineTo(30.135763, 38.95567);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(0.6892200112342834f, 0.0f, 0.0f, 0.6892200112342834f, 5.768155097961426f, 11.069000244140625f));
// _0_0_3
paint = new Color(239, 41, 41, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.910667, 18.60456);
((GeneralPath)shape).curveTo(30.910667, 20.445604, 29.418207, 21.938065, 27.577164, 21.938065);
((GeneralPath)shape).curveTo(25.73612, 21.938065, 24.24366, 20.445604, 24.24366, 18.60456);
((GeneralPath)shape).curveTo(24.24366, 16.763517, 25.73612, 15.271057, 27.577164, 15.271057);
((GeneralPath)shape).curveTo(29.418207, 15.271057, 30.910667, 16.763517, 30.910667, 18.60456);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(2.38230299949646f, 0.0f, 0.0f, 2.38230299949646f, -40.92229080200195f, -20.430070877075195f));
// _0_0_4
paint = new RadialGradientPaint(new Point2D.Double(27.577173233032227, 16.04913330078125), 3.8335035f, new Point2D.Double(27.577173233032227, 16.04913330078125), new float[] {0.0f,1.0f}, new Color[] {new Color(239, 41, 41, 255),new Color(239, 41, 41, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.243453025817871f, 2.1067840215472386E-16f, -2.1067840215472386E-16f, 1.243453025817871f, -6.713754177093506f, -3.742846965789795f));
stroke = new BasicStroke(1.1812764f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.910667, 18.60456);
((GeneralPath)shape).curveTo(30.910667, 20.445604, 29.418207, 21.938065, 27.577164, 21.938065);
((GeneralPath)shape).curveTo(25.73612, 21.938065, 24.24366, 20.445604, 24.24366, 18.60456);
((GeneralPath)shape).curveTo(24.24366, 16.763517, 25.73612, 15.271057, 27.577164, 15.271057);
((GeneralPath)shape).curveTo(29.418207, 15.271057, 30.910667, 16.763517, 30.910667, 18.60456);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(4.6576080322265625f, 0.0f, 0.0f, 4.6576080322265625f, -103.66899871826172f, -62.761131286621094f));
// _0_0_5
paint = new RadialGradientPaint(new Point2D.Double(27.577173233032227, 15.048257827758789), 3.8335035f, new Point2D.Double(27.577173233032227, 15.048257827758789), new float[] {0.0f,1.0f}, new Color[] {new Color(239, 41, 41, 255),new Color(239, 41, 41, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.243453025817871f, 2.1067840215472386E-16f, -2.1067840215472386E-16f, 1.243453025817871f, -6.713754177093506f, -3.742846965789795f));
stroke = new BasicStroke(0.60420674f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.910667, 18.60456);
((GeneralPath)shape).curveTo(30.910667, 20.445604, 29.418207, 21.938065, 27.577164, 21.938065);
((GeneralPath)shape).curveTo(25.73612, 21.938065, 24.24366, 20.445604, 24.24366, 18.60456);
((GeneralPath)shape).curveTo(24.24366, 16.763517, 25.73612, 15.271057, 27.577164, 15.271057);
((GeneralPath)shape).curveTo(29.418207, 15.271057, 30.910667, 16.763517, 30.910667, 18.60456);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 0.1764706f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(1.5677410364151f, 0.0f, 0.0f, 1.5677410364151f, -22.256559371948242f, -31.995590209960938f));
// _0_0_6
paint = new RadialGradientPaint(new Point2D.Double(30.203561782836914, 44.56548309326172), 6.5659914f, new Point2D.Double(30.203561782836914, 44.56548309326172), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.3384619951248169f, 2.2203589742633353E-14f, 29.481779098510742f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.769554, 44.565483);
((GeneralPath)shape).curveTo(36.769554, 45.792847, 33.82986, 46.78782, 30.203562, 46.78782);
((GeneralPath)shape).curveTo(26.577265, 46.78782, 23.63757, 45.792847, 23.63757, 44.565483);
((GeneralPath)shape).curveTo(23.63757, 43.33812, 26.577265, 42.343147, 30.203562, 42.343147);
((GeneralPath)shape).curveTo(33.82986, 42.343147, 36.769554, 43.33812, 36.769554, 44.565483);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0000004f,0,2,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.812107, 28.571856);
((GeneralPath)shape).lineTo(26.719572, 29.426992);
((GeneralPath)shape).lineTo(22.44389, 32.334457);
((GeneralPath)shape).lineTo(28.258818, 33.873703);
((GeneralPath)shape).lineTo(21.07567, 36.781166);
((GeneralPath)shape).lineTo(29.627037, 37.636303);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(0.99999976f,0,2,10.0f,null,0.0f);
shape = new RoundRectangle2D.Double(5.597388744354248, 4.70600700378418, 37.69658660888672, 37.69658660888672, 8.485278129577637, 8.485278129577637);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_8);
g.setTransform(defaultTransform__0_0);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 3.9147281646728516;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 3.0233452320098877;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 41.061927795410156;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 44.11323928833008;
	}

	/**
	 * The current width of this resizable icon.
	 */
	int width;

	/**
	 * The current height of this resizable icon.
	 */
	int height;

	/**
	 * Creates a new transcoded SVG image.
	 */
	public Network_wireless() {
        this.width = (int) getOrigWidth();
        this.height = (int) getOrigHeight();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconHeight()
	 */
    @Override
	public int getIconHeight() {
		return height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconWidth()
	 */
    @Override
	public int getIconWidth() {
		return width;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jvnet.flamingo.common.icon.ResizableIcon#setDimension(java.awt.Dimension
	 * )
	 */
	@Override
	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics,
	 * int, int)
	 */
    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.translate(x, y);

        double coef1 = (double) this.width / (double) getOrigWidth();
        double coef2 = (double) this.height / (double) getOrigHeight();
        double coef = Math.min(coef1, coef2);
        g2d.clipRect(0, 0, this.width, this.height);
        g2d.scale(coef, coef);
        g2d.translate(-getOrigX(), -getOrigY());
        if (coef1 != coef2) {
            if (coef1 < coef2) {
               int extraDy = (int) ((getOrigWidth() - getOrigHeight()) / 2.0);
               g2d.translate(0, extraDy);
            } else {
               int extraDx = (int) ((getOrigHeight() - getOrigWidth()) / 2.0);
               g2d.translate(extraDx, 0);
            }
        }
        paint(g2d);
        g2d.dispose();
	}
    
    public static Network_wireless of(int width, int height) {
       Network_wireless result = new Network_wireless();
       result.width = width;
       result.height = height;
       return result;
    }
}

