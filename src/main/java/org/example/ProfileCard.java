package org.example;

//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
 import javafx.scene.layout.GridPane;
 import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
//import javafx.stage.Stage;
//
//public class ProfileCard extends Application {
//    @Override
//    public void start(Stage stage){
//
//        Label nameLabel = new Label("Marygem");
//        nameLabel.setTextFill(Color.WHITE);
//        nameLabel.setFont(Font.font("Arial", FontWeight.BOLD, 16));
//
//        HBox top = new HBox();
//        top.setPadding(new Insets(12));
//        top.getChildren().add(nameLabel);
//        top.setStyle("-fx-background-color: #2C3E50;");
//
//        GridPane grid = new GridPane();
//        grid.setHgap(10);
//        grid.setVgap(10);
//        grid.setPadding(new Insets(20));
//        Label deptLabel  = new Label("Department:");
//        Label yearLabel  = new Label("Year:");
//        Label gpaLabel   = new Label("GPA:");
//        Label deptValue  = new Label("Computer Science");
//        Label yearValue  = new Label("2");
//        Label gpaValue   = new Label("3.85");
//        grid.add(deptLabel,  0, 0);
//        grid.add(deptValue,  1, 0);
//        grid.add(yearLabel,  0, 1);
//        grid.add(yearValue,  1, 1);
//        grid.add(gpaLabel,   0, 2);
//        grid.add(gpaValue,   1, 2);
//        Label bottomLabel = new Label("New Uzbekistan University");
//        bottomLabel.setPadding(new Insets(8));
//        bottomLabel.setMaxWidth(Double.MAX_VALUE);
//        bottomLabel.setAlignment(Pos.CENTER);
//        bottomLabel.setStyle("-fx-background-color: #ECF0F1; -fx-font-size: 13;");
//
//
//        BorderPane root = new BorderPane();
//        root.setTop(top);
//        root.setCenter(grid);
//        root.setBottom(bottomLabel);
//
//        Scene scene = new Scene(root, 400, 250);
//        stage.setTitle("Profile Card");
//        stage.setScene(scene);
//        stage.show();
//
//    }
//
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.awt.*;

public class ProfileCard extends Application {
    @ Override
    public void start(Stage stage){
        BorderPane root= new BorderPane();

        Label label = new Label("Marjona Rasuljonova");
        label.setFont(Font.font("Arial",FontWeight.BOLD,16));
        label.setStyle( "-fx-background-color: #2C3E50;");

        HBox hbox =new HBox();
        hbox.setPadding(new Insets(12));
        hbox.getChildren().addAll(label);

        GridPane grid= new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        Label department=new Label("Department :");
        Label year=new Label("Year :");
        Label gpa=new Label("GPA: ");
        Label department1= new Label("Computer Science");
        Label year1= new Label("First Year");
        Label gpa1= new Label("3.8");

        grid.add(department,0,0);
        grid.add(year,0,1);
        grid.add(gpa,0,2);
        grid.add(department1,1,0);
        grid.add(year1,1,1);
        grid.add(gpa1,1,2);

        Label bottom =new Label("New Uzbekistan University");
        bottom.setPadding(new Insets(8));
        bottom.setStyle( "-fx-background-color: #ECF0F1" );
        bottom.setStyle("-fx-background-color: #ECF0F1; -fx-font-size: 13;");








    }
    public static void main(String [] args){
        launch(args);
    }
}