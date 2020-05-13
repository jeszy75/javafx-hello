package hello;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloWorldApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        root.setBackground(new Background(new BackgroundFill(Color.SLATEBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        Text text = new Text("Hello, World!");
        text.setFont(Font.font("SansSerif", FontWeight.BOLD, 50));
        text.setFill(Color.GOLD);
        root.getChildren().add(text);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Hello, World!");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

}
