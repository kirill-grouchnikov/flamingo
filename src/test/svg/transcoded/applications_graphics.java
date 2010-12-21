package test.svg.transcoded;

import java.awt.*;
import java.awt.geom.*;

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class applications_graphics implements
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
g.setComposite(AlphaComposite.getInstance(3, 0.3f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0692239999771118f, 0.0f, 0.0f, 1.1229749917984009f, 5.769028186798096f, -7.116159915924072f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(26.78166961669922, 42.34314727783203), 14.407301f, new Point2D.Double(26.78166961669922, 42.34314727783203), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.28220900893211365f, 2.9361279033079946E-15f, 30.393550872802734f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(41.188972, 42.343147);
((GeneralPath)shape).curveTo(41.188972, 43.795742, 38.442955, 45.137993, 33.98532, 45.86429);
((GeneralPath)shape).curveTo(29.527687, 46.590588, 24.035654, 46.590588, 19.57802, 45.86429);
((GeneralPath)shape).curveTo(15.120385, 45.137993, 12.374369, 43.795742, 12.374369, 42.343147);
((GeneralPath)shape).curveTo(12.374369, 40.890553, 15.120385, 39.5483, 19.57802, 38.822006);
((GeneralPath)shape).curveTo(24.035654, 38.095707, 29.527687, 38.095707, 33.98532, 38.822006);
((GeneralPath)shape).curveTo(38.442955, 39.5483, 41.188972, 40.890553, 41.188972, 42.343147);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new LinearGradientPaint(new Point2D.Double(28.058631896972656, 18.867767333984375), new Point2D.Double(33.43698501586914, 23.742767333984375), new float[] {0.0f,0.24242425f,0.6212121f,1.0f}, new Color[] {new Color(110, 61, 9, 255),new Color(234, 129, 19, 255),new Color(92, 51, 7, 255),new Color(224, 124, 18, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -3.906949996948242f, -1.8028559684753418f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.651682, 22.586735);
((GeneralPath)shape).lineTo(23.717546, 26.387432);
((GeneralPath)shape).curveTo(30.905045, 19.324934, 41.500607, 2.4101455, 41.500607, 2.4101455);
((GeneralPath)shape).curveTo(41.930096, 1.1856993, 40.41336, 0.41425264, 39.654255, 1.2396505);
((GeneralPath)shape).curveTo(39.654255, 1.2396505, 25.964182, 15.336736, 19.651682, 22.586735);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(103, 57, 7, 255);
stroke = new BasicStroke(1.0f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.651682, 22.586735);
((GeneralPath)shape).lineTo(23.717546, 26.387432);
((GeneralPath)shape).curveTo(30.905045, 19.324934, 41.500607, 2.4101455, 41.500607, 2.4101455);
((GeneralPath)shape).curveTo(41.930096, 1.1856993, 40.41336, 0.41425264, 39.654255, 1.2396505);
((GeneralPath)shape).curveTo(39.654255, 1.2396505, 25.964182, 15.336736, 19.651682, 22.586735);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new LinearGradientPaint(new Point2D.Double(19.39473533630371, 30.001331329345703), new Point2D.Double(23.109331130981445, 33.4388313293457), new float[] {0.0f,0.33333334f,0.6666667f,1.0f}, new Color[] {new Color(189, 189, 189, 255),new Color(226, 226, 226, 255),new Color(163, 163, 163, 255),new Color(221, 221, 221, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -3.906949996948242f, -1.8028559684753418f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.050285, 32.813892);
((GeneralPath)shape).lineTo(14.296605, 34.747715);
((GeneralPath)shape).lineTo(22.789371, 27.380684);
((GeneralPath)shape).lineTo(23.064432, 26.674854);
((GeneralPath)shape).lineTo(24.158836, 26.65704);
((GeneralPath)shape).curveTo(23.721336, 25.09454, 21.217323, 22.273584, 19.342323, 22.273584);
((GeneralPath)shape).lineTo(19.424341, 23.36366);
((GeneralPath)shape).lineTo(18.75435, 23.743687);
((GeneralPath)shape).lineTo(12.050285, 32.813892);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(136, 138, 133, 255);
stroke = new BasicStroke(1.0f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.050285, 32.813892);
((GeneralPath)shape).lineTo(14.296605, 34.747715);
((GeneralPath)shape).lineTo(22.789371, 27.380684);
((GeneralPath)shape).lineTo(23.064432, 26.674854);
((GeneralPath)shape).lineTo(24.158836, 26.65704);
((GeneralPath)shape).curveTo(23.721336, 25.09454, 21.217323, 22.273584, 19.342323, 22.273584);
((GeneralPath)shape).lineTo(19.424341, 23.36366);
((GeneralPath)shape).lineTo(18.75435, 23.743687);
((GeneralPath)shape).lineTo(12.050285, 32.813892);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.3f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.3383699655532837f, 0.0f, 0.0f, 1.0f, -20.92639923095703f, -3.409010887145996f));
// _0_0_3
paint = new RadialGradientPaint(new Point2D.Double(26.78166961669922, 42.34314727783203), 14.407301f, new Point2D.Double(26.78166961669922, 42.34314727783203), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.28220900893211365f, 1.679212007108194E-15f, 30.393550872802734f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(41.188972, 42.343147);
((GeneralPath)shape).curveTo(41.188972, 43.795742, 38.442955, 45.137993, 33.98532, 45.86429);
((GeneralPath)shape).curveTo(29.527687, 46.590588, 24.035654, 46.590588, 19.57802, 45.86429);
((GeneralPath)shape).curveTo(15.120385, 45.137993, 12.374369, 43.795742, 12.374369, 42.343147);
((GeneralPath)shape).curveTo(12.374369, 40.890553, 15.120385, 39.5483, 19.57802, 38.822006);
((GeneralPath)shape).curveTo(24.035654, 38.095707, 29.527687, 38.095707, 33.98532, 38.822006);
((GeneralPath)shape).curveTo(38.442955, 39.5483, 41.188972, 40.890553, 41.188972, 42.343147);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
paint = new RadialGradientPaint(new Point2D.Double(15.415101051330566, 35.35650634765625), 7.5791564f, new Point2D.Double(15.415101051330566, 35.35650634765625), new float[] {0.0f,1.0f}, new Color[] {new Color(105, 105, 105, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9946550130844116f, 3.2628759978485836E-16f, 6.564545998802296E-13f, 0.9693220257759094f, -4.583016872406006f, 0.1659190058708191f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(1.757709, 40.723915);
((GeneralPath)shape).curveTo(8.363022, 40.723915, 13.375896, 41.510517, 14.324934, 36.70484);
((GeneralPath)shape).curveTo(15.089727, 32.832134, 9.764609, 30.976482, 7.1258025, 34.433792);
((GeneralPath)shape).curveTo(4.583799, 37.76427, 1.757709, 40.723915, 1.757709, 40.723915);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 0.5277778f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(0.8522980213165283f, 0.0f, 0.0f, 0.8522980213165283f, 3.733553886413574f, 2.57560396194458f));
// _0_0_5
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.874999, 37.75);
((GeneralPath)shape).curveTo(8.874999, 38.196583, 8.63675, 38.60924, 8.249999, 38.83253);
((GeneralPath)shape).curveTo(7.863248, 39.055824, 7.38675, 39.055824, 6.999999, 38.83253);
((GeneralPath)shape).curveTo(6.613248, 38.60924, 6.374999, 38.196583, 6.374999, 37.75);
((GeneralPath)shape).curveTo(6.374999, 37.303417, 6.613248, 36.89076, 6.999999, 36.66747);
((GeneralPath)shape).curveTo(7.38675, 36.444176, 7.863248, 36.444176, 8.249999, 36.66747);
((GeneralPath)shape).curveTo(8.63675, 36.89076, 8.874999, 37.303417, 8.874999, 37.75);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(0.78786700963974f, 0.0f, 0.0f, 0.78786700963974f, 14.265379905700684f, -4.723365783691406f));
// _0_0_6
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.874999, 37.75);
((GeneralPath)shape).curveTo(8.874999, 38.196583, 8.63675, 38.60924, 8.249999, 38.83253);
((GeneralPath)shape).curveTo(7.863248, 39.055824, 7.38675, 39.055824, 6.999999, 38.83253);
((GeneralPath)shape).curveTo(6.613248, 38.60924, 6.374999, 38.196583, 6.374999, 37.75);
((GeneralPath)shape).curveTo(6.374999, 37.303417, 6.613248, 36.89076, 6.999999, 36.66747);
((GeneralPath)shape).curveTo(7.38675, 36.444176, 7.863248, 36.444176, 8.249999, 36.66747);
((GeneralPath)shape).curveTo(8.63675, 36.89076, 8.874999, 37.303417, 8.874999, 37.75);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.941439, 26.398153);
((GeneralPath)shape).lineTo(13.638137, 32.541145);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 0.42777777f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new LinearGradientPaint(new Point2D.Double(13.236154556274414, 37.75224685668945), new Point2D.Double(7.752109050750732, 42.28214645385742), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8522980213165283f, 0.0f, 0.0f, 0.8522980213165283f, -1.6751070022583008f, 3.753977060317993f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(3.070887, 40.068977);
((GeneralPath)shape).curveTo(3.070887, 40.068977, 6.4119987, 38.427155, 7.835716, 35.982147);
((GeneralPath)shape).curveTo(8.339422, 35.11711, 9.480088, 35.855312, 8.777382, 36.716644);
((GeneralPath)shape).curveTo(7.259554, 38.577103, 3.070887, 40.068977, 3.070887, 40.068977);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 0.53333324f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(0.23786699771881104f, 0.0f, 0.0f, 0.23786699771881104f, 38.43389129638672f, -7.101027965545654f));
// _0_0_9
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.874999, 37.75);
((GeneralPath)shape).curveTo(8.874999, 38.196583, 8.63675, 38.60924, 8.249999, 38.83253);
((GeneralPath)shape).curveTo(7.863248, 39.055824, 7.38675, 39.055824, 6.999999, 38.83253);
((GeneralPath)shape).curveTo(6.613248, 38.60924, 6.374999, 38.196583, 6.374999, 37.75);
((GeneralPath)shape).curveTo(6.374999, 37.303417, 6.613248, 36.89076, 6.999999, 36.66747);
((GeneralPath)shape).curveTo(7.38675, 36.444176, 7.863248, 36.444176, 8.249999, 36.66747);
((GeneralPath)shape).curveTo(8.63675, 36.89076, 8.874999, 37.303417, 8.874999, 37.75);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_0
paint = new LinearGradientPaint(new Point2D.Double(52.71793746948242, 2.3161637783050537), new Point2D.Double(67.46598815917969, 2.3161637783050537), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 159, 207, 255),new Color(60, 116, 177, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8624820113182068f, 0.0f, 0.0f, 0.5807179808616638f, -16.256969451904297f, 11.013480186462402f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.12694, 7.350076);
((GeneralPath)shape).curveTo(32.069084, 7.437365, 29.642551, 8.406158, 29.642551, 9.5744095);
((GeneralPath)shape).curveTo(29.642551, 9.852109, 29.642551, 12.866829, 29.642551, 13.144528);
((GeneralPath)shape).curveTo(29.642551, 14.370234, 32.313484, 15.368861, 35.58397, 15.368861);
((GeneralPath)shape).curveTo(38.854458, 15.368861, 41.5, 14.370234, 41.5, 13.144528);
((GeneralPath)shape).curveTo(41.5, 12.866829, 41.5, 9.852109, 41.5, 9.5744095);
((GeneralPath)shape).curveTo(41.5, 8.348703, 38.854458, 7.350076, 35.58397, 7.350076);
((GeneralPath)shape).curveTo(35.430668, 7.350076, 35.277325, 7.3457828, 35.12694, 7.350076);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(32, 74, 135, 255);
stroke = new BasicStroke(0.9999998f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.12694, 7.350076);
((GeneralPath)shape).curveTo(32.069084, 7.437365, 29.642551, 8.406158, 29.642551, 9.5744095);
((GeneralPath)shape).curveTo(29.642551, 9.852109, 29.642551, 12.866829, 29.642551, 13.144528);
((GeneralPath)shape).curveTo(29.642551, 14.370234, 32.313484, 15.368861, 35.58397, 15.368861);
((GeneralPath)shape).curveTo(38.854458, 15.368861, 41.5, 14.370234, 41.5, 13.144528);
((GeneralPath)shape).curveTo(41.5, 12.866829, 41.5, 9.852109, 41.5, 9.5744095);
((GeneralPath)shape).curveTo(41.5, 8.348703, 38.854458, 7.350076, 35.58397, 7.350076);
((GeneralPath)shape).curveTo(35.430668, 7.350076, 35.277325, 7.3457828, 35.12694, 7.350076);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_10_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_1 = g.getTransform();
g.transform(new AffineTransform(0.886277973651886f, 0.0f, 0.0f, 0.4689140021800995f, -10.443920135498047f, -9.71885871887207f));
// _0_0_10_1
paint = new Color(52, 101, 164, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(57.375, 49.75);
((GeneralPath)shape).curveTo(57.375, 50.578426, 54.96853, 51.25, 52.0, 51.25);
((GeneralPath)shape).curveTo(49.03147, 51.25, 46.625, 50.578426, 46.625, 49.75);
((GeneralPath)shape).curveTo(46.625, 48.921574, 49.03147, 48.25, 52.0, 48.25);
((GeneralPath)shape).curveTo(54.96853, 48.25, 57.375, 48.921574, 57.375, 49.75);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_2
paint = new LinearGradientPaint(new Point2D.Double(53.168766021728516, 24.244796752929688), new Point2D.Double(69.69099426269531, 24.244796752929688), new float[] {0.0f,1.0f}, new Color[] {new Color(242, 242, 242, 255),new Color(195, 195, 195, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7194399833679199f, 0.0f, 0.0f, 0.7189139723777771f, -7.69625186920166f, 9.471728324890137f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(27.926447, 39.155468);
((GeneralPath)shape).lineTo(28.973455, 17.806032);
((GeneralPath)shape).lineTo(31.460102, 14.14252);
((GeneralPath)shape).curveTo(33.431393, 13.507083, 38.186527, 13.507083, 39.96705, 14.14252);
((GeneralPath)shape).lineTo(42.453697, 17.174393);
((GeneralPath)shape).lineTo(45.07122, 39.66078);
((GeneralPath)shape).lineTo(27.926447, 39.155468);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(90, 90, 90, 255);
stroke = new BasicStroke(1.0000004f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(27.926447, 39.155468);
((GeneralPath)shape).lineTo(28.973455, 17.806032);
((GeneralPath)shape).lineTo(31.460102, 14.14252);
((GeneralPath)shape).curveTo(33.431393, 13.507083, 38.186527, 13.507083, 39.96705, 14.14252);
((GeneralPath)shape).lineTo(42.453697, 17.174393);
((GeneralPath)shape).lineTo(45.07122, 39.66078);
((GeneralPath)shape).lineTo(27.926447, 39.155468);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_10_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_3
paint = new LinearGradientPaint(new Point2D.Double(61.87184524536133, 29.615222930908203), new Point2D.Double(61.87184524536133, 41.45926284790039), new float[] {0.0f,1.0f}, new Color[] {new Color(174, 174, 174, 255),new Color(196, 196, 196, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.8886190056800842f, 0.0f, 0.0f, 0.7189139723777771f, -18.297679901123047f, 9.471728324890137f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.828495, 38.896107);
((GeneralPath)shape).curveTo(28.828495, 38.896107, 31.419168, 29.364565, 36.368683, 29.364565);
((GeneralPath)shape).curveTo(41.475285, 29.364565, 44.537216, 39.27737, 44.537216, 39.27737);
((GeneralPath)shape).lineTo(28.828495, 38.896107);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_4
paint = new LinearGradientPaint(new Point2D.Double(49.8530387878418, 64.2596206665039), new Point2D.Double(62.76822280883789, 64.2596206665039), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 159, 207, 255),new Color(43, 85, 130, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7189139723777771f, 0.0f, 0.0f, 0.7189139723777771f, -1.897102952003479f, -22.4248104095459f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.180138, 20.498709);
((GeneralPath)shape).lineTo(28.884226, 26.97345);
((GeneralPath)shape).curveTo(30.546715, 25.895079, 40.876736, 25.708963, 43.22785, 27.361097);
((GeneralPath)shape).lineTo(42.526302, 20.763784);
((GeneralPath)shape).curveTo(41.12834, 19.81063, 31.943464, 19.28554, 29.180138, 20.498709);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_4);
g.setComposite(AlphaComposite.getInstance(3, 0.5944443f * origAlpha));
AffineTransform defaultTransform__0_0_10_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_5
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0000001f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.048761, 38.222095);
((GeneralPath)shape).lineTo(29.926258, 18.027784);
((GeneralPath)shape).lineTo(31.766226, 14.994949);
((GeneralPath)shape).curveTo(33.58478, 14.402774, 37.971485, 14.402774, 39.614048, 14.994949);
((GeneralPath)shape).lineTo(41.57453, 17.527534);
((GeneralPath)shape).lineTo(44.026752, 38.7759);
((GeneralPath)shape).lineTo(29.048761, 38.222095);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_10_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_6
paint = new LinearGradientPaint(new Point2D.Double(60.168766021728516, 40.11979675292969), new Point2D.Double(60.44099426269531, 43.86979675292969), new float[] {0.0f,1.0f}, new Color[] {new Color(242, 242, 242, 255),new Color(195, 195, 195, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7373070120811462f, 0.0f, 0.0f, 0.7708539962768555f, -8.532023429870605f, 7.121635913848877f));
shape = new RoundRectangle2D.Double(26.512788772583008, 37.5361328125, 19.97441291809082, 3.9277524948120117, 1.7677682638168335, 1.767767310142517);
g.setPaint(paint);
g.fill(shape);
paint = new Color(90, 90, 90, 255);
stroke = new BasicStroke(1.0000006f,1,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(26.512788772583008, 37.5361328125, 19.97441291809082, 3.9277524948120117, 1.7677682638168335, 1.767767310142517);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_10_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_7
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.39522, 17.99645);
((GeneralPath)shape).curveTo(31.269756, 16.630262, 38.493153, 16.341276, 42.11514, 17.389748);
((GeneralPath)shape).lineTo(39.777733, 14.504124);
((GeneralPath)shape).curveTo(37.299534, 13.836916, 33.853386, 14.128358, 31.502272, 14.573164);
((GeneralPath)shape).lineTo(29.39522, 17.99645);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_7);
g.setComposite(AlphaComposite.getInstance(3, 0.8611111f * origAlpha));
AffineTransform defaultTransform__0_0_10_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_8
paint = new LinearGradientPaint(new Point2D.Double(48.25, 54.75), new Point2D.Double(48.25, 71.25), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7189139723777771f, 0.0f, 0.0f, 0.7189139723777771f, -1.897102952003479f, -20.686059951782227f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.172941, 17.416382);
((GeneralPath)shape).lineTo(31.172941, 32.87303);
((GeneralPath)shape).lineTo(34.408054, 29.278463);
((GeneralPath)shape).lineTo(34.048595, 16.697468);
((GeneralPath)shape).lineTo(31.172941, 17.416382);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_8);
g.setComposite(AlphaComposite.getInstance(3, 0.5777778f * origAlpha));
AffineTransform defaultTransform__0_0_10_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_9
g.setComposite(AlphaComposite.getInstance(3, 0.41111112f * origAlpha));
AffineTransform defaultTransform__0_0_10_9_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_9_0
paint = new Color(230, 231, 230, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.009392, 9.380974);
((GeneralPath)shape).lineTo(31.009392, 12.621009);
((GeneralPath)shape).curveTo(31.009392, 12.621009, 31.62058, 12.273323, 32.0, 12.259688);
((GeneralPath)shape).lineTo(32.0, 9.0);
((GeneralPath)shape).curveTo(31.518429, 9.069463, 31.009392, 9.380974, 31.009392, 9.380974);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_9_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10_9_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_9_1
paint = new Color(230, 231, 230, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(33.00939, 8.759965);
((GeneralPath)shape).lineTo(33.00939, 12.0);
((GeneralPath)shape).curveTo(33.00939, 12.0, 33.62058, 11.917479, 34.0, 11.903844);
((GeneralPath)shape).lineTo(34.0, 8.588913);
((GeneralPath)shape).curveTo(33.4884, 8.614718, 33.00939, 8.759965, 33.00939, 8.759965);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_9_1);
g.setComposite(AlphaComposite.getInstance(3, 0.44444445f * origAlpha));
AffineTransform defaultTransform__0_0_10_9_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10_9_2
paint = new Color(230, 231, 230, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.00939, 8.561091);
((GeneralPath)shape).lineTo(35.00939, 11.856369);
((GeneralPath)shape).curveTo(35.00939, 11.856369, 35.56534, 11.851187, 36.0, 11.870698);
((GeneralPath)shape).lineTo(36.0, 8.53367);
((GeneralPath)shape).curveTo(35.499447, 8.482136, 35.00939, 8.561091, 35.00939, 8.561091);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10_9_2);
g.setTransform(defaultTransform__0_0_10_9);
g.setTransform(defaultTransform__0_0_10);
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
		return 45;
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
	public applications_graphics() {
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

