import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ExampleApplication extends Application{

    @Override
    public void start(Stage window) {
        //1. Create main layout
        BorderPane layout = new BorderPane();

        //1.1 Create menu for main layout
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        //1.2 Create buttons for menu
        Button first = new Button("First");
        Button second = new Button("Second");

        // 1.3 add buttons to menu
        menu.getChildren().addAll(first, second);

        layout.setTop(menu);

        // 2 add subview and add them to the menu buttons
        // 2.1 Create subview layout
        StackPane firstLayout = createView("First view");
        StackPane secondLayout = createView("Second view");

        // 2.2 Add subviews to button.
        first.setOnAction((action) -> layout.setCenter(firstLayout));
        second.setOnAction((action) -> layout.setCenter(secondLayout));

        // 2.3 set initial view
        layout.setCenter(firstLayout);

        // 3. Create main scene with layout
        Scene scene = new Scene(layout);

        // 4. Show the main scene
        window.setScene(scene);
        window.show();
    }
    private StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
    public static void main(String[] args) {
        launch(ExampleApplication.class);
    }
    
}
