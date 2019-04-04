package pers.geng.qing.ky;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import org.jfree.fx.FXGraphics2D;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

/**
 * Created by Geng Qing on 2019-03-25
 **/

public class MathFormulaCanvas extends Canvas {

    public FXGraphics2D fxGraphics2D;

    public TeXIcon teXIcon;


    public MathFormulaCanvas() {
        super();
        this.fxGraphics2D = new FXGraphics2D(getGraphicsContext2D());

        // create a formula
        TeXFormula formula = new TeXFormula("FORMULA");

        // render the formula to an teXIcon of the same size as the formula.
        this.teXIcon = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, 30);

        // Redraw canvas when size changes.
        widthProperty().addListener(evt -> draw());
        heightProperty().addListener(evt -> draw());
    }

    public void drawFormula(String math, int size) {

        TeXFormula formula = new TeXFormula(math);
        // render the formula to an teXIcon of the same size as the formula.
        this.teXIcon = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, size);
        draw();


    }

    public void draw() {
        double width = getWidth();
        double height = getHeight();
        getGraphicsContext2D().clearRect(0, 0, width, height);

        // ideally it should be possible to draw directly to the FXGraphics2D
        // instance without creating an image first...but this does not generate
        // good output
        //this.teXIcon.paintIcon(new JLabel(), fxGraphics2D, 50, 50);

        // now create an actual image of the rendered equation
        BufferedImage bufferedImage = new BufferedImage(teXIcon.getIconWidth(), teXIcon.getIconHeight(),
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setColor(Color.WHITE);
        graphics2D.fillRect(0, 0, teXIcon.getIconWidth(), teXIcon.getIconHeight());
        JLabel jLabel = new JLabel();
        jLabel.setForeground(new Color(0, 0, 0));
        teXIcon.paintIcon(jLabel, graphics2D, 0, 0);
        // at this point the image is created, you could also save it with ImageIO

        try {
            Image image = SwingFXUtils.toFXImage(bufferedImage, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.fxGraphics2D.drawImage(bufferedImage, 0, 0, null);
//        try {
//            ImageIO.write(bufferedImage, "jpg", new File("out.jpg"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public boolean isResizable() {
        return true;
    }

    @Override
    public double prefWidth(double height) {
        return getWidth();
    }

    @Override
    public double prefHeight(double width) {
        return getHeight();
    }

    public static Image getImage() {

        TeXFormula formula = new TeXFormula("方程$f(x)$的解: \\\\ $$x=\\frac{-b \\pm \\sqrt {b^2-4ac}}{2a}$$");
        TeXIcon icon = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, 30);
        BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(),
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setColor(Color.WHITE);
        graphics2D.fillRect(0, 0, icon.getIconWidth(), icon.getIconHeight());
        JLabel jLabel = new JLabel();
        jLabel.setForeground(new Color(0, 0, 0));
        icon.paintIcon(jLabel, graphics2D, 0, 0);
        Image image = SwingFXUtils.toFXImage(bufferedImage, null);
        return image;
    }
}
