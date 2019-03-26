package pers.geng.qing.ky;

import javafx.scene.canvas.Canvas;
import org.jfree.fx.FXGraphics2D;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Geng Qing on 2019-03-25
 **/

public class MathFormulaCanvas extends Canvas {

    public FXGraphics2D fxGraphics2D;

    public TeXIcon icon;


    public MathFormulaCanvas() {
        super();
        this.fxGraphics2D = new FXGraphics2D(getGraphicsContext2D());

        // create a formula
        TeXFormula formula = new TeXFormula("方程$f(x)$的解: \\\\ $$x=\\frac{-b \\pm \\sqrt {b^2-4ac}}{2a}$$");

        // render the formula to an icon of the same size as the formula.
        this.icon = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, 30);

        // Redraw canvas when size changes.
        widthProperty().addListener(evt -> draw());
        heightProperty().addListener(evt -> draw());
    }

    public void drawFormula(String math, int size) {

        TeXFormula formula = new TeXFormula(math);
        // render the formula to an icon of the same size as the formula.
        this.icon = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, size);
        draw();


    }

    public void draw() {
        double width = getWidth();
        double height = getHeight();
        getGraphicsContext2D().clearRect(0, 0, width, height);

        // ideally it should be possible to draw directly to the FXGraphics2D
        // instance without creating an image first...but this does not generate
        // good output
        //this.icon.paintIcon(new JLabel(), fxGraphics2D, 50, 50);

        // now create an actual image of the rendered equation
        BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(),
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setColor(Color.WHITE);
        graphics2D.fillRect(0, 0, icon.getIconWidth(), icon.getIconHeight());
        JLabel jLabel = new JLabel();
        jLabel.setForeground(new Color(0, 0, 0));
        icon.paintIcon(jLabel, graphics2D, 0, 0);
        // at this point the image is created, you could also save it with ImageIO

        this.fxGraphics2D.drawImage(bufferedImage, 0, 0, null);
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
}
