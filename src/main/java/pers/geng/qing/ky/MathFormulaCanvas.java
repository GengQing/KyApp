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
class MathFormulaCanvas extends Canvas {

    private FXGraphics2D g2;

    private TeXIcon icon;

    public MathFormulaCanvas() {
        this.g2 = new FXGraphics2D(getGraphicsContext2D());

        // create a formula
        TeXFormula formula = new TeXFormula("方程$f(x)$的解: \\\\ $$x=\\frac{-b \\pm \\sqrt {b^2-4ac}}{2a}$$");

        // render the formla to an icon of the same size as the formula.
        this.icon = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, 20);

        // Redraw canvas when size changes.
        widthProperty().addListener(evt -> draw());
        heightProperty().addListener(evt -> draw());
    }

    public void draw() {
        double width = getWidth();
        double height = getHeight();
        getGraphicsContext2D().clearRect(0, 0, width, height);

        // ideally it should be possible to draw directly to the FXGraphics2D
        // instance without creating an image first...but this does not generate
        // good output
        //this.icon.paintIcon(new JLabel(), g2, 50, 50);

        // now create an actual image of the rendered equation
        BufferedImage image = new BufferedImage(icon.getIconWidth(),
                icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D gg = image.createGraphics();
        gg.setColor(Color.WHITE);
        gg.fillRect(0, 0, icon.getIconWidth(), icon.getIconHeight());
        JLabel jl = new JLabel();
        jl.setForeground(new Color(0, 0, 0));
        icon.paintIcon(jl, gg, 0, 0);
        // at this point the image is created, you could also save it with ImageIO

        this.g2.drawImage(image, 0, 0, null);
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
