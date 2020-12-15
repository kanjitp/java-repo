import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Multipleviews extends Application{

    @Override
    public void start(Stage window) {
        
        BorderPane firstPage = new BorderPane();
        Label firstView = new Label("First view!");
        Button firstButton = new Button("To the second view!");
        firstPage.setTop(firstView);
        firstPage.setCenter(firstButton);

        VBox secondPage = new VBox();
        Button secondButton = new Button("To the third view!");
        Label secondView = new Label("Second view!");
        secondPage.getChildren().addAll(secondButton, secondView);


        GridPane thirdPage = new GridPane();
        Label thirdView = new Label("Third view!");
        Button thirdButton = new Button("To the first view!");
        thirdPage.add(thirdView, 0, 0);
        thirdPage.add(thirdButton, 1, 1);

        Scene first = new Scene(firstPage);
        Scene second = new Scene(secondPage);
        Scene third = new Scene(thirdPage);
        firstButton.setOnAction((event) -> {
            window.setScene(second);
        });
        secondButton.setOnAction((event) -> {
            window.setScene(third);
        });
        thirdButton.setOnAction((event) -> {
            window.setScene(first);
        });
        
        window.setScene(first);
        window.show();
        
    }
    
}
