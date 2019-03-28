package pers.geng.qing.ky;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.util.List;

public class Controller {

    int index = 0;

    int turn = 0;

    @FXML
    private Label label;

    @FXML
    ChoiceBox<String> choiceBox;

    @FXML
    MathFormulaCanvas canvas;

    List<Formula> formulas;

    Formula formula;

    public Controller() throws Exception {

        formulaExtractor = FormulaExtractor.getInstance();

    }

    FormulaExtractor formulaExtractor;

    @FXML
    public void showKnowledge() throws Exception {

        String title = choiceBox.getValue();

        label.setText(title);


        if (formulas == null) {

            formulas = formulaExtractor.extractDerivativeByTitle(title);
        }

        if (turn % 2 == 0) {
            formula = formulas.get(index);
            index++;
            canvas.drawFormula(formula.getLeft(), 20);
        } else {
            canvas.drawFormula(formula.getLeft() + " = " + formula.getRight(), 20);
        }


        turn++;

    }
}
