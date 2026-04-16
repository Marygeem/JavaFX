package org.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MouseCoords extends Application {

    @Override
    public void start(Stage stage) {
        StackPane stackPane = new StackPane();
        stackPane.setStyle("-fx-background-color: lightblue;");

        Label label = new Label("Move the mouse over the pane");

        stackPane.setOnMouseMoved(event -> {
            label.setText("X: " + event.getX() + "    Y: " + event.getY());
        });

        stackPane.setOnMouseClicked(event -> {
            int r = (int)(Math.random() * 256);
            int g = (int)(Math.random() * 256);
            int b = (int)(Math.random() * 256);
            stackPane.setStyle(String.format("-fx-background-color: rgb(%d,%d,%d);", r, g, b));
        });

        stackPane.setOnMouseExited(event -> {
            label.setText("Move the mouse over the pane");
        });

        BorderPane root = new BorderPane();
        root.setCenter(stackPane);
        root.setBottom(label);

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("Mouse Coordinates");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
