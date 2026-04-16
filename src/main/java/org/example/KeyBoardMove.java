package org.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class KeyBoardMove extends Application {

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();

        Rectangle rect = new Rectangle(220, 180, 60, 40);
        rect.setFill(Color.BLUE);

        TextField posField = new TextField("X: 220 Y: 180");
        posField.setEditable(false);
        posField.setLayoutY(360);

        pane.getChildren().addAll(rect, posField);

        Scene scene = new Scene(pane, 500, 400);

        scene.setOnKeyPressed(event -> {
            double x = rect.getX();
            double y = rect.getY();

            switch (event.getCode()) {
                case UP    -> y -= 10;
                case DOWN  -> y += 10;
                case LEFT  -> x -= 10;
                case RIGHT -> x += 10;
                default    -> {}
            }

            x = Math.max(0, Math.min(x, 500 - 60));
            y = Math.max(0, Math.min(y, 400 - 40));

            rect.setX(x);
            rect.setY(y);
            posField.setText("X: " + (int)x + " Y: " + (int)y);
        });

        stage.setTitle("Keyboard Move");
        stage.setScene(scene);
        stage.show();

        scene.getRoot().requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}