import java.util.Arrays;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatistics extends Application{

    @Override
    public void start(Stage window) {
        window.setTitle("Text Statistics");
        TextArea textarea = new TextArea("");

        // Statistics
        HBox statistics = new HBox();
        statistics.setSpacing(10);
        Label letterCount = new Label("Letters: ");
        Label wordCount = new Label("Words: ");
        Label longestWord = new Label("The longest word is: ");
        statistics.getChildren().addAll(letterCount, wordCount, longestWord);
        textarea.textProperty().addListener(new ChangeListener<String>(){
            @Override
            public void changed(ObservableValue<? extends String> change, String oldValue, String newValue) {
                int characters = newValue.length();
                String[] parts = newValue.split(" ");
                int words = newValue.equals("") ? 0 : parts.length;
                String longest = Arrays.stream(parts).sorted((s1, s2) -> s2.length() - s1.length()).findFirst().get();

                letterCount.setText("Letters: " + characters);
                wordCount.setText("Words: " + words);
                longestWord.setText("The longest word is: " + longest);
            }            
        });
        BorderPane layout = new BorderPane();

        layout.setTop(textarea);
        layout.setBottom(statistics);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatistics.class);
    }
    
}
