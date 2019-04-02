package pers.geng.qing.ky;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import lombok.val;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Controller {


    FormulaExtractor formulaExtractor;

    @FXML
    private Label label;

    @FXML
    ChoiceBox<String> choiceBox;

    @FXML
    MathFormulaCanvas canvas;


    public Controller() {

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
        mathBlocks = null;

    }

    List<MathBlock> mathBlocks;

    public void showBlock() {

        if (mathBlocks == null) {
            mathBlocks = new ArrayList<>();
            formulaExtractor.getBlockMap().forEach((s, mathBlock) -> {
                if (!choiceBox.getItems().contains(s)) {
                    mathBlocks.add(mathBlock);
                }
            });
            Collections.shuffle(mathBlocks);
        }
        if (index < mathBlocks.size()) {

            MathBlock mathBlock = mathBlocks.get(index);
            label.setText(mathBlock.getTitle());
            canvas.drawFormula(Arrays.toString(mathBlock.getContents().toArray()), 15);
            index++;
        }

    }

    @FXML
    public void showKnowledge() {

        if (choiceBox.getValue().equals(FormulaExtractor.BLOCK)) {
            showBlock();
        } else {
            showFormula();
        }

    }

    private void showFormula() {
        val formulas = formulaExtractor.extractDerivativeByTitle(choiceBox.getValue());

        if (turn == 2 * formulas.size()) {
            canvas.drawFormula("End", 20);
            return;
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
