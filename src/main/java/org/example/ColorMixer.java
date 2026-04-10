package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ColorMixer extends Application {
    @Override
    public  void start(Stage stage){
        double r=0.1;
        double g=0.3;
        double b=0.4;
        Color mycolor=Color.color(r,g,b,1);

        Rectangle rectangle =new Rectangle(200,200);
        rectangle.setFill(mycolor);
        Text text1 = new Text(String.format("R: %.2f", r));
        Text text2 = new Text(String.format("G: %.2f", g));
        Text text3 = new Text(String.format("B: %.2f", b));

        String hex=String.format("#%02X%02X%02X",
                (int)(r * 255),
                (int)(g * 255),
                (int)(b * 255)
        );

        Text hextext=new Text(hex);
        hextext.setFont(Font.font("New Times Roman",FontWeight.BOLD,20));

        VBox vbox=new VBox(8,rectangle,text1,text2,text3,hextext);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);

        Scene scene=new Scene(vbox,300,300);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String [] args){
        launch();
    }

}
