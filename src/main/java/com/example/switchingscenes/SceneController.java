package com.example.switchingscenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    private Stage stage;
    private Scene scene;
    // Parent root;

    public void switchToSceneOne(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("scene-one.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(parent);

        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSceneTwo(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("scene-tow.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(parent);

        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}