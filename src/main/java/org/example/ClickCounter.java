package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ClickCounter extends Application {
@Override
    public void start(Stage stage) throws Exception{
    int[] count={0};
    Label label =new Label("Clicks: 0");
    label.setFont(Font.font("Arial", FontWeight.BOLD,24));
    Button button= new Button("Click me");

    button.setOnAction(event -> {
        count[0]++;
        label.setText("Clicks: "+count[0]);
    });

    VBox vbox=new VBox(20);
    vbox.setPadding(new Insets(30));
    vbox.setAlignment(Pos.CENTER);
    vbox.getChildren().addAll(label,button);

    Scene scene=new Scene(vbox,300,300);
    stage.setScene(scene);
    stage.show();


}
public static void main(String [] args){
    launch(args);
}
}
