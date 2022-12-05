package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static Group root;
    @Override
    public void start(Stage stage) throws IOException {
        root = new Group();
        stage.setTitle("Snake And Ladder");
        startGame start = new startGame();
        root.getChildren().add(start.root);
        Scene scene = new Scene(root, 800, 500);
        scene.setFill(Color.web("RED"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}