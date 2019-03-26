package pers.geng.qing.ky;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label label;

    @FXML
    MathFormulaCanvas canvas;

    @FXML
    public void showKnowledge() {

        label.setText("下一条知识");
        canvas.drawFormula("方程$f(x)$的解2: \\\\ $$x=\\frac{-b \\pm \\sqrt {b^2-4ac}}{2a}$$", 40);

    }
}
