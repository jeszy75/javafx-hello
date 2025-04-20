package hello;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloWorldApplication extends Application {

    @Override
    public void start(Stage stage) {
        var scene = new Scene(createRoot(), 400, 400);
        stage.setTitle("Hello, World!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public Parent createRoot() {
        var root = new StackPane();
        root.setBackground(Background.fill(Color.SLATEBLUE));
        var text = new Text("Hello, World!");
        text.setFont(Font.font("SansSerif", FontWeight.BOLD, 50));
        text.setFill(Color.GOLD);
        root.getChildren().add(text);
        return root;
    }

}
