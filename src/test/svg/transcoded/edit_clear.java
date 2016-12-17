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
import java.awt.geom.RoundRectangle2D;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class edit_clear implements
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
g.setComposite(AlphaComposite.getInstance(3, 0.47368422f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.4357800483703613f, 0.0f, 0.0f, 0.8257039785385132f, -5.050459861755371f, 13.431819915771484f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(22.571428298950195, 30.85714340209961), 15.571428f, new Point2D.Double(22.571428298950195, 30.85714340209961), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.6513760089874268f, 4.792387901721585E-15f, 10.757539749145508f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.142857, 30.857143);
((GeneralPath)shape).curveTo(38.142857, 36.45889, 31.171291, 41.0, 22.571428, 41.0);
((GeneralPath)shape).curveTo(13.971566, 41.0, 7.0, 36.45889, 7.0, 30.857143);
((GeneralPath)shape).curveTo(7.0, 25.255398, 13.971566, 20.714287, 22.571428, 20.714287);
((GeneralPath)shape).curveTo(31.171291, 20.714287, 38.142857, 25.255398, 38.142857, 30.857143);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new LinearGradientPaint(new Point2D.Double(12.23343276977539, 12.3632230758667), new Point2D.Double(16.870908737182617, 17.11094093322754), new float[] {0.0f,1.0f}, new Color[] {new Color(193, 125, 16, 255),new Color(155, 101, 12, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9659259915351868f, 0.26210200786590576f, -0.25881901383399963f, 0.978177011013031f, 2.9570720195770264f, -5.939741134643555f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.9163117, 1.7780186);
((GeneralPath)shape).curveTo(8.646088, 0.8999591, 11.042237, 1.7815151, 11.928102, 3.3353386);
((GeneralPath)shape).lineTo(16.098341, 12.820053);
((GeneralPath)shape).curveTo(16.984205, 14.373873, 16.731756, 16.189358, 15.532312, 16.890638);
((GeneralPath)shape).curveTo(14.332867, 17.591923, 12.654079, 16.90558, 11.768213, 15.351758);
((GeneralPath)shape).lineTo(5.84975, 6.996031);
((GeneralPath)shape).curveTo(4.9638853, 5.4422064, 5.2207537, 2.6387086, 6.9163117, 1.7780186);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(143, 89, 2, 255);
stroke = new BasicStroke(1.0063211f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.9163117, 1.7780186);
((GeneralPath)shape).curveTo(8.646088, 0.8999591, 11.042237, 1.7815151, 11.928102, 3.3353386);
((GeneralPath)shape).lineTo(16.098341, 12.820053);
((GeneralPath)shape).curveTo(16.984205, 14.373873, 16.731756, 16.189358, 15.532312, 16.890638);
((GeneralPath)shape).curveTo(14.332867, 17.591923, 12.654079, 16.90558, 11.768213, 15.351758);
((GeneralPath)shape).lineTo(5.84975, 6.996031);
((GeneralPath)shape).curveTo(4.9638853, 5.4422064, 5.2207537, 2.6387086, 6.9163117, 1.7780186);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.4230769f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new LinearGradientPaint(new Point2D.Double(9.56215763092041, 6.952558994293213), new Point2D.Double(14.766724586486816, 14.200403213500977), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0056905f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.44627, 2.7359104);
((GeneralPath)shape).curveTo(8.868223, 1.9500906, 10.266975, 2.5431693, 11.141568, 4.0752983);
((GeneralPath)shape).lineTo(15.589706, 14.162023);
((GeneralPath)shape).lineTo(13.158185, 15.581885);
((GeneralPath)shape).lineTo(6.861574, 6.761549);
((GeneralPath)shape).curveTo(5.986981, 5.2294207, 5.9853272, 3.5432765, 7.44627, 2.7359104);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
paint = new RadialGradientPaint(new Point2D.Double(20.764476776123047, 19.540945053100586), 14.799585f, new Point2D.Double(20.764476776123047, 19.540945053100586), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(254, 240, 136, 255),new Color(253, 230, 58, 255),new Color(218, 194, 3, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.449398010969162f, -0.21649199724197388f, 0.5644159913063049f, 1.171617031097412f, -1.4322880506515503f, 2.5461080074310303f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.780848, 22.793568);
((GeneralPath)shape).curveTo(13.985353, 27.080402, 15.414814, 36.746067, 21.040081, 42.487564);
((GeneralPath)shape).curveTo(25.386835, 42.628857, 35.03017, 39.06988, 41.571175, 32.290527);
((GeneralPath)shape).curveTo(32.335, 27.773815, 26.034647, 16.567549, 21.135868, 19.007853);
((GeneralPath)shape).lineTo(14.780848, 22.793568);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(196, 160, 0, 255);
stroke = new BasicStroke(1.0000005f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.780848, 22.793568);
((GeneralPath)shape).curveTo(13.985353, 27.080402, 15.414814, 36.746067, 21.040081, 42.487564);
((GeneralPath)shape).curveTo(25.386835, 42.628857, 35.03017, 39.06988, 41.571175, 32.290527);
((GeneralPath)shape).curveTo(32.335, 27.773815, 26.034647, 16.567549, 21.135868, 19.007853);
((GeneralPath)shape).lineTo(14.780848, 22.793568);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new LinearGradientPaint(new Point2D.Double(9.105389595031738, 38.82814407348633), new Point2D.Double(10.146956443786621, 30.140830993652344), new float[] {0.0f,1.0f}, new Color[] {new Color(196, 160, 0, 255),new Color(196, 160, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.866025984287262f, -0.5f, 0.7974910140037537f, 1.3812940120697021f, -15.699090003967285f, -9.225098609924316f));
stroke = new BasicStroke(0.9999999f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.33836, 24.367273);
((GeneralPath)shape).curveTo(18.687374, 30.637545, 18.827803, 37.155575, 23.522142, 42.28716);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 0.46153846f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(0.99999976f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.91878, 23.414124);
((GeneralPath)shape).curveTo(15.006687, 23.922228, 15.758401, 35.934338, 21.503035, 41.41449);
((GeneralPath)shape).curveTo(28.88902, 41.227592, 37.02675, 35.018303, 39.895985, 32.576645);
((GeneralPath)shape).curveTo(30.39657, 26.592524, 24.971184, 17.814877, 21.415195, 20.003061);
((GeneralPath)shape).lineTo(15.91878, 23.414124);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
paint = new LinearGradientPaint(new Point2D.Double(19.616243362426758, 39.25298309326172), new Point2D.Double(18.48598289489746, 29.90907096862793), new float[] {0.0f,1.0f}, new Color[] {new Color(196, 160, 0, 255),new Color(196, 160, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.866025984287262f, -0.5f, 0.7979609966278076f, 1.3821099996566772f, -15.729339599609375f, -9.277499198913574f));
stroke = new BasicStroke(0.9999997f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.848486, 22.273333);
((GeneralPath)shape).curveTo(24.714846, 21.524332, 29.598505, 28.360998, 38.846985, 34.655132);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new LinearGradientPaint(new Point2D.Double(15.096997261047363, 36.967769622802734), new Point2D.Double(14.045431137084961, 29.0), new float[] {0.0f,1.0f}, new Color[] {new Color(196, 160, 0, 255),new Color(196, 160, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.866025984287262f, -0.5f, 0.8434789776802063f, 1.4609479904174805f, -19.740530014038086f, -11.13422966003418f));
stroke = new BasicStroke(1.0000002f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.012894, 22.86392);
((GeneralPath)shape).curveTo(21.725203, 28.211416, 20.975883, 35.288177, 26.853708, 40.94503);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new LinearGradientPaint(new Point2D.Double(14.045431137084961, 37.575889587402344), new Point2D.Double(14.045431137084961, 29.0), new float[] {0.0f,1.0f}, new Color[] {new Color(196, 160, 0, 255),new Color(196, 160, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.866025984287262f, -0.5f, 0.8013049960136414f, 1.3878999948501587f, -12.818300247192383f, -11.144559860229492f));
stroke = new BasicStroke(1.0000002f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(22.983898, 22.775822);
((GeneralPath)shape).curveTo(22.983898, 22.775822, 31.160627, 35.84745, 34.165833, 37.880383);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
paint = new LinearGradientPaint(new Point2D.Double(16.928730010986328, 34.010501861572266), new Point2D.Double(14.045431137084961, 29.0), new float[] {0.0f,1.0f}, new Color[] {new Color(196, 160, 0, 255),new Color(196, 160, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.866025984287262f, -0.5f, 0.8614869713783264f, 1.4921400547027588f, -17.8795108795166f, -13.910849571228027f));
stroke = new BasicStroke(1.0000001f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.300308, 22.200695);
((GeneralPath)shape).curveTo(22.747454, 25.11751, 28.002865, 36.363884, 30.610323, 39.678444);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
paint = new LinearGradientPaint(new Point2D.Double(11.9966459274292, 19.59173583984375), new Point2D.Double(17.774032592773438, 16.234594345092773), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(218, 194, 3, 255),new Color(253, 236, 105, 255),new Color(253, 239, 126, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0148910284042358f, 0.0f, 0.0f, 1.0059200525283813f, -0.331699013710022f, -0.14018799364566803f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.508945, 18.061867);
((GeneralPath)shape).lineTo(19.970615, 11.50296);
((GeneralPath)shape).curveTo(20.569265, 13.885531, 19.628777, 14.743545, 21.766565, 18.650673);
((GeneralPath)shape).lineTo(13.856274, 23.177313);
((GeneralPath)shape).curveTo(12.402846, 19.699894, 10.291388, 19.767015, 8.508945, 18.061867);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(196, 160, 0, 255);
stroke = new BasicStroke(1.0103954f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.508945, 18.061867);
((GeneralPath)shape).lineTo(19.970615, 11.50296);
((GeneralPath)shape).curveTo(20.569265, 13.885531, 19.628777, 14.743545, 21.766565, 18.650673);
((GeneralPath)shape).lineTo(13.856274, 23.177313);
((GeneralPath)shape).curveTo(12.402846, 19.699894, 10.291388, 19.767015, 8.508945, 18.061867);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_10);
g.setComposite(AlphaComposite.getInstance(3, 0.24725272f * origAlpha));
AffineTransform defaultTransform__0_0_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.043449, 21.24569);
((GeneralPath)shape).curveTo(13.229488, 19.824472, 11.481136, 19.009348, 10.36413, 18.11846);
((GeneralPath)shape).lineTo(19.121552, 13.184722);
((GeneralPath)shape).curveTo(19.10196, 14.66569, 19.688457, 16.272928, 19.997164, 17.703388);
((GeneralPath)shape).lineTo(14.043449, 21.24569);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_11);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_12 = g.getTransform();
g.transform(new AffineTransform(0.8660249710083008f, -0.5000010132789612f, 0.5f, 0.866025984287262f, 0.0f, 0.0f));
// _0_0_12
paint = new LinearGradientPaint(new Point2D.Double(10.615303993225098, 28.122554779052734), new Point2D.Double(2.006974697113037, 27.234832763671875), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(179, 0, 0, 255),new Color(255, 92, 92, 255),new Color(195, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.1766999959945679f, 2.2371020257157828E-17f, 2.3198430825921146E-17f, 1.1767020225524902f, -0.819769024848938f, -5.3070549964904785f));
shape = new RoundRectangle2D.Double(-1.4127867221832275, 24.17477798461914, 13.015023231506348, 3.459890604019165, 1.9999947547912598, 1.9999960660934448);
g.setPaint(paint);
g.fill(shape);
paint = new Color(105, 0, 0, 255);
stroke = new BasicStroke(0.99999803f,1,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(-1.4127867221832275, 24.17477798461914, 13.015023231506348, 3.459890604019165, 1.9999947547912598, 1.9999960660934448);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_13 = g.getTransform();
g.transform(new AffineTransform(0.5835570096969604f, 0.15636399388313293f, -0.15636399388313293f, 0.5835570096969604f, 20.457820892333984f, 5.158782005310059f));
// _0_0_13
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-17.172594, 4.083618);
((GeneralPath)shape).curveTo(-17.172232, 4.850756, -17.581287, 5.559776, -18.245588, 5.943449);
((GeneralPath)shape).curveTo(-18.90989, 6.3271227, -19.728447, 6.3271227, -20.392748, 5.943449);
((GeneralPath)shape).curveTo(-21.057049, 5.559776, -21.466105, 4.850756, -21.465742, 4.083618);
((GeneralPath)shape).curveTo(-21.466105, 3.3164802, -21.057049, 2.6074607, -20.392748, 2.2237873);
((GeneralPath)shape).curveTo(-19.728447, 1.8401139, -18.90989, 1.8401139, -18.245588, 2.2237873);
((GeneralPath)shape).curveTo(-17.581287, 2.6074607, -17.172232, 3.3164802, -17.172594, 4.083618);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(143, 89, 2, 255);
stroke = new BasicStroke(1.6552416f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-17.172594, 4.083618);
((GeneralPath)shape).curveTo(-17.172232, 4.850756, -17.581287, 5.559776, -18.245588, 5.943449);
((GeneralPath)shape).curveTo(-18.90989, 6.3271227, -19.728447, 6.3271227, -20.392748, 5.943449);
((GeneralPath)shape).curveTo(-21.057049, 5.559776, -21.466105, 4.850756, -21.465742, 4.083618);
((GeneralPath)shape).curveTo(-21.466105, 3.3164802, -21.057049, 2.6074607, -20.392748, 2.2237873);
((GeneralPath)shape).curveTo(-19.728447, 1.8401139, -18.90989, 1.8401139, -18.245588, 2.2237873);
((GeneralPath)shape).curveTo(-17.581287, 2.6074607, -17.172232, 3.3164802, -17.172594, 4.083618);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_13);
g.setComposite(AlphaComposite.getInstance(3, 0.31730768f * origAlpha));
AffineTransform defaultTransform__0_0_14 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_14
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(27.734835, 40.55524);
((GeneralPath)shape).curveTo(27.734835, 40.55524, 29.241419, 40.054592, 29.910933, 39.613483);
((GeneralPath)shape).curveTo(28.673494, 37.66894, 26.507591, 33.71782, 24.507807, 30.737564);
((GeneralPath)shape).curveTo(25.70105, 37.2783, 27.734835, 40.55524, 27.734835, 40.55524);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_14);
g.setComposite(AlphaComposite.getInstance(3, 0.31730768f * origAlpha));
AffineTransform defaultTransform__0_0_15 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_15
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.141806, 39.05827);
((GeneralPath)shape).lineTo(33.167805, 37.9731);
((GeneralPath)shape).curveTo(31.223259, 36.116943, 25.699306, 27.857203, 25.699306, 27.857203);
((GeneralPath)shape).lineTo(31.141806, 39.05827);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_15);
g.setComposite(AlphaComposite.getInstance(3, 0.31730768f * origAlpha));
AffineTransform defaultTransform__0_0_16 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_16
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.658524, 36.38781);
((GeneralPath)shape).lineTo(38.094894, 34.64406);
((GeneralPath)shape).curveTo(34.91291, 33.318233, 26.508352, 24.763609, 26.508352, 24.763609);
((GeneralPath)shape).curveTo(28.891289, 27.775503, 33.275585, 33.375916, 35.658524, 36.38781);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_16);
g.setComposite(AlphaComposite.getInstance(3, 0.31730768f * origAlpha));
AffineTransform defaultTransform__0_0_17 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_17
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.15369, 33.91721);
((GeneralPath)shape).lineTo(40.846, 32.5077);
((GeneralPath)shape).curveTo(37.53144, 31.005098, 28.350325, 22.595682, 28.350325, 22.595682);
((GeneralPath)shape).curveTo(28.350325, 22.595682, 34.42491, 31.795889, 39.15369, 33.91721);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_17);
g.setComposite(AlphaComposite.getInstance(3, 0.31730765f * origAlpha));
AffineTransform defaultTransform__0_0_18 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_18
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(24.376076, 41.571705);
((GeneralPath)shape).curveTo(24.376076, 41.571705, 25.573301, 41.292027, 26.419592, 41.116085);
((GeneralPath)shape).curveTo(24.961184, 39.87865, 22.618504, 36.67883, 21.325825, 32.50533);
((GeneralPath)shape).curveTo(21.856155, 39.399624, 24.376076, 41.571705, 24.376076, 41.571705);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_18);
g.setComposite(AlphaComposite.getInstance(3, 0.31730765f * origAlpha));
AffineTransform defaultTransform__0_0_19 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_19
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(21.370872, 41.96945);
((GeneralPath)shape).curveTo(21.370872, 41.96945, 22.618893, 41.955776, 22.618893, 41.955776);
((GeneralPath)shape).curveTo(20.320795, 39.436707, 19.480717, 36.590443, 18.188038, 32.549526);
((GeneralPath)shape).curveTo(18.055456, 37.234108, 21.370872, 41.96945, 21.370872, 41.96945);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_19);
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
		return 44;
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
	public edit_clear() {
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

