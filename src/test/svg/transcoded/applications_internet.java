package test.svg.transcoded;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class applications_internet implements
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.2432440519332886f, 0.0f, -10.27241039276123f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(15.115513801574707, 63.965389251708984), 12.289036f, new Point2D.Double(15.115513801574707, 63.965389251708984), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.6439900398254395f, 0.0f, 0.0f, 0.6082760095596313f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.052803, 38.908627);
((GeneralPath)shape).curveTo(45.052803, 43.037025, 36.007587, 46.383755, 24.849752, 46.383755);
((GeneralPath)shape).curveTo(13.6919155, 46.383755, 4.646702, 43.037025, 4.646702, 38.908627);
((GeneralPath)shape).curveTo(4.646702, 34.780228, 13.6919155, 31.433498, 24.849752, 31.433498);
((GeneralPath)shape).curveTo(36.007587, 31.433498, 45.052803, 34.780228, 45.052803, 38.908627);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new RadialGradientPaint(new Point2D.Double(18.247644424438477, 15.716078758239746), 29.99335f, new Point2D.Double(18.247644424438477, 15.716078758239746), new float[] {0.0f,0.15517241f,0.75f,1.0f}, new Color[] {new Color(211, 233, 255, 255),new Color(211, 233, 255, 255),new Color(64, 116, 174, 255),new Color(54, 72, 108, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9999889731407166f, 0.0f, 0.0f, 1.0000109672546387f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(43.959854, 23.485498);
((GeneralPath)shape).curveTo(43.959854, 34.195217, 35.27775, 42.87722, 24.569506, 42.87722);
((GeneralPath)shape).curveTo(13.860279, 42.87722, 5.178666, 34.195118, 5.178666, 23.485498);
((GeneralPath)shape).curveTo(5.178666, 12.776272, 13.860279, 4.095152, 24.569506, 4.095152);
((GeneralPath)shape).curveTo(35.27775, 4.095152, 43.959854, 12.776272, 43.959854, 23.485498);
((GeneralPath)shape).lineTo(43.959854, 23.485498);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(57, 57, 108, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(43.959854, 23.485498);
((GeneralPath)shape).curveTo(43.959854, 34.195217, 35.27775, 42.87722, 24.569506, 42.87722);
((GeneralPath)shape).curveTo(13.860279, 42.87722, 5.178666, 34.195118, 5.178666, 23.485498);
((GeneralPath)shape).curveTo(5.178666, 12.776272, 13.860279, 4.095152, 24.569506, 4.095152);
((GeneralPath)shape).curveTo(35.27775, 4.095152, 43.959854, 12.776272, 43.959854, 23.485498);
((GeneralPath)shape).lineTo(43.959854, 23.485498);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(0.9823709726333618f, 0.0f, 0.0f, 0.9823709726333618f, 0.12107899785041809f, 0.232914000749588f));
// _0_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.0713, 20.7144);
((GeneralPath)shape).curveTo(44.0713, 20.9771, 44.0713, 20.7144, 44.0713, 20.7144);
((GeneralPath)shape).lineTo(43.5264, 21.3316);
((GeneralPath)shape).curveTo(43.1924, 20.938, 42.8174, 20.607, 42.4366, 20.2613);
((GeneralPath)shape).lineTo(41.6007, 20.3843);
((GeneralPath)shape).lineTo(40.837, 19.521);
((GeneralPath)shape).lineTo(40.837, 20.5894);
((GeneralPath)shape).lineTo(41.4913, 21.0845);
((GeneralPath)shape).lineTo(41.9268, 21.5777);
((GeneralPath)shape).lineTo(42.5088, 20.9195);
((GeneralPath)shape).curveTo(42.6553, 21.1939, 42.7998, 21.4683, 42.9453, 21.7427);
((GeneralPath)shape).lineTo(42.9453, 22.565);
((GeneralPath)shape).lineTo(42.29, 23.3052);
((GeneralPath)shape).lineTo(41.0908, 24.1284);
((GeneralPath)shape).lineTo(40.1826, 25.0347);
((GeneralPath)shape).lineTo(39.6006, 24.3745);
((GeneralPath)shape).lineTo(39.8916, 23.6343);
((GeneralPath)shape).lineTo(39.3105, 22.9761);
((GeneralPath)shape).lineTo(38.3291, 20.8784);
((GeneralPath)shape).lineTo(37.4932, 19.9331);
((GeneralPath)shape).lineTo(37.2744, 20.1792);
((GeneralPath)shape).lineTo(37.6025, 21.3726);
((GeneralPath)shape).lineTo(38.2197, 22.0718);
((GeneralPath)shape).curveTo(38.5722, 23.0894, 38.9209, 24.062, 39.3838, 25.0347);
((GeneralPath)shape).curveTo(40.1016, 25.0347, 40.7783, 24.9585, 41.4912, 24.8687);
((GeneralPath)shape).lineTo(41.4912, 25.4449);
((GeneralPath)shape).lineTo(40.6191, 27.5841);
((GeneralPath)shape).lineTo(39.8193, 28.4884);
((GeneralPath)shape).lineTo(39.165, 29.8888);
((GeneralPath)shape).curveTo(39.165, 30.6564, 39.165, 31.424, 39.165, 32.1915);
((GeneralPath)shape).lineTo(39.3838, 33.0978);
((GeneralPath)shape).lineTo(39.0205, 33.508);
((GeneralPath)shape).lineTo(38.2197, 34.0021);
((GeneralPath)shape).lineTo(37.3838, 34.7013);
((GeneralPath)shape).lineTo(38.0752, 35.4826);
((GeneralPath)shape).lineTo(37.1299, 36.3068);
((GeneralPath)shape).lineTo(37.3115, 36.84);
((GeneralPath)shape).lineTo(35.8935, 38.4455);
((GeneralPath)shape).lineTo(34.9492, 38.4455);
((GeneralPath)shape).lineTo(34.1494, 38.9396);
((GeneralPath)shape).lineTo(33.6396, 38.9396);
((GeneralPath)shape).lineTo(33.6396, 38.2814);
((GeneralPath)shape).lineTo(33.4228, 36.963);
((GeneralPath)shape).curveTo(33.1415, 36.1368, 32.8486, 35.3165, 32.5507, 34.4962);
((GeneralPath)shape).curveTo(32.5507, 33.8907, 32.5868, 33.2911, 32.623, 32.6857);
((GeneralPath)shape).lineTo(32.9873, 31.8634);
((GeneralPath)shape).lineTo(32.4775, 30.8751);
((GeneralPath)shape).lineTo(32.5146, 29.5177);
((GeneralPath)shape).lineTo(31.8232, 28.7364);
((GeneralPath)shape).lineTo(32.1689, 27.6055);
((GeneralPath)shape).lineTo(31.6064, 26.9673);
((GeneralPath)shape).lineTo(30.624, 26.9673);
((GeneralPath)shape).lineTo(30.2969, 26.5972);
((GeneralPath)shape).lineTo(29.3155, 27.2149);
((GeneralPath)shape).lineTo(28.9161, 26.7613);
((GeneralPath)shape).lineTo(28.0069, 27.543);
((GeneralPath)shape).curveTo(27.3897, 26.8433, 26.7715, 26.1441, 26.1534, 25.4449);
((GeneralPath)shape).lineTo(25.4268, 23.7164);
((GeneralPath)shape).lineTo(26.0811, 22.7301);
((GeneralPath)shape).lineTo(25.7178, 22.319);
((GeneralPath)shape).lineTo(26.5166, 20.4254);
((GeneralPath)shape).curveTo(27.1729, 19.609, 27.8584, 18.8258, 28.5518, 18.0397);
((GeneralPath)shape).lineTo(29.7881, 17.7106);
((GeneralPath)shape).lineTo(31.169, 17.5465);
((GeneralPath)shape).lineTo(32.1143, 17.7936);
((GeneralPath)shape).lineTo(33.459, 19.15);
((GeneralPath)shape).lineTo(33.9317, 18.6158);
((GeneralPath)shape).lineTo(34.585, 18.5338);
((GeneralPath)shape).lineTo(35.8213, 18.9449);
((GeneralPath)shape).lineTo(36.7666, 18.9449);
((GeneralPath)shape).lineTo(37.4209, 18.3687);
((GeneralPath)shape).lineTo(37.7119, 17.9576);
((GeneralPath)shape).lineTo(37.0566, 17.5465);
((GeneralPath)shape).lineTo(35.9658, 17.4645);
((GeneralPath)shape).curveTo(35.6631, 17.0446, 35.3818, 16.6032, 35.0224, 16.2301);
((GeneralPath)shape).lineTo(34.6581, 16.3942);
((GeneralPath)shape).lineTo(34.5126, 17.4645);
((GeneralPath)shape).lineTo(33.8583, 16.7243);
((GeneralPath)shape).lineTo(33.7138, 15.9001);
((GeneralPath)shape).lineTo(32.9872, 15.3259);
((GeneralPath)shape).lineTo(32.6952, 15.3259);
((GeneralPath)shape).lineTo(33.4227, 16.1482);
((GeneralPath)shape).lineTo(33.1317, 16.8884);
((GeneralPath)shape).lineTo(32.5506, 17.0525);
((GeneralPath)shape).lineTo(32.9139, 16.3123);
((GeneralPath)shape).lineTo(32.2586, 15.9842);
((GeneralPath)shape).lineTo(31.6785, 15.326);
((GeneralPath)shape).lineTo(30.5867, 15.5721);
((GeneralPath)shape).lineTo(30.4422, 15.9002);
((GeneralPath)shape).lineTo(29.7879, 16.3123);
((GeneralPath)shape).lineTo(29.4246, 17.2176);
((GeneralPath)shape).lineTo(28.5164, 17.6697);
((GeneralPath)shape).lineTo(28.116, 17.2176);
((GeneralPath)shape).lineTo(27.6805, 17.2176);
((GeneralPath)shape).lineTo(27.6805, 15.7362);
((GeneralPath)shape).lineTo(28.6258, 15.2421);
((GeneralPath)shape).lineTo(29.3524, 15.2421);
((GeneralPath)shape).lineTo(29.2059, 14.6669);
((GeneralPath)shape).lineTo(28.6258, 14.0907);
((GeneralPath)shape).lineTo(29.6063, 13.8846);
((GeneralPath)shape).lineTo(30.1512, 13.2684);
((GeneralPath)shape).lineTo(30.5867, 12.5272);
((GeneralPath)shape).lineTo(31.3875, 12.5272);
((GeneralPath)shape).lineTo(31.1687, 11.952);
((GeneralPath)shape).lineTo(31.6785, 11.6229);
((GeneralPath)shape).lineTo(31.6785, 12.2811);
((GeneralPath)shape).lineTo(32.7683, 12.5272);
((GeneralPath)shape).lineTo(33.8581, 11.6229);
((GeneralPath)shape).lineTo(33.9313, 11.2108);
((GeneralPath)shape).lineTo(34.8756, 10.5531);
((GeneralPath)shape).curveTo(34.5338, 10.5956, 34.192, 10.6268, 33.858, 10.7177);
((GeneralPath)shape).lineTo(33.858, 9.9766);
((GeneralPath)shape).lineTo(34.2213, 9.1538);
((GeneralPath)shape).lineTo(33.858, 9.1538);
((GeneralPath)shape).lineTo(33.0596, 9.894);
((GeneralPath)shape).lineTo(32.8408, 10.3056);
((GeneralPath)shape).lineTo(33.0596, 10.8823);
((GeneralPath)shape).lineTo(32.6953, 11.8686);
((GeneralPath)shape).lineTo(32.1142, 11.5395);
((GeneralPath)shape).lineTo(31.6064, 10.9643);
((GeneralPath)shape).lineTo(30.8056, 11.5395);
((GeneralPath)shape).lineTo(30.5146, 10.2236);
((GeneralPath)shape).lineTo(31.8955, 9.3188);
((GeneralPath)shape).lineTo(31.8955, 8.8247);
((GeneralPath)shape).lineTo(32.7685, 8.249001);
((GeneralPath)shape).lineTo(34.1494, 7.9194);
((GeneralPath)shape).lineTo(35.0947, 8.249001);
((GeneralPath)shape).lineTo(36.8388, 8.5781);
((GeneralPath)shape).lineTo(36.4033, 9.0713005);
((GeneralPath)shape).lineTo(35.458, 9.0713005);
((GeneralPath)shape).lineTo(36.4033, 10.0586);
((GeneralPath)shape).lineTo(37.1299, 9.2363);
((GeneralPath)shape).lineTo(37.3506, 8.8745);
((GeneralPath)shape).curveTo(37.3506, 8.8745, 40.1377, 11.3725, 41.7305, 14.105);
((GeneralPath)shape).curveTo(43.3233, 16.8384, 44.0713, 20.0601, 44.0713, 20.7144);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_0_0_0);
g.setTransform(defaultTransform__0_0_2_0_0);
g.setTransform(defaultTransform__0_0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_1_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(26.0703, 9.2363);
((GeneralPath)shape).lineTo(25.9971, 9.7295);
((GeneralPath)shape).lineTo(26.5069, 10.0586);
((GeneralPath)shape).lineTo(27.378, 9.4829);
((GeneralPath)shape).lineTo(26.9425, 8.9892);
((GeneralPath)shape).lineTo(26.3605, 9.3188);
((GeneralPath)shape).lineTo(26.0705, 9.2363);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_1_0_0);
g.setTransform(defaultTransform__0_0_2_1_0);
g.setTransform(defaultTransform__0_0_2_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_2_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_2_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(26.8701, 5.8633);
((GeneralPath)shape).lineTo(24.9795, 5.1226);
((GeneralPath)shape).lineTo(22.7998, 5.3692);
((GeneralPath)shape).lineTo(20.1094, 6.1094);
((GeneralPath)shape).lineTo(19.6006, 6.6035);
((GeneralPath)shape).lineTo(21.2725, 7.7549);
((GeneralPath)shape).lineTo(21.2725, 8.4131);
((GeneralPath)shape).lineTo(20.6182, 9.0713005);
((GeneralPath)shape).lineTo(21.4912, 10.8003);
((GeneralPath)shape).lineTo(22.0713, 10.4702);
((GeneralPath)shape).lineTo(22.7998, 9.3188);
((GeneralPath)shape).curveTo(23.9228, 8.971601, 24.9297, 8.5781, 25.9971, 8.0844);
((GeneralPath)shape).lineTo(26.8701, 5.8632);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_2_0_0);
g.setTransform(defaultTransform__0_0_2_2_0);
g.setTransform(defaultTransform__0_0_2_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_3_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_3_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.833, 12.7749);
((GeneralPath)shape).lineTo(28.542, 12.0337);
((GeneralPath)shape).lineTo(28.0322, 12.1987);
((GeneralPath)shape).lineTo(28.1787, 13.103);
((GeneralPath)shape).lineTo(28.833, 12.7749);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_3_0_0);
g.setTransform(defaultTransform__0_0_2_3_0);
g.setTransform(defaultTransform__0_0_2_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_4_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_4_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_4_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_4_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.123, 12.6089);
((GeneralPath)shape).lineTo(28.9775, 13.5972);
((GeneralPath)shape).lineTo(29.7773, 13.4322);
((GeneralPath)shape).lineTo(30.3584, 12.857);
((GeneralPath)shape).lineTo(29.8496, 12.3629);
((GeneralPath)shape).curveTo(29.6787, 11.9078, 29.4824, 11.483, 29.2685, 11.0465);
((GeneralPath)shape).lineTo(28.833, 11.0465);
((GeneralPath)shape).lineTo(28.833, 11.5397);
((GeneralPath)shape).lineTo(29.123, 11.8688);
((GeneralPath)shape).lineTo(29.123, 12.609);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_4_0_0);
g.setTransform(defaultTransform__0_0_2_4_0);
g.setTransform(defaultTransform__0_0_2_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_5_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_5_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_5_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_5_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.3652, 28.2422);
((GeneralPath)shape).lineTo(17.7832, 27.0899);
((GeneralPath)shape).lineTo(16.6929, 26.8433);
((GeneralPath)shape).lineTo(16.1114, 25.2808);
((GeneralPath)shape).lineTo(14.6578, 25.4449);
((GeneralPath)shape).lineTo(13.4224, 24.5406);
((GeneralPath)shape).lineTo(12.1133, 25.692);
((GeneralPath)shape).lineTo(12.1133, 25.8736);
((GeneralPath)shape).curveTo(11.7173, 25.7593, 11.2305, 25.7437, 10.8779, 25.5269);
((GeneralPath)shape).lineTo(10.5869, 24.7046);
((GeneralPath)shape).lineTo(10.5869, 23.7993);
((GeneralPath)shape).lineTo(9.7148, 23.8813);
((GeneralPath)shape).curveTo(9.7876005, 23.3051, 9.8598, 22.7299, 9.9331, 22.1538);
((GeneralPath)shape).lineTo(9.4238, 22.1538);
((GeneralPath)shape).lineTo(8.9155, 22.812);
((GeneralPath)shape).lineTo(8.4062, 23.0581);
((GeneralPath)shape).lineTo(7.6791, 22.6479);
((GeneralPath)shape).lineTo(7.6063, 21.7426);
((GeneralPath)shape).lineTo(7.7518, 20.7553);
((GeneralPath)shape).lineTo(8.8426, 19.933);
((GeneralPath)shape).lineTo(9.7147, 19.933);
((GeneralPath)shape).lineTo(9.8597, 19.4389);
((GeneralPath)shape).lineTo(10.95, 19.685);
((GeneralPath)shape).lineTo(11.7498, 20.6733);
((GeneralPath)shape).lineTo(11.8953, 19.0268);
((GeneralPath)shape).lineTo(13.2766, 17.8754);
((GeneralPath)shape).lineTo(13.7854, 16.641);
((GeneralPath)shape).lineTo(14.803, 16.2299);
((GeneralPath)shape).lineTo(15.3845, 15.4076);
((GeneralPath)shape).lineTo(16.6926, 15.1596);
((GeneralPath)shape).lineTo(17.3474, 14.1733);
((GeneralPath)shape).curveTo(16.6931, 14.1733, 16.0388, 14.1733, 15.3845, 14.1733);
((GeneralPath)shape).lineTo(16.6203, 13.5971);
((GeneralPath)shape).lineTo(17.4919, 13.5971);
((GeneralPath)shape).lineTo(18.7282, 13.185);
((GeneralPath)shape).lineTo(18.8737, 12.6928);
((GeneralPath)shape).lineTo(18.4372, 12.2807);
((GeneralPath)shape).lineTo(17.9284, 12.1157);
((GeneralPath)shape).lineTo(18.0739, 11.6225);
((GeneralPath)shape).lineTo(17.7106, 10.8823);
((GeneralPath)shape).lineTo(16.838, 11.2104);
((GeneralPath)shape).lineTo(16.9835, 10.5527);
((GeneralPath)shape).lineTo(15.9659, 9.9765005);
((GeneralPath)shape).lineTo(15.1666, 11.3744);
((GeneralPath)shape).lineTo(15.2389, 11.8685);
((GeneralPath)shape).lineTo(14.4396, 12.1986);
((GeneralPath)shape).lineTo(13.9303, 13.2679);
((GeneralPath)shape).lineTo(13.7125, 12.2806);
((GeneralPath)shape).lineTo(12.3312, 11.7044);
((GeneralPath)shape).lineTo(12.1129, 10.9642);
((GeneralPath)shape).lineTo(13.9303, 9.8939);
((GeneralPath)shape).lineTo(14.7301, 9.1537);
((GeneralPath)shape).lineTo(14.8029, 8.2489);
((GeneralPath)shape).lineTo(14.3669, 8.001801);
((GeneralPath)shape).lineTo(13.7854, 7.9193);
((GeneralPath)shape).lineTo(13.4221, 8.8246);
((GeneralPath)shape).curveTo(13.4221, 8.8246, 12.8142, 8.9437, 12.6579, 8.9823);
((GeneralPath)shape).curveTo(10.6618, 10.8217, 6.6286, 14.7924, 5.6916, 22.2885);
((GeneralPath)shape).curveTo(5.7287, 22.4623, 6.3708, 23.4701, 6.3708, 23.4701);
((GeneralPath)shape).lineTo(7.8972, 24.3744);
((GeneralPath)shape).lineTo(9.4236, 24.7865);
((GeneralPath)shape).lineTo(10.0784, 25.6097);
((GeneralPath)shape).lineTo(11.0955, 26.3499);
((GeneralPath)shape).lineTo(11.677, 26.2679);
((GeneralPath)shape).lineTo(12.113, 26.4642);
((GeneralPath)shape).lineTo(12.113, 26.597);
((GeneralPath)shape).lineTo(11.5319, 28.16);
((GeneralPath)shape).lineTo(11.0954, 28.8182);
((GeneralPath)shape).lineTo(11.2409, 29.1483);
((GeneralPath)shape).lineTo(10.8776, 30.3807);
((GeneralPath)shape).lineTo(12.1862, 32.7674);
((GeneralPath)shape).lineTo(13.4943, 33.9197);
((GeneralPath)shape).lineTo(14.0763, 34.742);
((GeneralPath)shape).lineTo(14.0031, 36.4705);
((GeneralPath)shape).lineTo(14.4396, 37.4568);
((GeneralPath)shape).lineTo(14.0031, 39.3494);
((GeneralPath)shape).curveTo(14.0031, 39.3494, 13.9689, 39.3377, 14.0246, 39.5271);
((GeneralPath)shape).curveTo(14.0808, 39.7166, 16.3537, 40.9783, 16.4982, 40.8709);
((GeneralPath)shape).curveTo(16.6422, 40.7615, 16.7653, 40.6658, 16.7653, 40.6658);
((GeneralPath)shape).lineTo(16.6203, 40.2556);
((GeneralPath)shape).lineTo(17.2014, 39.6794);
((GeneralPath)shape).lineTo(17.4197, 39.1032);
((GeneralPath)shape).lineTo(18.365, 38.7731);
((GeneralPath)shape).lineTo(19.0916, 36.9626);
((GeneralPath)shape).lineTo(18.8738, 36.4704);
((GeneralPath)shape).lineTo(19.3816, 35.7302);
((GeneralPath)shape).lineTo(20.4724, 35.4822);
((GeneralPath)shape).lineTo(21.0544, 34.1658);
((GeneralPath)shape).lineTo(20.9089, 32.5213);
((GeneralPath)shape).lineTo(21.781, 31.2869);
((GeneralPath)shape).lineTo(21.9265, 30.0525);
((GeneralPath)shape).curveTo(20.7331, 29.4607, 19.5495, 28.8513, 18.365, 28.242);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_5_0_0);
g.setTransform(defaultTransform__0_0_2_5_0);
g.setTransform(defaultTransform__0_0_2_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_6_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_6_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_6_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_6_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.7656, 9.5649);
((GeneralPath)shape).lineTo(17.4922, 10.0586);
((GeneralPath)shape).lineTo(18.0742, 10.0586);
((GeneralPath)shape).lineTo(18.0742, 9.4829);
((GeneralPath)shape).lineTo(17.3476, 9.1538);
((GeneralPath)shape).lineTo(16.7656, 9.5649);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_6_0_0);
g.setTransform(defaultTransform__0_0_2_6_0);
g.setTransform(defaultTransform__0_0_2_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_7_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_7_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_7_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_7_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.876, 8.9072);
((GeneralPath)shape).lineTo(14.5122, 9.812);
((GeneralPath)shape).lineTo(15.2393, 9.812);
((GeneralPath)shape).lineTo(15.6031, 8.9892);
((GeneralPath)shape).curveTo(15.9166, 8.7675, 16.2286, 8.5444, 16.5479, 8.331);
((GeneralPath)shape).lineTo(17.275, 8.5781);
((GeneralPath)shape).curveTo(17.7594, 8.9072, 18.2438, 9.2363, 18.7286, 9.5649);
((GeneralPath)shape).lineTo(19.4561, 8.9072);
((GeneralPath)shape).lineTo(18.6558, 8.5781);
((GeneralPath)shape).lineTo(18.292, 7.8374);
((GeneralPath)shape).lineTo(16.9111, 7.6728);
((GeneralPath)shape).lineTo(16.8383, 7.2612);
((GeneralPath)shape).lineTo(16.184, 7.4262);
((GeneralPath)shape).lineTo(15.8936, 8.002);
((GeneralPath)shape).lineTo(15.5298, 7.2613);
((GeneralPath)shape).lineTo(15.3848, 7.5904);
((GeneralPath)shape).lineTo(15.4576, 8.4132);
((GeneralPath)shape).lineTo(14.876, 8.9072);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_7_0_0);
g.setTransform(defaultTransform__0_0_2_7_0);
g.setTransform(defaultTransform__0_0_2_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_8
g.setComposite(AlphaComposite.getInstance(3, 0.75f * origAlpha));
AffineTransform defaultTransform__0_0_2_8_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_8_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_8_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_8_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_8_0_0);
g.setTransform(defaultTransform__0_0_2_8_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_8_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_8_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_8_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_8_1_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_8_1_0);
g.setTransform(defaultTransform__0_0_2_8_1);
g.setTransform(defaultTransform__0_0_2_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_9
g.setComposite(AlphaComposite.getInstance(3, 0.75f * origAlpha));
AffineTransform defaultTransform__0_0_2_9_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_9_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_9_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_9_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_9_0_0);
g.setTransform(defaultTransform__0_0_2_9_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_9_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_9_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_9_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_9_1_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_9_1_0);
g.setTransform(defaultTransform__0_0_2_9_1);
g.setTransform(defaultTransform__0_0_2_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_10
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_10_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_10_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_10_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_10_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.4922, 6.8496003);
((GeneralPath)shape).lineTo(17.856, 6.521);
((GeneralPath)shape).lineTo(18.5831, 6.3564);
((GeneralPath)shape).curveTo(19.0811, 6.1142, 19.5811, 5.9511, 20.1095, 5.7802);
((GeneralPath)shape).lineTo(19.8195, 5.2865);
((GeneralPath)shape).lineTo(18.881, 5.4213);
((GeneralPath)shape).lineTo(18.4376, 5.8632);
((GeneralPath)shape).lineTo(17.7066, 5.9692);
((GeneralPath)shape).lineTo(17.0567, 6.2744);
((GeneralPath)shape).lineTo(16.7408, 6.4272);
((GeneralPath)shape).lineTo(16.5479, 6.6855);
((GeneralPath)shape).lineTo(17.4922, 6.8496003);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_10_0_0);
g.setTransform(defaultTransform__0_0_2_10_0);
g.setTransform(defaultTransform__0_0_2_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_11 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_11
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_11_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_11_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2_11_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_11_0_0
paint = new Color(32, 74, 135, 182);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.7285, 14.6665);
((GeneralPath)shape).lineTo(19.165, 14.0083);
((GeneralPath)shape).lineTo(18.5102, 13.5151);
((GeneralPath)shape).lineTo(18.7285, 14.6665);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2_11_0_0);
g.setTransform(defaultTransform__0_0_2_11_0);
g.setTransform(defaultTransform__0_0_2_11);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.3956044f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
paint = new RadialGradientPaint(new Point2D.Double(15.601279258728027, 12.142301559448242), 43.526714f, new Point2D.Double(15.601279258728027, 12.142301559448242), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 42)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9999889731407166f, 0.0f, 0.0f, 1.0000109672546387f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(42.975094, 23.485535);
((GeneralPath)shape).curveTo(42.975094, 33.651356, 34.733913, 41.89244, 24.569492, 41.89244);
((GeneralPath)shape).curveTo(14.404139, 41.89244, 6.163426, 33.65126, 6.163426, 23.485535);
((GeneralPath)shape).curveTo(6.163426, 13.32018, 14.404139, 5.079934, 24.569492, 5.079934);
((GeneralPath)shape).curveTo(34.733913, 5.079934, 42.975094, 13.32018, 42.975094, 23.485535);
((GeneralPath)shape).lineTo(42.975094, 23.485535);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.131034016609192f, 0.6130970120429993f, -0.4765560030937195f, 0.879144012928009f, 54.090579986572266f, 16.044349670410156f));
// _0_0_4
paint = new LinearGradientPaint(new Point2D.Double(-25.176177978515625, 30.057165145874023), new Point2D.Double(-22.252471923828125, 21.041553497314453), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.881642f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-2.8284283, 21.041553);
((GeneralPath)shape).curveTo(-2.8284283, 26.264816, -9.872389, 30.499107, -18.561554, 30.499107);
((GeneralPath)shape).curveTo(-27.250721, 30.499107, -34.29468, 26.264816, -34.29468, 21.041553);
((GeneralPath)shape).curveTo(-34.29468, 15.818291, -27.250721, 11.584, -18.561556, 11.584);
((GeneralPath)shape).curveTo(-9.872389, 11.584, -2.8284283, 15.818291, -2.8284283, 21.041553);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(0.9393259882926941f, -0.8790860176086426f, 0.6833069920539856f, 0.7301309704780579f, 32.31406021118164f, -4.451560974121094f));
// _0_0_5
paint = new LinearGradientPaint(new Point2D.Double(-25.176177978515625, 30.057165145874023), new Point2D.Double(-22.113542556762695, 22.661523818969727), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.881642f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-2.8284283, 21.041553);
((GeneralPath)shape).curveTo(-2.8284283, 26.264816, -9.872389, 30.499107, -18.561554, 30.499107);
((GeneralPath)shape).curveTo(-27.250721, 30.499107, -34.29468, 26.264816, -34.29468, 21.041553);
((GeneralPath)shape).curveTo(-34.29468, 15.818291, -27.250721, 11.584, -18.561556, 11.584);
((GeneralPath)shape).curveTo(-9.872389, 11.584, -2.8284283, 15.818291, -2.8284283, 21.041553);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(-1.0457719564437866f, 0.7672510147094727f, 0.7672510147094727f, 1.0457719564437866f, 35.61650848388672f, -22.14396095275879f));
// _0_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.950260162353516f, 22.930469512939453f));
// _0_0_6_0
paint = new RadialGradientPaint(new Point2D.Double(12.07132339477539, 12.493138313293457), 6.7175145f, new Point2D.Double(12.07132339477539, 12.493138313293457), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.788837, 12.493138);
((GeneralPath)shape).curveTo(18.789476, 14.893501, 17.509266, 17.111801, 15.430597, 18.312168);
((GeneralPath)shape).curveTo(13.351929, 19.512533, 10.790718, 19.512533, 8.7120495, 18.312168);
((GeneralPath)shape).curveTo(6.6333804, 17.111801, 5.3531694, 14.893501, 5.353809, 12.493138);
((GeneralPath)shape).curveTo(5.3531694, 10.092775, 6.6333804, 7.874475, 8.7120495, 6.6741085);
((GeneralPath)shape).curveTo(10.790718, 5.4737425, 13.351929, 5.4737425, 15.430597, 6.6741085);
((GeneralPath)shape).curveTo(17.509266, 7.874475, 18.789476, 10.092775, 18.788837, 12.493138);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_6_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6_1 = g.getTransform();
g.transform(new AffineTransform(0.30827099084854126f, 0.0f, 0.0f, 0.30827099084854126f, 23.300350189208984f, 31.57234001159668f));
// _0_0_6_1
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.788837, 12.493138);
((GeneralPath)shape).curveTo(18.789476, 14.893501, 17.509266, 17.111801, 15.430597, 18.312168);
((GeneralPath)shape).curveTo(13.351929, 19.512533, 10.790718, 19.512533, 8.7120495, 18.312168);
((GeneralPath)shape).curveTo(6.6333804, 17.111801, 5.3531694, 14.893501, 5.353809, 12.493138);
((GeneralPath)shape).curveTo(5.3531694, 10.092775, 6.6333804, 7.874475, 8.7120495, 6.6741085);
((GeneralPath)shape).curveTo(10.790718, 5.4737425, 13.351929, 5.4737425, 15.430597, 6.6741085);
((GeneralPath)shape).curveTo(17.509266, 7.874475, 18.789476, 10.092775, 18.788837, 12.493138);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_6_1);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(-1.2803159952163696f, -0.12615899741649628f, 0.09806226193904877f, -0.9951800107955933f, -2.4051249027252197f, 40.523868560791016f));
// _0_0_7
paint = new LinearGradientPaint(new Point2D.Double(-22.82256507873535, 28.33773422241211), new Point2D.Double(-22.113542556762695, 22.661523818969727), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.881642f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-2.8284283, 21.041553);
((GeneralPath)shape).curveTo(-2.8284283, 26.264816, -9.872389, 30.499107, -18.561554, 30.499107);
((GeneralPath)shape).curveTo(-27.250721, 30.499107, -34.29468, 26.264816, -34.29468, 21.041553);
((GeneralPath)shape).curveTo(-34.29468, 15.818291, -27.250721, 11.584, -18.561556, 11.584);
((GeneralPath)shape).curveTo(-9.872389, 11.584, -2.8284283, 15.818291, -2.8284283, 21.041553);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(0.9178739786148071f, -0.8589829802513123f, 0.667701005935669f, 0.713433027267456f, 27.633169174194336f, -6.909069061279297f));
// _0_0_8
paint = new LinearGradientPaint(new Point2D.Double(-21.658580780029297, 15.649428367614746), new Point2D.Double(-21.962100982666016, 21.336345672607422), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.9022614f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-2.8284283, 21.041553);
((GeneralPath)shape).curveTo(-2.8284283, 26.264816, -9.872389, 30.499107, -18.561554, 30.499107);
((GeneralPath)shape).curveTo(-27.250721, 30.499107, -34.29468, 26.264816, -34.29468, 21.041553);
((GeneralPath)shape).curveTo(-34.29468, 15.818291, -27.250721, 11.584, -18.561556, 11.584);
((GeneralPath)shape).curveTo(-9.872389, 11.584, -2.8284283, 15.818291, -2.8284283, 21.041553);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(-0.8062760233879089f, 0.5915399789810181f, 0.5915399789810181f, 0.8062760233879089f, 12.385640144348145f, -18.02920913696289f));
// _0_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.950260162353516f, 22.930469512939453f));
// _0_0_9_0
paint = new RadialGradientPaint(new Point2D.Double(12.07132339477539, 12.493138313293457), 6.7175145f, new Point2D.Double(12.07132339477539, 12.493138313293457), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.788837, 12.493138);
((GeneralPath)shape).curveTo(18.789476, 14.893501, 17.509266, 17.111801, 15.430597, 18.312168);
((GeneralPath)shape).curveTo(13.351929, 19.512533, 10.790718, 19.512533, 8.7120495, 18.312168);
((GeneralPath)shape).curveTo(6.6333804, 17.111801, 5.3531694, 14.893501, 5.353809, 12.493138);
((GeneralPath)shape).curveTo(5.3531694, 10.092775, 6.6333804, 7.874475, 8.7120495, 6.6741085);
((GeneralPath)shape).curveTo(10.790718, 5.4737425, 13.351929, 5.4737425, 15.430597, 6.6741085);
((GeneralPath)shape).curveTo(17.509266, 7.874475, 18.789476, 10.092775, 18.788837, 12.493138);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_9_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9_1 = g.getTransform();
g.transform(new AffineTransform(0.30827099084854126f, 0.0f, 0.0f, 0.30827099084854126f, 23.300350189208984f, 31.57234001159668f));
// _0_0_9_1
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.788837, 12.493138);
((GeneralPath)shape).curveTo(18.789476, 14.893501, 17.509266, 17.111801, 15.430597, 18.312168);
((GeneralPath)shape).curveTo(13.351929, 19.512533, 10.790718, 19.512533, 8.7120495, 18.312168);
((GeneralPath)shape).curveTo(6.6333804, 17.111801, 5.3531694, 14.893501, 5.353809, 12.493138);
((GeneralPath)shape).curveTo(5.3531694, 10.092775, 6.6333804, 7.874475, 8.7120495, 6.6741085);
((GeneralPath)shape).curveTo(10.790718, 5.4737425, 13.351929, 5.4737425, 15.430597, 6.6741085);
((GeneralPath)shape).curveTo(17.509266, 7.874475, 18.789476, 10.092775, 18.788837, 12.493138);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_9_1);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(-0.8062760233879089f, 0.5915399789810181f, 0.5915399789810181f, 0.8062760233879089f, 13.499099731445312f, -31.500219345092773f));
// _0_0_10
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.950260162353516f, 22.930469512939453f));
// _0_0_10_0
paint = new RadialGradientPaint(new Point2D.Double(12.07132339477539, 12.493138313293457), 6.7175145f, new Point2D.Double(12.07132339477539, 12.493138313293457), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.788837, 12.493138);
((GeneralPath)shape).curveTo(18.789476, 14.893501, 17.509266, 17.111801, 15.430597, 18.312168);
((GeneralPath)shape).curveTo(13.351929, 19.512533, 10.790718, 19.512533, 8.7120495, 18.312168);
((GeneralPath)shape).curveTo(6.6333804, 17.111801, 5.3531694, 14.893501, 5.353809, 12.493138);
((GeneralPath)shape).curveTo(5.3531694, 10.092775, 6.6333804, 7.874475, 8.7120495, 6.6741085);
((GeneralPath)shape).curveTo(10.790718, 5.4737425, 13.351929, 5.4737425, 15.430597, 6.6741085);
((GeneralPath)shape).curveTo(17.509266, 7.874475, 18.789476, 10.092775, 18.788837, 12.493138);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_1 = g.getTransform();
g.transform(new AffineTransform(0.30827099084854126f, 0.0f, 0.0f, 0.30827099084854126f, 23.300350189208984f, 31.57234001159668f));
// _0_0_10_1
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.788837, 12.493138);
((GeneralPath)shape).curveTo(18.789476, 14.893501, 17.509266, 17.111801, 15.430597, 18.312168);
((GeneralPath)shape).curveTo(13.351929, 19.512533, 10.790718, 19.512533, 8.7120495, 18.312168);
((GeneralPath)shape).curveTo(6.6333804, 17.111801, 5.3531694, 14.893501, 5.353809, 12.493138);
((GeneralPath)shape).curveTo(5.3531694, 10.092775, 6.6333804, 7.874475, 8.7120495, 6.6741085);
((GeneralPath)shape).curveTo(10.790718, 5.4737425, 13.351929, 5.4737425, 15.430597, 6.6741085);
((GeneralPath)shape).curveTo(17.509266, 7.874475, 18.789476, 10.092775, 18.788837, 12.493138);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_1);
g.setTransform(defaultTransform__0_0_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11 = g.getTransform();
g.transform(new AffineTransform(-0.8702269792556763f, 0.6385719776153564f, 0.6384580135345459f, 0.8703809976577759f, 25.20503044128418f, -35.31277847290039f));
// _0_0_11
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 14.950260162353516f, 22.930469512939453f));
// _0_0_11_0
paint = new RadialGradientPaint(new Point2D.Double(12.07132339477539, 12.493138313293457), 6.7175145f, new Point2D.Double(12.07132339477539, 12.493138313293457), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.788837, 12.493138);
((GeneralPath)shape).curveTo(18.789476, 14.893501, 17.509266, 17.111801, 15.430597, 18.312168);
((GeneralPath)shape).curveTo(13.351929, 19.512533, 10.790718, 19.512533, 8.7120495, 18.312168);
((GeneralPath)shape).curveTo(6.6333804, 17.111801, 5.3531694, 14.893501, 5.353809, 12.493138);
((GeneralPath)shape).curveTo(5.3531694, 10.092775, 6.6333804, 7.874475, 8.7120495, 6.6741085);
((GeneralPath)shape).curveTo(10.790718, 5.4737425, 13.351929, 5.4737425, 15.430597, 6.6741085);
((GeneralPath)shape).curveTo(17.509266, 7.874475, 18.789476, 10.092775, 18.788837, 12.493138);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11_1 = g.getTransform();
g.transform(new AffineTransform(0.30827099084854126f, 0.0f, 0.0f, 0.30827099084854126f, 23.300350189208984f, 31.57234001159668f));
// _0_0_11_1
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.788837, 12.493138);
((GeneralPath)shape).curveTo(18.789476, 14.893501, 17.509266, 17.111801, 15.430597, 18.312168);
((GeneralPath)shape).curveTo(13.351929, 19.512533, 10.790718, 19.512533, 8.7120495, 18.312168);
((GeneralPath)shape).curveTo(6.6333804, 17.111801, 5.3531694, 14.893501, 5.353809, 12.493138);
((GeneralPath)shape).curveTo(5.3531694, 10.092775, 6.6333804, 7.874475, 8.7120495, 6.6741085);
((GeneralPath)shape).curveTo(10.790718, 5.4737425, 13.351929, 5.4737425, 15.430597, 6.6741085);
((GeneralPath)shape).curveTo(17.509266, 7.874475, 18.789476, 10.092775, 18.788837, 12.493138);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11_1);
g.setTransform(defaultTransform__0_0_11);
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
	public applications_internet() {
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

