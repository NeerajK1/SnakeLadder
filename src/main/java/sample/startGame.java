package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class startGame {
    public AnchorPane root;
    startGame() throws IOException {
        root = FXMLLoader.load(getClass().getResource("StartGame.fxml"));
    }
}
