package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import java.awt.Image;

public class JavaFxLabelTutorial extends Application{

    @Override
    public void start(Stage window) {
        // Label
        //An empty label
        Label label1 = new Label();
        //A label with the text element
        Label label2 = new Label("Search");
        /// A label with the text element and graphical icon
        Image image = new Image(getClass().getResourceAsStream("labels.jpg"));
        Label label3 = new Label("Search", new ImageView(image));


        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(label3);

        Scene scene = new Scene(componentGroup);
        
        window.setScene(scene);
        window.show();
    }
    
}
