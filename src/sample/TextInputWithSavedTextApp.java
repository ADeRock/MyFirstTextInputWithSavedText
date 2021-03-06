package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TextInputWithSavedTextApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Load View from xml description
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();

        // setOnHidden event happens when app is quit; tell controller to save model then
        sample.Controller myController = loader.getController();
        primaryStage.setOnHidden(e -> myController.save());

        // Display the scene
        primaryStage.setTitle("Text Input with Saved Text");
        primaryStage.setScene(new Scene(root, 700, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
