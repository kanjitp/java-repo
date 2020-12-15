package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFxApplication extends Application{

    @Override
    public void start(Stage window) {
        // Label
        Label textComponent = new Label("Text element");


        //Button
        Button buttonComponent = new Button("This is a button");

        //FlowPane
        FlowPane componentGroup = new FlowPane();

        componentGroup.getChildren().add(textComponent);
        componentGroup.getChildren().add(buttonComponent);

        Scene view = new Scene(componentGroup);

        window.setScene(view);
        window.show();
    }
    public static void main(String[] args) {
        launch(JavaFxApplication.class);
    }
    
}
