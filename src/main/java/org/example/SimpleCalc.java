package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SimpleCalc extends Application {

    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20));
        grid.setAlignment(Pos.CENTER);

        Label label1 = new Label("Number 1");
        TextField text1 = new TextField();

        Label label2 = new Label("Number 2");
        TextField text2 = new TextField();

        Label resultLabel = new Label("Result");
        TextField result = new TextField();
        result.setEditable(false);

        Button calculate = new Button("Calculate");
        Button clearButton = new Button("Clear");

        calculate.setOnAction(event -> {
            try {
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                double sum = num1 + num2;
                result.setText(String.format("Sum: %.2f", sum));
            } catch (NumberFormatException e) {
                result.setText("Invalid input!");
            }
        });

        clearButton.setOnAction(event -> {
            text1.clear();
            text2.clear();
            result.clear();
        });

        grid.add(label1, 0, 0);
        grid.add(text1, 1, 0);
        grid.add(label2, 0, 1);
        grid.add(text2, 1, 1);
        grid.add(resultLabel, 0, 2);
        grid.add(result, 1, 2);
        grid.add(calculate, 0, 3);
        grid.add(clearButton, 1, 3);

        Scene scene = new Scene(grid, 320, 220);
        stage.setTitle("Simple Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}