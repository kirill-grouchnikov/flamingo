package utest.svg.transcoded;

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
import java.awt.geom.RoundRectangle2D;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/flamingo">Flamingo SVG transcoder</a>.
 */
public class Applications_multimedia implements
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
g.setComposite(AlphaComposite.getInstance(3, 0.74372f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -0.8571400046348572f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(24.64299964904785, 44.2859992980957), 22.071f, new Point2D.Double(24.64299964904785, 44.2859992980957), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.20712000131607056f, 0.0f, 35.112998962402344f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(46.714, 44.286);
((GeneralPath)shape).curveTo(46.714, 46.810772, 36.832253, 48.857502, 24.6425, 48.857502);
((GeneralPath)shape).curveTo(12.452746, 48.857502, 2.5709991, 46.810772, 2.5709991, 44.286);
((GeneralPath)shape).curveTo(2.5709991, 41.761227, 12.452746, 39.714497, 24.6425, 39.714497);
((GeneralPath)shape).curveTo(36.832253, 39.714497, 46.714, 41.761227, 46.714, 44.286);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new RadialGradientPaint(new Point2D.Double(27.215999603271484, 35.67300033569336), 19.571f, new Point2D.Double(27.215999603271484, 35.67300033569336), new float[] {0.0f,1.0f}, new Color[] {new Color(93, 93, 93, 255),new Color(68, 68, 68, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.8831000328063965f, 5.542399773829683E-23f, 8.493700076394464E-23f, 2.135999917984009f, -64.96800231933594f, -52.486000061035156f));
shape = new RoundRectangle2D.Double(5.428599834442139, 16.570999145507812, 38.143001556396484, 28.0, 2.285799980163574, 2.285799980163574);
g.setPaint(paint);
g.fill(shape);
paint = new Color(27, 27, 27, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(5.428599834442139, 16.570999145507812, 38.143001556396484, 28.0, 2.285799980163574, 2.285799980163574);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.31156f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new LinearGradientPaint(new Point2D.Double(5.463500022888184, 13.142999649047852), new Point2D.Double(21.535999298095703, 49.143001556396484), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(6.392099857330322, 17.48900032043457, 36.073001861572266, 26.059999465942383, 0.5474399924278259, 0.5474399924278259);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(-0.9727100133895874f, 0.23202000558376312f, 0.23202000558376312f, 0.9727100133895874f, 45.7859992980957f, 5.110599994659424f));
// _0_0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3_0 = g.getTransform();
g.transform(new AffineTransform(0.974405387304794f, -0.22479800086164992f, 0.22479800086164992f, 0.974405387304794f, 0.0f, 0.0f));
// _0_0_3_0
paint = new LinearGradientPaint(new Point2D.Double(2.761199951171875, 6.110300064086914), new Point2D.Double(18.773000717163086, 18.69300079345703), new float[] {0.0f,1.0f}, new Color[] {new Color(253, 253, 253, 255),new Color(212, 212, 212, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new RoundRectangle2D.Double(1.705199956893921, 10.352999687194824, 39.805999755859375, 6.508800029754639, 2.285799980163574, 2.285799980163574);
g.setPaint(paint);
g.fill(shape);
paint = new Color(43, 43, 43, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(1.705199956893921, 10.352999687194824, 39.805999755859375, 6.508800029754639, 2.285799980163574, 2.285799980163574);
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
((GeneralPath)shape).moveTo(9.1896, 8.9692);
((GeneralPath)shape).lineTo(6.7611, 15.541);
((GeneralPath)shape).lineTo(11.475, 14.255);
((GeneralPath)shape).lineTo(13.904, 7.9692);
((GeneralPath)shape).lineTo(9.1896, 8.9692);
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
((GeneralPath)shape).moveTo(18.332, 6.8978);
((GeneralPath)shape).lineTo(16.047, 13.398);
((GeneralPath)shape).lineTo(20.761002, 12.255);
((GeneralPath)shape).lineTo(23.047, 5.8978);
((GeneralPath)shape).lineTo(18.332, 6.8978);
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
((GeneralPath)shape).moveTo(27.904, 4.6835);
((GeneralPath)shape).lineTo(25.618, 11.1119995);
((GeneralPath)shape).lineTo(30.332, 9.969199);
((GeneralPath)shape).lineTo(32.618, 3.6834993);
((GeneralPath)shape).lineTo(27.904, 4.6834993);
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
((GeneralPath)shape).moveTo(39.413, 2.0183);
((GeneralPath)shape).curveTo(39.642, 2.1743, 39.814, 2.3819, 39.882, 2.6745);
((GeneralPath)shape).lineTo(40.614, 5.7504);
((GeneralPath)shape).lineTo(39.891, 7.7504);
((GeneralPath)shape).lineTo(35.203, 8.8353);
((GeneralPath)shape).lineTo(37.483997, 2.4781003);
((GeneralPath)shape).lineTo(39.413, 2.0183003);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3_5 = g.getTransform();
g.transform(new AffineTransform(0.974405387304794f, -0.22479800086164992f, 0.22479800086164992f, 0.974405387304794f, 0.0f, 0.0f));
// _0_0_3_5
paint = new Color(255, 255, 255, 147);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(2.6717000007629395, 11.32699966430664, 37.84299850463867, 4.606900215148926, 0.5301200151443481, 0.5301200151443481);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_3_5);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(0.974405387304794f, -0.22479800086164992f, 0.22479800086164992f, 0.974405387304794f, 0.0f, 0.0f));
// _0_0_4
paint = new LinearGradientPaint(new Point2D.Double(2.761199951171875, 6.110300064086914), new Point2D.Double(18.773000717163086, 18.69300079345703), new float[] {0.0f,1.0f}, new Color[] {new Color(253, 253, 253, 255),new Color(212, 212, 212, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.5996699929237366f, -0.5781700015068054f));
shape = new RoundRectangle2D.Double(0.6704300045967102, 9.685199737548828, 40.07699966430664, 6.9415998458862305, 2.285799980163574, 2.285799980163574);
g.setPaint(paint);
g.fill(shape);
paint = new Color(46, 46, 46, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(0.6704300045967102, 9.685199737548828, 40.07699966430664, 6.9415998458862305, 2.285799980163574, 2.285799980163574);
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
((GeneralPath)shape).moveTo(10.143, 8.1429);
((GeneralPath)shape).lineTo(7.7142997, 14.714001);
((GeneralPath)shape).lineTo(12.429, 13.429001);
((GeneralPath)shape).lineTo(14.857, 7.142901);
((GeneralPath)shape).lineTo(10.143, 8.1429);
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
((GeneralPath)shape).moveTo(19.429, 5.7857);
((GeneralPath)shape).lineTo(16.786001, 12.785999);
((GeneralPath)shape).lineTo(21.500002, 11.643);
((GeneralPath)shape).lineTo(24.143002, 4.7857);
((GeneralPath)shape).lineTo(19.429, 5.7857);
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
((GeneralPath)shape).moveTo(29.071, 3.6429);
((GeneralPath)shape).lineTo(26.5, 10.785999);
((GeneralPath)shape).lineTo(31.214, 9.6428995);
((GeneralPath)shape).lineTo(33.786, 2.6428995);
((GeneralPath)shape).lineTo(29.071, 3.6428995);
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
((GeneralPath)shape).moveTo(41.295, 0.97768);
((GeneralPath)shape).curveTo(41.524, 1.1337, 41.696, 1.3413, 41.762997, 1.6339);
((GeneralPath)shape).lineTo(42.423996, 4.2813);
((GeneralPath)shape).lineTo(41.343994, 7.0670004);
((GeneralPath)shape).lineTo(36.227993, 8.2946005);
((GeneralPath)shape).lineTo(38.579994, 1.5804005);
((GeneralPath)shape).lineTo(41.294994, 0.97768044);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(0.974405387304794f, -0.22479800086164992f, 0.22479800086164992f, 0.974405387304794f, 0.0f, 0.0f));
// _0_0_9
paint = new Color(255, 255, 255, 147);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(1.6368999481201172, 10.659000396728516, 38.19900131225586, 4.914700031280518, 0.5301200151443481, 0.5301200151443481);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
paint = new LinearGradientPaint(new Point2D.Double(10.678999900817871, 15.928999900817871), new Point2D.Double(7.928599834442139, 11.107000350952148), new float[] {0.0f,1.0f}, new Color[] {new Color(147, 147, 147, 255),new Color(217, 217, 217, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.5357, 10.893);
((GeneralPath)shape).lineTo(6.5357, 18.678999);
((GeneralPath)shape).curveTo(6.5357, 19.143, 6.9286, 19.571, 7.3929, 19.606998);
((GeneralPath)shape).lineTo(15.285999, 19.606998);
((GeneralPath)shape).curveTo(16.149, 19.606998, 16.56, 18.345, 15.893, 17.678999);
((GeneralPath)shape).lineTo(9.6786, 10.393);
((GeneralPath)shape).curveTo(8.7143, 9.0, 6.5357003, 9.678599, 6.5357003, 10.893);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(27, 27, 27, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.5357, 10.893);
((GeneralPath)shape).lineTo(6.5357, 18.678999);
((GeneralPath)shape).curveTo(6.5357, 19.143, 6.9286, 19.571, 7.3929, 19.606998);
((GeneralPath)shape).lineTo(15.285999, 19.606998);
((GeneralPath)shape).curveTo(16.149, 19.606998, 16.56, 18.345, 15.893, 17.678999);
((GeneralPath)shape).lineTo(9.6786, 10.393);
((GeneralPath)shape).curveTo(8.7143, 9.0, 6.5357003, 9.678599, 6.5357003, 10.893);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.07142899930477142f, -4.964300155639648f));
// _0_0_11
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.0357, 17.196);
((GeneralPath)shape).curveTo(9.0357, 17.368256, 8.943803, 17.527426, 8.794625, 17.613554);
((GeneralPath)shape).curveTo(8.645447, 17.69968, 8.461653, 17.69968, 8.312474, 17.613554);
((GeneralPath)shape).curveTo(8.163297, 17.527426, 8.0714, 17.368256, 8.0714, 17.196);
((GeneralPath)shape).curveTo(8.0714, 17.023743, 8.163297, 16.864573, 8.312474, 16.778444);
((GeneralPath)shape).curveTo(8.461653, 16.692318, 8.645447, 16.692318, 8.794625, 16.778444);
((GeneralPath)shape).curveTo(8.943803, 16.864573, 9.0357, 17.023743, 9.0357, 17.196);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_12 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.07142899930477142f, 0.3214299976825714f));
// _0_0_12
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.0357, 17.196);
((GeneralPath)shape).curveTo(9.0357, 17.368256, 8.943803, 17.527426, 8.794625, 17.613554);
((GeneralPath)shape).curveTo(8.645447, 17.69968, 8.461653, 17.69968, 8.312474, 17.613554);
((GeneralPath)shape).curveTo(8.163297, 17.527426, 8.0714, 17.368256, 8.0714, 17.196);
((GeneralPath)shape).curveTo(8.0714, 17.023743, 8.163297, 16.864573, 8.312474, 16.778444);
((GeneralPath)shape).curveTo(8.461653, 16.692318, 8.645447, 16.692318, 8.794625, 16.778444);
((GeneralPath)shape).curveTo(8.943803, 16.864573, 9.0357, 17.023743, 9.0357, 17.196);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_13 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 4.964300155639648f, 0.3214299976825714f));
// _0_0_13
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.0357, 17.196);
((GeneralPath)shape).curveTo(9.0357, 17.368256, 8.943803, 17.527426, 8.794625, 17.613554);
((GeneralPath)shape).curveTo(8.645447, 17.69968, 8.461653, 17.69968, 8.312474, 17.613554);
((GeneralPath)shape).curveTo(8.163297, 17.527426, 8.0714, 17.368256, 8.0714, 17.196);
((GeneralPath)shape).curveTo(8.0714, 17.023743, 8.163297, 16.864573, 8.312474, 16.778444);
((GeneralPath)shape).curveTo(8.461653, 16.692318, 8.645447, 16.692318, 8.794625, 16.778444);
((GeneralPath)shape).curveTo(8.943803, 16.864573, 9.0357, 17.023743, 9.0357, 17.196);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_13);
g.setComposite(AlphaComposite.getInstance(3, 0.26131f * origAlpha));
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
((GeneralPath)shape).moveTo(10.0, 28.429);
((GeneralPath)shape).lineTo(38.0, 28.429);
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
((GeneralPath)shape).moveTo(10.0, 32.571);
((GeneralPath)shape).lineTo(38.0, 32.571);
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
((GeneralPath)shape).moveTo(10.0, 32.571);
((GeneralPath)shape).lineTo(38.0, 32.571);
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
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.7429, 36.571);
((GeneralPath)shape).lineTo(23.0429, 36.571);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_14_5);
g.setTransform(defaultTransform__0_0_14);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_15 = g.getTransform();
g.transform(new AffineTransform(0.6880599856376648f, 0.0f, 0.0f, 0.6880599856376648f, 11.982000350952148f, 14.732999801635742f));
// _0_0_15
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_15_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15_0
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(13.817, 27.839);
((GeneralPath)shape).curveTo(13.931001, 28.804, 14.062, 29.766, 14.212001, 30.727001);
((GeneralPath)shape).lineTo(12.104001, 31.842001);
((GeneralPath)shape).curveTo(11.971001, 30.899, 11.860001, 29.949001, 11.653001, 29.018002);
((GeneralPath)shape).lineTo(13.817001, 27.839);
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
((GeneralPath)shape).moveTo(17.665, 28.673);
((GeneralPath)shape).curveTo(17.641, 30.752, 18.343, 29.866001, 15.754001, 31.262001);
((GeneralPath)shape).curveTo(16.57, 29.959002, 17.946001, 28.644001, 19.303001, 29.817001);
((GeneralPath)shape).curveTo(21.894001, 30.239002, 17.869001, 32.299, 19.658, 30.132002);
((GeneralPath)shape).curveTo(22.258001, 27.862001, 21.880001, 29.134003, 24.062, 29.263002);
((GeneralPath)shape).curveTo(25.842001, 29.693003, 25.858, 29.319002, 23.492, 30.680002);
((GeneralPath)shape).lineTo(23.588001, 30.596003);
((GeneralPath)shape).lineTo(25.827002, 29.649002);
((GeneralPath)shape).curveTo(25.801003, 29.688002, 25.776001, 29.726002, 25.751001, 29.765001);
((GeneralPath)shape).curveTo(22.939001, 31.443, 24.082, 30.949001, 22.104002, 30.691002);
((GeneralPath)shape).curveTo(20.237001, 30.364002, 19.228003, 30.138002, 21.883001, 29.207003);
((GeneralPath)shape).curveTo(20.743002, 30.501003, 18.901001, 32.507004, 17.264002, 31.090002);
((GeneralPath)shape).curveTo(15.676002, 29.919003, 19.397001, 28.676003, 18.029001, 30.359001);
((GeneralPath)shape).curveTo(15.346001, 31.837002, 15.628001, 31.910002, 15.468001, 29.793001);
((GeneralPath)shape).lineTo(17.665, 28.673);
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
((GeneralPath)shape).moveTo(29.175, 26.231);
((GeneralPath)shape).curveTo(29.321, 27.739, 29.401, 29.25, 29.58, 30.755001);
((GeneralPath)shape).curveTo(31.004, 32.606003, 27.753, 35.389, 28.233, 32.564003);
((GeneralPath)shape).curveTo(28.575, 29.320004, 28.883, 28.720003, 31.762, 27.684002);
((GeneralPath)shape).curveTo(32.309, 28.668001, 32.608997, 29.822002, 33.466, 30.412003);
((GeneralPath)shape).curveTo(28.626, 32.964005, 35.159, 28.931004, 35.887, 28.545002);
((GeneralPath)shape).curveTo(36.352, 28.436003, 36.826, 28.380001, 37.299, 28.314001);
((GeneralPath)shape).lineTo(35.378, 29.752);
((GeneralPath)shape).curveTo(34.913, 29.820002, 34.442997, 29.87, 33.993, 30.013);
((GeneralPath)shape).curveTo(36.992, 28.101, 33.425, 30.855, 31.487, 31.83);
((GeneralPath)shape).curveTo(30.563, 31.105999, 30.344, 29.936, 29.703999, 28.95);
((GeneralPath)shape).curveTo(32.85, 26.731, 30.336998, 28.809, 30.342, 31.527);
((GeneralPath)shape).curveTo(30.057999, 33.877, 27.022, 35.077, 27.526999, 31.834);
((GeneralPath)shape).curveTo(27.353998, 30.352, 27.276999, 28.851, 26.996998, 27.386);
((GeneralPath)shape).lineTo(29.174997, 26.230999);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_15_2);
g.setTransform(defaultTransform__0_0_15);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_16 = g.getTransform();
g.transform(new AffineTransform(1.0140000581741333f, 0.0f, 0.0f, 1.0140000581741333f, 1.878600001335144f, 5.469099998474121f));
// _0_0_16
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_16_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16_0
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.316, 22.374);
((GeneralPath)shape).curveTo(13.137, 21.041, 12.443, 22.093, 12.445, 23.521);
((GeneralPath)shape).curveTo(12.429999, 24.807, 12.620999, 26.078, 12.907, 27.327);
((GeneralPath)shape).lineTo(11.643999, 28.01);
((GeneralPath)shape).curveTo(11.356999, 26.75, 11.164999, 25.469, 11.168999, 24.173);
((GeneralPath)shape).curveTo(11.148998, 22.62, 10.879999, 22.220001, 12.515999, 21.502);
((GeneralPath)shape).lineTo(11.315999, 22.374);
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
((GeneralPath)shape).moveTo(15.611, 22.413);
((GeneralPath)shape).curveTo(15.587, 23.203001, 15.587, 23.994, 15.584, 24.785);
((GeneralPath)shape).curveTo(15.582999, 25.117, 15.582999, 25.449, 15.582999, 25.781);
((GeneralPath)shape).lineTo(14.317999, 26.425);
((GeneralPath)shape).curveTo(14.317999, 26.094, 14.317999, 25.762, 14.3169985, 25.431);
((GeneralPath)shape).curveTo(14.313998, 24.649, 14.313998, 23.868, 14.289998, 23.086);
((GeneralPath)shape).lineTo(15.610998, 22.413);
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
((GeneralPath)shape).moveTo(17.833, 21.201);
((GeneralPath)shape).curveTo(17.932001, 21.997, 17.95, 22.856, 17.978, 23.674);
((GeneralPath)shape).curveTo(17.986, 23.914999, 17.992, 24.156, 17.998001, 24.397);
((GeneralPath)shape).lineTo(16.741001, 25.043);
((GeneralPath)shape).curveTo(16.733002, 24.803, 16.727001, 24.561998, 16.717001, 24.321999);
((GeneralPath)shape).curveTo(16.681002, 23.506998, 16.675001, 22.673998, 16.512001, 21.873999);
((GeneralPath)shape).lineTo(17.833, 21.200998);
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
((GeneralPath)shape).moveTo(20.258, 20.595);
((GeneralPath)shape).curveTo(20.060999, 21.276999, 19.989, 21.991, 19.92, 22.699);
((GeneralPath)shape).curveTo(19.853, 23.46, 19.822, 24.223, 19.791, 24.987);
((GeneralPath)shape).lineTo(18.534, 25.621);
((GeneralPath)shape).curveTo(18.564001, 24.858, 18.594, 24.095001, 18.65, 23.332);
((GeneralPath)shape).curveTo(18.705, 22.644001, 18.733, 21.927, 18.935999, 21.268002);
((GeneralPath)shape).lineTo(20.258, 20.595001);
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
((GeneralPath)shape).moveTo(9.8969, 22.31);
((GeneralPath)shape).curveTo(10.804, 22.501, 11.724, 22.659, 12.639, 22.814);
((GeneralPath)shape).curveTo(14.789, 23.146, 16.946, 23.441, 19.107, 23.688);
((GeneralPath)shape).curveTo(20.011, 23.779999, 20.914, 23.878, 21.817001, 23.984);
((GeneralPath)shape).lineTo(20.649002, 24.810999);
((GeneralPath)shape).curveTo(19.755003, 24.699999, 18.860003, 24.596998, 17.964003, 24.498999);
((GeneralPath)shape).curveTo(15.802003, 24.237999, 13.6430025, 23.943998, 11.489002, 23.620998);
((GeneralPath)shape).curveTo(10.561003, 23.471998, 9.627102, 23.289999, 8.697103, 23.182);
((GeneralPath)shape).lineTo(9.896902, 22.31);
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
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 2.230882406234741;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 44.48311996459961;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 48.0;
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
	public Applications_multimedia() {
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
    
    public static Applications_multimedia of(int width, int height) {
       Applications_multimedia result = new Applications_multimedia();
       result.width = width;
       result.height = height;
       return result;
    }
}

