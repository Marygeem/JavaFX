package org.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DraggableCircle extends Application {

    private double offsetX;
    private double offsetY;

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        Circle circle = new Circle(250, 200, 40, Color.CORAL);

        circle.setOnMousePressed(event -> {
            offsetX = event.getSceneX() - circle.getCenterX();
            offsetY = event.getSceneY() - circle.getCenterY();
            circle.setFill(Color.TOMATO);
        });

        circle.setOnMouseDragged(event -> {
            circle.setCenterX(event.getSceneX() - offsetX);
            circle.setCenterY(event.getSceneY() - offsetY);
        });

        circle.setOnMouseReleased(event -> {
            circle.setFill(Color.CORAL);
        });

        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 500, 400);
        stage.setTitle("Draggable Circle");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
