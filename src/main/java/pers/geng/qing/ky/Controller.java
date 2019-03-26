package pers.geng.qing.ky;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lombok.val;

import java.util.List;

public class Controller {

    int index = 0;

    int turn = 0;

    @FXML
    private Label label;

    @FXML
    MathFormulaCanvas canvas;

    List<Formula> formulas;

    Formula formula;


    @FXML
    public void showKnowledge() throws Exception {

        label.setText("下一条知识");

        if (formulas == null) {
            FormulaExtractor formulaExtractor = new FormulaExtractor();
            formulas = formulaExtractor.extractDerivative();
        }

        if (turn % 2 == 0) {
            formula = formulas.get(index);
            index++;
            canvas.drawFormula(formula.getLeft(), 20);
        } else {
            canvas.drawFormula(formula.getRight(), 20);

        }



        turn++;

    }
}
