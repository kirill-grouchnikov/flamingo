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
public class applications_multimedia implements
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
g.transform(new AffineTransform(0.02334889955818653f, 0.0f, 0.0f, 0.02086758054792881f, 45.33877944946289f, 41.867889404296875f));
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
paint = new RadialGradientPaint(new Point2D.Double(27.216266632080078, 35.67344665527344), 19.57143f, new Point2D.Double(27.216266632080078, 35.67344665527344), new float[] {0.0f,1.0f}, new Color[] {new Color(93, 93, 93, 255),new Color(68, 68, 68, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.8831369876861572f, 5.542409240160545E-23f, 8.493708911636602E-23f, 2.136046886444092f, -64.96822357177734f, -52.48585891723633f));
shape = new RoundRectangle2D.Double(5.428570747375488, 16.571430206298828, 38.142860412597656, 27.999996185302734, 2.2857143878936768, 2.2857143878936768);
g.setPaint(paint);
g.fill(shape);
paint = new Color(27, 27, 27, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(5.428570747375488, 16.571430206298828, 38.142860412597656, 27.999996185302734, 2.2857143878936768, 2.2857143878936768);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.3115578f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new LinearGradientPaint(new Point2D.Double(5.4635009765625, 13.142847061157227), new Point2D.Double(21.536487579345703, 49.14284896850586), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.99999964f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(6.392072677612305, 17.489294052124023, 36.0729866027832, 26.06022071838379, 0.5474439263343811, 0.5474439263343811);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(-0.9727100133895874f, 0.23202300071716309f, 0.23202300071716309f, 0.9727100133895874f, 45.785789489746094f, 5.110630989074707f));
// _0_0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3_0 = g.getTransform();
g.transform(new AffineTransform(0.9744070172309875f, -0.22479000687599182f, 0.22479000687599182f, 0.9744070172309875f, 0.0f, 0.0f));
// _0_0_3_0
paint = new LinearGradientPaint(new Point2D.Double(2.76123309135437, 6.110250473022461), new Point2D.Double(18.772916793823242, 18.693317413330078), new float[] {0.0f,1.0f}, new Color[] {new Color(253, 253, 253, 255),new Color(212, 212, 212, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new RoundRectangle2D.Double(1.7052063941955566, 10.353170394897461, 39.80599594116211, 6.508790016174316, 2.2857143878936768, 2.2857143878936768);
g.setPaint(paint);
g.fill(shape);
paint = new Color(43, 43, 43, 255);
stroke = new BasicStroke(1.0000002f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(1.7052063941955566, 10.353170394897461, 39.80599594116211, 6.508790016174316, 2.2857143878936768, 2.2857143878936768);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_3_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_1
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.189639, 8.969182);
((GeneralPath)shape).lineTo(6.7610674, 15.540611);
((GeneralPath)shape).lineTo(11.475352, 14.254897);
((GeneralPath)shape).lineTo(13.903923, 7.9691825);
((GeneralPath)shape).lineTo(9.189639, 8.969182);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_2
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.332497, 6.8977537);
((GeneralPath)shape).lineTo(16.046782, 13.397754);
((GeneralPath)shape).lineTo(20.761066, 12.254897);
((GeneralPath)shape).lineTo(23.046782, 5.8977537);
((GeneralPath)shape).lineTo(18.332497, 6.8977537);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_3
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(27.903923, 4.6834683);
((GeneralPath)shape).lineTo(25.618208, 11.11204);
((GeneralPath)shape).lineTo(30.332495, 9.969183);
((GeneralPath)shape).lineTo(32.61821, 3.6834683);
((GeneralPath)shape).lineTo(27.903923, 4.6834683);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3_4
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.412853, 2.0182896);
((GeneralPath)shape).curveTo(39.641926, 2.1743436, 39.814095, 2.3819106, 39.881603, 2.6745396);
((GeneralPath)shape).lineTo(40.613747, 5.7504325);
((GeneralPath)shape).lineTo(39.89053, 7.7504325);
((GeneralPath)shape).lineTo(35.20303, 8.835254);
((GeneralPath)shape).lineTo(37.48428, 2.478111);
((GeneralPath)shape).lineTo(39.412853, 2.0182896);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3_5 = g.getTransform();
g.transform(new AffineTransform(0.9744070172309875f, -0.22479000687599182f, 0.22479000687599182f, 0.9744070172309875f, 0.0f, 0.0f));
// _0_0_3_5
paint = new Color(255, 255, 255, 147);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(2.6716551780700684, 11.327117919921875, 37.84284210205078, 4.6068902015686035, 0.5301277041435242, 0.5301277041435242);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_3_5);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(0.9744070172309875f, -0.22479000687599182f, 0.22479000687599182f, 0.9744070172309875f, 0.0f, 0.0f));
// _0_0_4
paint = new LinearGradientPaint(new Point2D.Double(2.76123309135437, 6.110250473022461), new Point2D.Double(18.772916793823242, 18.693317413330078), new float[] {0.0f,1.0f}, new Color[] {new Color(253, 253, 253, 255),new Color(212, 212, 212, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.5996659994125366f, -0.5781679749488831f));
shape = new RoundRectangle2D.Double(0.6704310178756714, 9.685151100158691, 40.077335357666016, 6.941572666168213, 2.285710573196411, 2.285710573196411);
g.setPaint(paint);
g.fill(shape);
paint = new Color(46, 46, 46, 255);
stroke = new BasicStroke(0.99999833f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(0.6704310178756714, 9.685151100158691, 40.077335357666016, 6.941572666168213, 2.285710573196411, 2.285710573196411);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(10.142858, 8.142858);
((GeneralPath)shape).lineTo(7.714286, 14.714286);
((GeneralPath)shape).lineTo(12.428572, 13.428572);
((GeneralPath)shape).lineTo(14.857143, 7.142857);
((GeneralPath)shape).lineTo(10.142858, 8.142858);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.428574, 5.785714);
((GeneralPath)shape).lineTo(16.785715, 12.785715);
((GeneralPath)shape).lineTo(21.500002, 11.642858);
((GeneralPath)shape).lineTo(24.142859, 4.7857146);
((GeneralPath)shape).lineTo(19.428574, 5.785714);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.071428, 3.6428573);
((GeneralPath)shape).lineTo(26.499998, 10.785715);
((GeneralPath)shape).lineTo(31.214285, 9.642858);
((GeneralPath)shape).lineTo(33.785713, 2.6428573);
((GeneralPath)shape).lineTo(29.071428, 3.6428573);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(41.294643, 0.9776787);
((GeneralPath)shape).curveTo(41.523716, 1.1337326, 41.695885, 1.3412997, 41.763393, 1.6339287);
((GeneralPath)shape).lineTo(42.424107, 4.28125);
((GeneralPath)shape).lineTo(41.34375, 7.0669646);
((GeneralPath)shape).lineTo(36.22768, 8.294643);
((GeneralPath)shape).lineTo(38.580357, 1.5803572);
((GeneralPath)shape).lineTo(41.294643, 0.9776787);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(0.9744070172309875f, -0.22479000687599182f, 0.22479000687599182f, 0.9744070172309875f, 0.0f, 0.0f));
// _0_0_9
paint = new Color(255, 255, 255, 147);
stroke = new BasicStroke(0.9999981f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(1.636876106262207, 10.659098625183105, 38.19930648803711, 4.914705753326416, 0.5301267504692078, 0.5301267504692078);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
paint = new LinearGradientPaint(new Point2D.Double(10.678570747375488, 15.928571701049805), new Point2D.Double(7.9285712242126465, 11.107142448425293), new float[] {0.0f,1.0f}, new Color[] {new Color(147, 147, 147, 255),new Color(217, 217, 217, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.535714, 10.892862);
((GeneralPath)shape).lineTo(6.535714, 18.678576);
((GeneralPath)shape).curveTo(6.535714, 19.142862, 6.9285717, 19.571434, 7.392857, 19.607147);
((GeneralPath)shape).lineTo(15.285713, 19.607147);
((GeneralPath)shape).curveTo(16.149378, 19.607147, 16.559574, 18.345297, 15.892855, 17.678576);
((GeneralPath)shape).lineTo(9.678572, 10.392862);
((GeneralPath)shape).curveTo(8.714286, 9.000005, 6.535714, 9.678576, 6.535714, 10.892862);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(27, 27, 27, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.535714, 10.892862);
((GeneralPath)shape).lineTo(6.535714, 18.678576);
((GeneralPath)shape).curveTo(6.535714, 19.142862, 6.9285717, 19.571434, 7.392857, 19.607147);
((GeneralPath)shape).lineTo(15.285713, 19.607147);
((GeneralPath)shape).curveTo(16.149378, 19.607147, 16.559574, 18.345297, 15.892855, 17.678576);
((GeneralPath)shape).lineTo(9.678572, 10.392862);
((GeneralPath)shape).curveTo(8.714286, 9.000005, 6.535714, 9.678576, 6.535714, 10.892862);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.07142885774374008f, -4.964284896850586f));
// _0_0_11
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.035715, 17.196428);
((GeneralPath)shape).curveTo(9.035715, 17.46271, 8.819853, 17.678572, 8.553572, 17.678572);
((GeneralPath)shape).curveTo(8.287292, 17.678572, 8.071429, 17.46271, 8.071429, 17.196428);
((GeneralPath)shape).curveTo(8.071429, 16.930147, 8.287292, 16.714285, 8.553572, 16.714285);
((GeneralPath)shape).curveTo(8.819853, 16.714285, 9.035715, 16.930147, 9.035715, 17.196428);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_12 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.07142884284257889f, 0.3214290142059326f));
// _0_0_12
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.035715, 17.196428);
((GeneralPath)shape).curveTo(9.035715, 17.46271, 8.819853, 17.678572, 8.553572, 17.678572);
((GeneralPath)shape).curveTo(8.287292, 17.678572, 8.071429, 17.46271, 8.071429, 17.196428);
((GeneralPath)shape).curveTo(8.071429, 16.930147, 8.287292, 16.714285, 8.553572, 16.714285);
((GeneralPath)shape).curveTo(8.819853, 16.714285, 9.035715, 16.930147, 9.035715, 17.196428);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_13 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.964284896850586f, 0.3214290142059326f));
// _0_0_13
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.035715, 17.196428);
((GeneralPath)shape).curveTo(9.035715, 17.46271, 8.819853, 17.678572, 8.553572, 17.678572);
((GeneralPath)shape).curveTo(8.287292, 17.678572, 8.071429, 17.46271, 8.071429, 17.196428);
((GeneralPath)shape).curveTo(8.071429, 16.930147, 8.287292, 16.714285, 8.553572, 16.714285);
((GeneralPath)shape).curveTo(8.819853, 16.714285, 9.035715, 16.930147, 9.035715, 17.196428);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_13);
g.setComposite(AlphaComposite.getInstance(3, 0.2613065f * origAlpha));
AffineTransform defaultTransform__0_0_14 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
// _0_0_14
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_0
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(10.0, 28.428572);
((GeneralPath)shape).lineTo(38.0, 28.428572);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_14_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_1
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(10.0, 32.571423);
((GeneralPath)shape).lineTo(38.0, 32.571423);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_14_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_2
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(32.5, 28.0);
((GeneralPath)shape).lineTo(32.5, 24.0);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_14_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_3
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(10.0, 32.571423);
((GeneralPath)shape).lineTo(38.0, 32.571423);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_14_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_4
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(22.5, 28.0);
((GeneralPath)shape).lineTo(22.5, 24.0);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_14_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14_5
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(0.9999997f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.742934, 36.571423);
((GeneralPath)shape).lineTo(23.042767, 36.571423);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_14_5);
g.setTransform(defaultTransform__0_0_14);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_15 = g.getTransform();
g.transform(new AffineTransform(0.6880559921264648f, 0.0f, 0.0f, 0.6880559921264648f, 11.981889724731445f, 14.733309745788574f));
// _0_0_15
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_15_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15_0
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(13.817087, 27.83871);
((GeneralPath)shape).curveTo(13.930688, 28.803867, 14.061948, 29.766424, 14.212013, 30.726635);
((GeneralPath)shape).lineTo(12.104297, 31.841955);
((GeneralPath)shape).curveTo(11.971325, 30.898586, 11.859805, 29.948673, 11.653276, 29.01819);
((GeneralPath)shape).lineTo(13.817087, 27.83871);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_15_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_15_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15_1
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.665062, 28.673199);
((GeneralPath)shape).curveTo(17.64089, 30.752445, 18.343061, 29.86598, 15.754098, 31.262302);
((GeneralPath)shape).curveTo(16.56951, 29.95874, 17.94573, 28.643936, 19.302723, 29.817297);
((GeneralPath)shape).curveTo(21.893911, 30.23897, 17.868876, 32.299286, 19.657894, 30.131624);
((GeneralPath)shape).curveTo(22.257908, 27.86176, 21.8802, 29.134104, 24.062214, 29.26306);
((GeneralPath)shape).curveTo(25.842436, 29.693266, 25.858406, 29.319391, 23.49196, 30.679722);
((GeneralPath)shape).curveTo(23.523989, 30.651796, 23.556019, 30.623873, 23.588047, 30.59595);
((GeneralPath)shape).lineTo(25.826668, 29.648989);
((GeneralPath)shape).curveTo(25.801378, 29.687677, 25.776087, 29.726368, 25.750797, 29.765057);
((GeneralPath)shape).curveTo(22.939447, 31.442532, 24.0824, 30.948809, 22.103508, 30.691366);
((GeneralPath)shape).curveTo(20.237158, 30.363682, 19.228119, 30.138071, 21.88267, 29.206652);
((GeneralPath)shape).curveTo(20.743225, 30.50057, 18.901455, 32.506542, 17.26407, 31.089586);
((GeneralPath)shape).curveTo(15.675562, 29.919043, 19.396606, 28.676254, 18.028685, 30.358606);
((GeneralPath)shape).curveTo(15.346131, 31.837217, 15.628223, 31.910467, 15.467942, 29.792686);
((GeneralPath)shape).lineTo(17.665062, 28.673199);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_15_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_15_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15_2
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.174994, 26.23079);
((GeneralPath)shape).curveTo(29.320925, 27.738745, 29.40078, 29.250332, 29.580135, 30.755472);
((GeneralPath)shape).curveTo(31.003609, 32.606216, 27.753159, 35.38944, 28.23291, 32.564304);
((GeneralPath)shape).curveTo(28.574991, 29.320496, 28.88323, 28.720137, 31.761658, 27.684322);
((GeneralPath)shape).curveTo(32.309345, 28.667665, 32.60939, 29.822268, 33.465683, 30.412281);
((GeneralPath)shape).curveTo(28.625607, 32.96395, 35.159428, 28.931067, 35.886627, 28.54494);
((GeneralPath)shape).curveTo(36.351547, 28.435797, 36.82648, 28.379616, 37.298916, 28.31419);
((GeneralPath)shape).lineTo(35.37816, 29.751503);
((GeneralPath)shape).curveTo(34.913315, 29.81957, 34.443104, 29.870403, 33.993176, 30.012669);
((GeneralPath)shape).curveTo(36.991756, 28.1011, 33.42477, 30.854559, 31.487156, 31.83022);
((GeneralPath)shape).curveTo(30.56341, 31.105995, 30.343693, 29.935795, 29.703924, 28.949905);
((GeneralPath)shape).curveTo(32.849915, 26.7311, 30.336554, 28.808674, 30.341827, 31.527237);
((GeneralPath)shape).curveTo(30.058287, 33.87733, 27.021652, 35.07712, 27.526846, 31.833696);
((GeneralPath)shape).curveTo(27.354082, 30.35189, 27.276842, 28.851328, 26.996746, 27.386362);
((GeneralPath)shape).lineTo(29.174994, 26.23079);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_15_2);
g.setTransform(defaultTransform__0_0_15);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_16 = g.getTransform();
g.transform(new AffineTransform(1.013962984085083f, 0.0f, 0.0f, 1.013962984085083f, 1.8785560131072998f, 5.469082832336426f));
// _0_0_16
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_16_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16_0
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.316278, 22.373913);
((GeneralPath)shape).curveTo(13.137134, 21.040705, 12.443447, 22.092821, 12.444714, 23.52077);
((GeneralPath)shape).curveTo(12.430049, 24.807117, 12.620598, 26.07765, 12.907135, 27.327364);
((GeneralPath)shape).lineTo(11.644224, 28.009508);
((GeneralPath)shape).curveTo(11.357063, 26.749617, 11.164834, 25.469172, 11.168897, 24.173075);
((GeneralPath)shape).curveTo(11.149082, 22.620295, 10.880245, 22.220438, 12.516062, 21.502216);
((GeneralPath)shape).lineTo(11.316278, 22.373913);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_16_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_16_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16_1
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.610946, 22.41318);
((GeneralPath)shape).curveTo(15.586578, 23.203484, 15.586964, 23.994452, 15.583955, 24.785078);
((GeneralPath)shape).curveTo(15.582875, 25.117014, 15.582924, 25.448948, 15.582616, 25.780884);
((GeneralPath)shape).lineTo(14.317899, 26.425287);
((GeneralPath)shape).curveTo(14.317592, 26.093807, 14.317641, 25.762327, 14.316561, 25.43085);
((GeneralPath)shape).curveTo(14.313575, 24.649393, 14.314193, 23.867575, 14.28957, 23.086454);
((GeneralPath)shape).lineTo(15.610946, 22.41318);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_16_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_16_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16_2
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.83328, 21.200996);
((GeneralPath)shape).curveTo(17.93205, 21.997349, 17.950388, 22.856152, 17.97843, 23.673826);
((GeneralPath)shape).curveTo(17.986397, 23.914997, 17.991625, 24.156242, 17.998222, 24.397451);
((GeneralPath)shape).lineTo(16.740671, 25.042643);
((GeneralPath)shape).curveTo(16.73285, 24.802517, 16.72747, 24.56231, 16.717205, 24.322264);
((GeneralPath)shape).curveTo(16.68142, 23.507154, 16.675482, 22.674053, 16.511906, 21.874271);
((GeneralPath)shape).lineTo(17.83328, 21.200996);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_16_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_16_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16_3
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.257647, 20.594904);
((GeneralPath)shape).curveTo(20.061483, 21.277119, 19.988798, 21.990784, 19.91999, 22.698524);
((GeneralPath)shape).curveTo(19.852596, 23.459764, 19.822369, 24.223412, 19.791332, 24.986753);
((GeneralPath)shape).lineTo(18.53422, 25.621449);
((GeneralPath)shape).curveTo(18.564177, 24.858063, 18.593786, 24.094534, 18.649765, 23.332489);
((GeneralPath)shape).curveTo(18.705132, 22.644365, 18.73276, 21.926924, 18.936272, 21.268179);
((GeneralPath)shape).lineTo(20.257647, 20.594904);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_16_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_16_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16_4
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.896926, 22.310339);
((GeneralPath)shape).curveTo(10.803649, 22.501266, 11.723703, 22.658903, 12.639116, 22.814075);
((GeneralPath)shape).curveTo(14.789061, 23.146229, 16.945692, 23.441011, 19.10721, 23.68769);
((GeneralPath)shape).curveTo(20.011148, 23.780203, 20.914436, 23.87797, 21.81681, 23.984419);
((GeneralPath)shape).lineTo(20.64879, 24.810816);
((GeneralPath)shape).curveTo(19.754597, 24.700327, 18.859587, 24.597013, 17.963955, 24.498589);
((GeneralPath)shape).curveTo(15.801624, 24.238152, 13.642863, 23.94389, 11.488982, 23.62143);
((GeneralPath)shape).curveTo(10.560864, 23.472229, 9.627104, 23.290016, 8.697142, 23.182034);
((GeneralPath)shape).lineTo(9.896926, 22.310339);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_16_4);
g.setTransform(defaultTransform__0_0_16);
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
		return 48;
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
	public applications_multimedia() {
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

