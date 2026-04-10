package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

class EllipsePane extends Pane {
    public void setWidth(double width) {
        super.setWidth(width);
        paintEllipses();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        paintEllipses();
    }
    private void paintEllipses() {
        getChildren().clear();

        double width  = getWidth();
        double height = getHeight();
        for (int i = 0; i < 16; i++) {

            Ellipse ellipse = new Ellipse();

            ellipse.setCenterX(width / 2);
            ellipse.setCenterY(height / 2);
            ellipse.setRadiusX(width / 2 - 50);
            ellipse.setRadiusY(height / 2 - 50);
            ellipse.setFill(Color.WHITE);
            ellipse.setStroke(Color.color(
                    Math.random(),
                    Math.random(),
                    Math.random()
            ));
            ellipse.setStrokeWidth(1.5);
            ellipse.setRotate(i * 180.0 / 16);

            getChildren().add(ellipse);
        }
    }
}

public class RotatingEllipses extends Application {

    @Override
    public void start(Stage stage) {

        EllipsePane pane = new EllipsePane();

        Scene scene = new Scene(pane, 500, 500);
        stage.setTitle("Rotating Ellipses");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}