package test.svg.transcoded;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.MultipleGradientPaint;
import java.awt.Paint;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class font_x_generic implements
		org.pushingpixels.flamingo.api.common.icon.ResizableIcon {
	/**
	 * Paints the transcoded SVG image on the specified graphics context. You
	 * can install a custom transformation on the graphics context to scale the
	 * image.
	 * 
	 * @param g
	 *            Graphics context.
	 */
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(0.02474839985370636f, 0.0f, 0.0f, 0.02086758054792881f, 46.13711166381836f, 41.50714874267578f));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
AffineTransform defaultTransform__0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0
paint = new LinearGradientPaint(new Point2D.Double(302.8571472167969, 366.64788818359375), new Point2D.Double(302.8571472167969, 609.5050659179688), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(0, 0, 0, 0),new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1892.178955078125f, -872.8853759765625f));
shape = new Rectangle2D.Double(-1559.2523193359375, -150.6968536376953, 1339.633544921875, 478.357177734375);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
AffineTransform defaultTransform__0_0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_1
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1891.633056640625f, -872.8853759765625f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-219.61876, -150.68037);
((GeneralPath)shape).curveTo(-219.61876, -150.68037, -219.61876, 327.65042, -219.61876, 327.65042);
((GeneralPath)shape).curveTo(-76.74459, 328.55087, 125.78146, 220.48074, 125.78138, 88.45424);
((GeneralPath)shape).curveTo(125.78138, -43.572304, -33.655437, -150.68036, -219.61876, -150.68037);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
AffineTransform defaultTransform__0_0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_2
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, 112.76229858398438f, -872.8853759765625f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-1559.2523, -150.68037);
((GeneralPath)shape).curveTo(-1559.2523, -150.68037, -1559.2523, 327.65042, -1559.2523, 327.65042);
((GeneralPath)shape).curveTo(-1702.1265, 328.55087, -1904.6525, 220.48074, -1904.6525, 88.45424);
((GeneralPath)shape).curveTo(-1904.6525, -43.572304, -1745.2157, -150.68036, -1559.2523, -150.68037);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_2);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new LinearGradientPaint(new Point2D.Double(36.66853713989258, 36.38324737548828), new Point2D.Double(10.30355453491211, 7.492883205413818), new float[] {0.0f,1.0f}, new Color[] {new Color(238, 238, 236, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new RoundRectangle2D.Double(3.488370418548584, 2.512193202972412, 41.011470794677734, 42.987239837646484, 1.9981215000152588, 1.9982975721359253);
g.setPaint(paint);
g.fill(shape);
paint = new Color(136, 138, 133, 255);
stroke = new BasicStroke(1.0249254f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(3.488370418548584, 2.512193202972412, 41.011470794677734, 42.987239837646484, 1.9981215000152588, 1.9982975721359253);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new LinearGradientPaint(new Point2D.Double(18.561553955078125, 12.998213768005371), new Point2D.Double(30.93592071533203, 33.68109130859375), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 159, 207, 255),new Color(52, 101, 164, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -1.0f, -1.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.0, 39.008526);
((GeneralPath)shape).curveTo(36.343773, 38.775524, 36.064167, 38.777718, 35.458363, 35.375885);
((GeneralPath)shape).lineTo(31.077913, 9.0);
((GeneralPath)shape).lineTo(30.2413, 9.0);
((GeneralPath)shape).lineTo(16.352156, 32.30025);
((GeneralPath)shape).curveTo(12.67072, 38.49811, 11.798459, 38.635723, 9.934442, 39.008526);
((GeneralPath)shape).lineTo(9.934442, 40.129135);
((GeneralPath)shape).lineTo(19.054985, 40.129135);
((GeneralPath)shape).lineTo(19.054985, 39.008526);
((GeneralPath)shape).curveTo(16.678362, 38.775524, 16.305555, 38.917522, 16.305555, 37.75251);
((GeneralPath)shape).curveTo(16.305555, 36.8671, 16.445358, 36.447693, 17.237564, 34.863277);
((GeneralPath)shape).lineTo(19.893793, 30.159922);
((GeneralPath)shape).lineTo(30.145905, 30.159922);
((GeneralPath)shape).lineTo(31.077913, 35.702087);
((GeneralPath)shape).curveTo(31.124516, 36.12149, 31.171116, 36.540897, 31.171116, 36.9137);
((GeneralPath)shape).curveTo(31.171116, 38.684517, 30.924955, 38.728924, 27.942526, 39.008526);
((GeneralPath)shape).lineTo(27.942526, 40.129135);
((GeneralPath)shape).lineTo(39.0, 40.129135);
((GeneralPath)shape).lineTo(39.0, 39.008526);
((GeneralPath)shape).moveTo(20.872404, 27.919804);
((GeneralPath)shape).lineTo(27.86248, 15.803673);
((GeneralPath)shape).lineTo(29.912903, 27.919804);
((GeneralPath)shape).lineTo(20.872404, 27.919804);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200600624084473f, 11.814530372619629f));
// _0_0_3
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200610160827637f, 13.814539909362793f));
// _0_0_4
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200650691986084f, 17.81454086303711f));
// _0_0_5
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200610160827637f, 19.81454086303711f));
// _0_0_6
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200560092926025f, 21.81454086303711f));
// _0_0_7
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.520056962966919f, 23.814550399780273f));
// _0_0_8
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200610160827637f, 25.81454086303711f));
// _0_0_9
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200610160827637f, 27.814550399780273f));
// _0_0_10
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.520056962966919f, 29.814550399780273f));
// _0_0_11
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_12 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200650691986084f, 31.81454086303711f));
// _0_0_12
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_13 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.520066022872925f, 33.81454849243164f));
// _0_0_13
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_13);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200700759887695f, 35.81454086303711f));
// _0_0_14
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_14);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_15 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200700759887695f, 37.81454849243164f));
// _0_0_15
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_15);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_16 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.520066022872925f, 39.81454849243164f));
// _0_0_16
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_16);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_17 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200610160827637f, 15.814539909362793f));
// _0_0_17
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_17);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_18 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200650691986084f, 41.81454086303711f));
// _0_0_18
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_18);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_19 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.520066022872925f, 43.81454849243164f));
// _0_0_19
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_19);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_20 = g.getTransform();
g.transform(new AffineTransform(0.4525499939918518f, 0.0f, 0.0f, -0.5324119925498962f, -2.5200700759887695f, 45.81454086303711f));
// _0_0_20
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_20);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_21 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 15.520009994506836f, 1.1854959726333618f));
// _0_0_21
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_21);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_22 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 21.52001953125f, 1.1854959726333618f));
// _0_0_22
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_22);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_23 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 23.52001953125f, 1.1854959726333618f));
// _0_0_23
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_23);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_24 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 25.52001953125f, 1.1854859590530396f));
// _0_0_24
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_24);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_25 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 27.520029067993164f, 1.1854859590530396f));
// _0_0_25
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_25);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_26 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 29.52001953125f, 1.1854959726333618f));
// _0_0_26
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_26);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_27 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 31.520029067993164f, 1.1854959726333618f));
// _0_0_27
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_27);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_28 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 33.5200309753418f, 1.1854859590530396f));
// _0_0_28
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_28);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_29 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 35.52001953125f, 1.1854959726333618f));
// _0_0_29
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_29);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_30 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 37.5200309753418f, 1.1854959726333618f));
// _0_0_30
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_30);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_31 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 39.52001953125f, 1.185505986213684f));
// _0_0_31
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_31);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_32 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 41.5200309753418f, 1.185505986213684f));
// _0_0_32
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_32);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_33 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 43.5200309753418f, 1.1854959726333618f));
// _0_0_33
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_33);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_34 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 19.52001953125f, 1.1854959726333618f));
// _0_0_34
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_34);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_35 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 45.52001953125f, 1.1854959726333618f));
// _0_0_35
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_35);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_36 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 47.5200309753418f, 1.1854959726333618f));
// _0_0_36
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_36);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_37 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 49.52001953125f, 1.185505986213684f));
// _0_0_37
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_37);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_38 = g.getTransform();
g.transform(new AffineTransform(-0.4525499939918518f, 0.0f, 0.0f, 0.5324119925498962f, 17.520000457763672f, -0.8144890069961548f));
// _0_0_38
paint = new Color(136, 138, 133, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.246136, 9.981962);
((GeneralPath)shape).curveTo(23.246136, 10.5006275, 22.751476, 10.921088, 22.141281, 10.921088);
((GeneralPath)shape).curveTo(21.531086, 10.921088, 21.036427, 10.5006275, 21.036427, 9.981962);
((GeneralPath)shape).curveTo(21.036427, 9.463297, 21.531086, 9.042836, 22.141281, 9.042836);
((GeneralPath)shape).curveTo(22.751476, 9.042836, 23.246136, 9.463297, 23.246136, 9.981962);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_38);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_39 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_39
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0249996f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(4.487087726593018, 3.5124998092651367, 39.01362228393555, 41.0338134765625);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_39);
g.setTransform(defaultTransform__0_0);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static int getOrigWidth() {
		return 48;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static int getOrigHeight() {
		return 47;
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
	public font_x_generic() {
        this.width = getOrigWidth();
        this.height = getOrigHeight();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconHeight()
	 */
    @Override
	public int getIconHeight() {
		return width;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconWidth()
	 */
    @Override
	public int getIconWidth() {
		return height;
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
		g2d.scale(coef, coef);
		paint(g2d);
		g2d.dispose();
	}
}

