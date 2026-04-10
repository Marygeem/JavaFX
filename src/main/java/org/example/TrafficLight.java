package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class TrafficLight extends Application {

    @Override
    public void start(Stage stage){

        Circle circle1=new Circle();
        circle1.setRadius(30);
        Circle circle2=new Circle();
        circle2.setRadius(30);
        Circle circle3=new Circle();
        circle3.setRadius(30);
        circle1.setFill(Color.RED);
        circle1.setStroke(Color.BLACK);
        circle1.setStrokeWidth(2);
        circle2.setFill(Color.YELLOW);
        circle2.setStroke(Color.BLACK);
        circle2.setStrokeWidth(2);
        circle3.setFill(Color.GREEN);
        circle3.setStroke(Color.BLACK);
        circle3.setStrokeWidth(2);
        circle1.setOpacity(1.0);
        circle2.setOpacity(0.3);
        circle3.setOpacity(0.3);

        Text text=new Text("Traffic Light");
        text.setFont(Font.font("Arial",FontWeight.BOLD,18));

        VBox vbox=new VBox(5);
        vbox.getChildren().addAll(circle1,circle2,circle3,text);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);

        Scene scene =new Scene(vbox,600,400);
        scene.setFill(Color.DARKGREY);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
