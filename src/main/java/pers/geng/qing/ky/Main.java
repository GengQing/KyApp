package pers.geng.qing.ky;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;

public class Main extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception {
        URL resource = getClass().getResource("/kyApp.fxml");
        GridPane pane = FXMLLoader.load(resource);

        primaryStage.setTitle("Diligence");

        ChoiceBox choiceBox = (ChoiceBox) pane.lookup("#choiceBox");

        List<String> list = FormulaExtractor.getInstance().getAlignedBlockNames();
        choiceBox.setItems(FXCollections.observableArrayList(list));



        primaryStage.setScene(new Scene(pane, 600, 400));




        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
