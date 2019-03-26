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
        canvas.drawFormula();

    }
}
