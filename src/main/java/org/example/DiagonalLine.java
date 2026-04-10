package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import java.awt.*;

public class DiagonalLine extends Application {

    @Override
    public void start(Stage stage){

     Pane root= new Pane();
     Line line =new Line();
     line.setStartX(0);
     line.setStartY(0);

     line.endXProperty().bind(root.widthProperty());
     line.endYProperty().bind(root.heightProperty());

     line.setStroke(Color.GREEN);
     line.setStrokeWidth(3);
     root.getChildren().add(line);

     Scene scene = new Scene(root,400,300);
     stage.setScene(scene);
     stage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
