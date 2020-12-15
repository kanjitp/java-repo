package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFxApplication extends Application {
    @Override
    public void start(Stage window) {
        window.setTitle("My first application!");
        Button button = new Button("This is a button");

        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);

        Scene scene = new Scene(componentGroup);
        
        window.setScene(scene);
        window.show();


    }

    public static void main(String[] args) {
        launch(JavaFxApplication.class);

    }
}