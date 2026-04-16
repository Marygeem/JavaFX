package org.example;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KeyLogger extends Application {

    @Override
    public void start(Stage stage) {
        TextField inputField = new TextField();
        TextArea logArea = new TextArea();
        logArea.setPrefRowCount(5);
        logArea.setEditable(false);

        inputField.setOnKeyPressed(event -> {
            logArea.appendText("PRESSED | Code: " + event.getCode() +
                    " | Shift: " + event.isShiftDown() +
                    " | Ctrl: " + event.isControlDown() + "\n");
        });

        inputField.setOnKeyReleased(event -> {
            logArea.appendText("RELEASED | Code: " + event.getCode() + "\n");
        });

        inputField.setOnKeyTyped(event -> {
            logArea.appendText("TYPED    | Char: " + event.getCharacter() + "\n");
        });

        Button clearBtn = new Button("Clear Log");
        clearBtn.setOnAction(e -> logArea.clear());

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.getChildren().addAll(inputField, logArea, clearBtn);

        Scene scene = new Scene(vbox, 420, 320);
        stage.setTitle("Key Logger");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
