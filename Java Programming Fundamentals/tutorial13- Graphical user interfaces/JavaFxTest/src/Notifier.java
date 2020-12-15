import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Notifier extends Application{

    @Override
    public void start(Stage window) {
        TextField input = new TextField();
        Button button = new Button("Update");
        Label paste = new Label();
        VBox componentGroup = new VBox();
        componentGroup.getChildren().addAll(input, button, paste);


        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                paste.setText(input.getText());
            }
        });
        
        Scene scene = new Scene(componentGroup);
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(Notifier.class);
    }
    
}
