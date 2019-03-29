package pers.geng.qing.ky;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import lombok.val;

import java.util.List;

public class Controller {


    FormulaExtractor formulaExtractor;

    @FXML
    private Label label;

    @FXML
    ChoiceBox<String> choiceBox;

    @FXML
    MathFormulaCanvas canvas;


    public Controller() throws Exception {

        formulaExtractor = FormulaExtractor.getInstance();

    }

    int index = 0;

    int turn = 0;


    Formula formula;

    @FXML
    public void changeTitle() {
        index = 0;
        turn = 0;
        label.setText(choiceBox.getValue());

    }

    @FXML
    public void showKnowledge() {


        val formulas = formulaExtractor.extractDerivativeByTitle(choiceBox.getValue());

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
