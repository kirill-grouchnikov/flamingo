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

/**
 * This class has been automatically generated using <a
 * href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class appointment_new implements
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
g.transform(new AffineTransform(2.5631580352783203f, 0.0f, 0.0f, 1.2196019887924194f, -55.98413848876953f, 14.0414400100708f));
// _0_0_0
paint = new RadialGradientPaint(new Point2D.Double(31.11269760131836, 19.008621215820312), 8.662058f, new Point2D.Double(31.11269760131836, 19.008621215820312), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(39.774754, 19.008621);
((GeneralPath)shape).curveTo(39.776207, 22.104244, 38.125546, 24.96534, 35.4449, 26.51357);
((GeneralPath)shape).curveTo(32.76425, 28.061802, 29.461142, 28.061802, 26.780495, 26.51357);
((GeneralPath)shape).curveTo(24.099848, 24.96534, 22.449186, 22.104244, 22.45064, 19.008621);
((GeneralPath)shape).curveTo(22.449186, 15.912998, 24.099848, 13.051903, 26.780495, 11.503672);
((GeneralPath)shape).curveTo(29.461142, 9.9554405, 32.76425, 9.9554405, 35.4449, 11.503672);
((GeneralPath)shape).curveTo(38.125546, 13.051903, 39.776207, 15.912998, 39.774754, 19.008621);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new LinearGradientPaint(new Point2D.Double(8.915647506713867, 37.197017669677734), new Point2D.Double(9.885503768920898, 52.09067916870117), new float[] {0.0f,1.0f}, new Color[] {new Color(154, 162, 154, 255),new Color(181, 190, 181, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.1238410472869873f, 0.0f, 0.0f, 0.9696909785270691f, -31.88758087158203f, -19.594919204711914f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.587591, 1.403729);
((GeneralPath)shape).lineTo(4.226755, 18.096664);
((GeneralPath)shape).lineTo(5.4854717, 19.339844);
((GeneralPath)shape).lineTo(18.587591, 1.403729);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new Color(254, 254, 254, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.467176, 1.3138036);
((GeneralPath)shape).lineTo(5.6605716, 19.072613);
((GeneralPath)shape).lineTo(7.4900985, 20.687914);
((GeneralPath)shape).lineTo(18.467176, 1.3138036);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.4315290451049805f, 0.0f, 0.0f, 1.4315290451049805f, 0.5694590210914612f, -1.6546180248260498f));
// _0_0_3
paint = new RadialGradientPaint(new Point2D.Double(8.746825218200684, 6.8283233642578125), 29.889715f, new Point2D.Double(8.746825218200684, 6.8283233642578125), new float[] {0.0f,1.0f}, new Color[] {new Color(148, 151, 179, 255),new Color(76, 64, 89, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.160713, 16.910715);
((GeneralPath)shape).curveTo(31.16206, 22.238699, 28.320389, 27.162535, 23.706446, 29.826914);
((GeneralPath)shape).curveTo(19.0925, 32.491295, 13.407498, 32.491295, 8.793554, 29.826914);
((GeneralPath)shape).curveTo(4.17961, 27.162535, 1.3379384, 22.238699, 1.3392859, 16.910715);
((GeneralPath)shape).curveTo(1.3379384, 11.582732, 4.17961, 6.658896, 8.793554, 3.9945154);
((GeneralPath)shape).curveTo(13.407498, 1.3301349, 19.0925, 1.3301349, 23.706446, 3.9945154);
((GeneralPath)shape).curveTo(28.320389, 6.658896, 31.16206, 11.582732, 31.160713, 16.910715);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(96, 87, 115, 255);
stroke = new BasicStroke(0.69855404f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.160713, 16.910715);
((GeneralPath)shape).curveTo(31.16206, 22.238699, 28.320389, 27.162535, 23.706446, 29.826914);
((GeneralPath)shape).curveTo(19.0925, 32.491295, 13.407498, 32.491295, 8.793554, 29.826914);
((GeneralPath)shape).curveTo(4.17961, 27.162535, 1.3379384, 22.238699, 1.3392859, 16.910715);
((GeneralPath)shape).curveTo(1.3379384, 11.582732, 4.17961, 6.658896, 8.793554, 3.9945154);
((GeneralPath)shape).curveTo(13.407498, 1.3301349, 19.0925, 1.3301349, 23.706446, 3.9945154);
((GeneralPath)shape).curveTo(28.320389, 6.658896, 31.16206, 11.582732, 31.160713, 16.910715);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.1638380289077759f, 0.0f, 0.0f, 1.1638380289077759f, 4.824800968170166f, 2.7775559425354004f));
// _0_0_4
paint = new RadialGradientPaint(new Point2D.Double(11.901995658874512, 10.045443534851074), 29.292715f, new Point2D.Double(11.901995658874512, 10.045443534851074), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 253, 255),new Color(203, 203, 201, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.160713, 16.910715);
((GeneralPath)shape).curveTo(31.16206, 22.238699, 28.320389, 27.162535, 23.706446, 29.826914);
((GeneralPath)shape).curveTo(19.0925, 32.491295, 13.407498, 32.491295, 8.793554, 29.826914);
((GeneralPath)shape).curveTo(4.17961, 27.162535, 1.3379384, 22.238699, 1.3392859, 16.910715);
((GeneralPath)shape).curveTo(1.3379384, 11.582732, 4.17961, 6.658896, 8.793554, 3.9945154);
((GeneralPath)shape).curveTo(13.407498, 1.3301349, 19.0925, 1.3301349, 23.706446, 3.9945154);
((GeneralPath)shape).curveTo(28.320389, 6.658896, 31.16206, 11.582732, 31.160713, 16.910715);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(6.3422160148620605, 7.789332389831543), new Point2D.Double(22.21842384338379, 25.884273529052734), new float[] {0.0f,1.0f}, new Color[] {new Color(160, 160, 160, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.711396f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.160713, 16.910715);
((GeneralPath)shape).curveTo(31.16206, 22.238699, 28.320389, 27.162535, 23.706446, 29.826914);
((GeneralPath)shape).curveTo(19.0925, 32.491295, 13.407498, 32.491295, 8.793554, 29.826914);
((GeneralPath)shape).curveTo(4.17961, 27.162535, 1.3379384, 22.238699, 1.3392859, 16.910715);
((GeneralPath)shape).curveTo(1.3379384, 11.582732, 4.17961, 6.658896, 8.793554, 3.9945154);
((GeneralPath)shape).curveTo(13.407498, 1.3301349, 19.0925, 1.3301349, 23.706446, 3.9945154);
((GeneralPath)shape).curveTo(28.320389, 6.658896, 31.16206, 11.582732, 31.160713, 16.910715);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.7699509859085083f, 0.0f, 0.0f, 1.7699509859085083f, -17.024240493774414f, 1.6107410192489624f));
// _0_0_5
paint = new RadialGradientPaint(new Point2D.Double(23.375, 10.97286319732666), 3.3478093f, new Point2D.Double(23.375, 10.97286319732666), new float[] {0.0f,1.0f}, new Color[] {new Color(196, 160, 0, 255),new Color(196, 160, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.630419969558716f, 1.654030035223679E-15f, -1.6087429951822541E-15f, 3.742065906524658f, -61.48606872558594f, -29.186180114746094f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.679382, 6.638714);
((GeneralPath)shape).curveTo(18.281221, 4.5904484, 20.732477, 3.3880484, 23.332691, 3.3751054);
((GeneralPath)shape).lineTo(23.375, 11.875);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(19.6673641204834, 4.257066249847412), new Point2D.Double(20.329933166503906, 5.284587383270264), new float[] {0.0f,1.0f}, new Color[] {new Color(196, 160, 0, 255),new Color(196, 160, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.56498736f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.679382, 6.638714);
((GeneralPath)shape).curveTo(18.281221, 4.5904484, 20.732477, 3.3880484, 23.332691, 3.3751054);
((GeneralPath)shape).lineTo(23.375, 11.875);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_6 = g.getTransform();
g.transform(new AffineTransform(2.0732951164245605f, 0.0f, 0.0f, 2.0732951164245605f, -7.3102240562438965f, -13.136819839477539f));
// _0_0_6
paint = new Color(243, 243, 243, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.40625, 17.28125);
((GeneralPath)shape).curveTo(16.40625, 17.954348, 15.860597, 18.5, 15.1875, 18.5);
((GeneralPath)shape).curveTo(14.514403, 18.5, 13.96875, 17.954348, 13.96875, 17.28125);
((GeneralPath)shape).curveTo(13.96875, 16.608152, 14.514403, 16.0625, 15.1875, 16.0625);
((GeneralPath)shape).curveTo(15.860597, 16.0625, 16.40625, 16.608152, 16.40625, 17.28125);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.48232403f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.40625, 17.28125);
((GeneralPath)shape).curveTo(16.40625, 17.954348, 15.860597, 18.5, 15.1875, 18.5);
((GeneralPath)shape).curveTo(14.514403, 18.5, 13.96875, 17.954348, 13.96875, 17.28125);
((GeneralPath)shape).curveTo(13.96875, 16.608152, 14.514403, 16.0625, 15.1875, 16.0625);
((GeneralPath)shape).curveTo(15.860597, 16.0625, 16.40625, 16.608152, 16.40625, 17.28125);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.0f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(22.176615, 20.718014);
((GeneralPath)shape).lineTo(13.155702, 13.140282);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(2.0f,1,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.408613, 29.776506);
((GeneralPath)shape).lineTo(22.368654, 25.283228);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_9 = g.getTransform();
g.transform(new AffineTransform(2.749492883682251f, 0.0f, 0.0f, 2.749492883682251f, -22.300729751586914f, -12.409390449523926f));
// _0_0_9
paint = new Color(182, 185, 177, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.324118, 7.6932044);
((GeneralPath)shape).curveTo(17.324118, 8.034913, 17.047108, 8.311924, 16.705399, 8.311924);
((GeneralPath)shape).curveTo(16.36369, 8.311924, 16.08668, 8.034913, 16.08668, 7.6932044);
((GeneralPath)shape).curveTo(16.08668, 7.3514953, 16.36369, 7.0744853, 16.705399, 7.0744853);
((GeneralPath)shape).curveTo(17.047108, 7.0744853, 17.324118, 7.3514953, 17.324118, 7.6932044);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_10 = g.getTransform();
g.transform(new AffineTransform(2.749492883682251f, 0.0f, 0.0f, 2.749492883682251f, -22.300729751586914f, 14.809220314025879f));
// _0_0_10
paint = new Color(182, 185, 177, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.324118, 7.6932044);
((GeneralPath)shape).curveTo(17.324118, 8.034913, 17.047108, 8.311924, 16.705399, 8.311924);
((GeneralPath)shape).curveTo(16.36369, 8.311924, 16.08668, 8.034913, 16.08668, 7.6932044);
((GeneralPath)shape).curveTo(16.08668, 7.3514953, 16.36369, 7.0744853, 16.705399, 7.0744853);
((GeneralPath)shape).curveTo(17.047108, 7.0744853, 17.324118, 7.3514953, 17.324118, 7.6932044);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_10);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_11 = g.getTransform();
g.transform(new AffineTransform(2.749492883682251f, 0.0f, 0.0f, 2.749492883682251f, -35.91004180908203f, 1.1998900175094604f));
// _0_0_11
paint = new Color(182, 185, 177, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.324118, 7.6932044);
((GeneralPath)shape).curveTo(17.324118, 8.034913, 17.047108, 8.311924, 16.705399, 8.311924);
((GeneralPath)shape).curveTo(16.36369, 8.311924, 16.08668, 8.034913, 16.08668, 7.6932044);
((GeneralPath)shape).curveTo(16.08668, 7.3514953, 16.36369, 7.0744853, 16.705399, 7.0744853);
((GeneralPath)shape).curveTo(17.047108, 7.0744853, 17.324118, 7.3514953, 17.324118, 7.6932044);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_11);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_12 = g.getTransform();
g.transform(new AffineTransform(2.749492883682251f, 0.0f, 0.0f, 2.749492883682251f, -8.691448211669922f, 1.1998900175094604f));
// _0_0_12
paint = new Color(182, 185, 177, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.324118, 7.6932044);
((GeneralPath)shape).curveTo(17.324118, 8.034913, 17.047108, 8.311924, 16.705399, 8.311924);
((GeneralPath)shape).curveTo(16.36369, 8.311924, 16.08668, 8.034913, 16.08668, 7.6932044);
((GeneralPath)shape).curveTo(16.08668, 7.3514953, 16.36369, 7.0744853, 16.705399, 7.0744853);
((GeneralPath)shape).curveTo(17.047108, 7.0744853, 17.324118, 7.3514953, 17.324118, 7.6932044);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_12);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_13 = g.getTransform();
g.transform(new AffineTransform(1.3576539754867554f, 0.0f, 0.0f, 1.3576539754867554f, 1.7698960304260254f, -0.4937349855899811f));
// _0_0_13
paint = new RadialGradientPaint(new Point2D.Double(11.32919979095459, 10.583970069885254), 15.532059f, new Point2D.Double(11.32919979095459, 10.583970069885254), new float[] {0.0f,1.0f}, new Color[] {new Color(243, 244, 255, 255),new Color(145, 147, 175, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.7365651f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.160713, 16.910715);
((GeneralPath)shape).curveTo(31.16206, 22.238699, 28.320389, 27.162535, 23.706446, 29.826914);
((GeneralPath)shape).curveTo(19.0925, 32.491295, 13.407498, 32.491295, 8.793554, 29.826914);
((GeneralPath)shape).curveTo(4.17961, 27.162535, 1.3379384, 22.238699, 1.3392859, 16.910715);
((GeneralPath)shape).curveTo(1.3379384, 11.582732, 4.17961, 6.658896, 8.793554, 3.9945154);
((GeneralPath)shape).curveTo(13.407498, 1.3301349, 19.0925, 1.3301349, 23.706446, 3.9945154);
((GeneralPath)shape).curveTo(28.320389, 6.658896, 31.16206, 11.582732, 31.160713, 16.910715);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_13);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_14 = g.getTransform();
g.transform(new AffineTransform(0.6111270189285278f, 0.0f, 0.0f, 0.6111270189285278f, 5.5440521240234375f, -66.92817687988281f));
// _0_0_14
paint = new RadialGradientPaint(new Point2D.Double(55.0, 125.0), 14.375f, new Point2D.Double(55.0, 125.0), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 245, 32, 227),new Color(255, 243, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(69.375, 125.0);
((GeneralPath)shape).curveTo(69.375, 132.93909, 62.939095, 139.375, 55.0, 139.375);
((GeneralPath)shape).curveTo(47.060905, 139.375, 40.625, 132.93909, 40.625, 125.0);
((GeneralPath)shape).curveTo(40.625, 117.060905, 47.060905, 110.625, 55.0, 110.625);
((GeneralPath)shape).curveTo(62.939095, 110.625, 69.375, 117.060905, 69.375, 125.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_14);
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
		return 47;
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
	public appointment_new() {
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

