package ru.misha.autificationfx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControllerChildren1 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backButton_children1;

    @FXML
    private AnchorPane hello_pane;

    @FXML
    private void handleBack(ActionEvent event) {
        try {
            // Создание загрузчика FXML
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("parent.fxml"));
            Parent root = fxmlLoader.load();

            // Создание нового окна
            Stage primaryStage = new Stage();
            primaryStage.setTitle("Application");
            primaryStage.setScene(new Scene(root));

            // Закрытие текущего окна
            Stage currentStage = (Stage) backButton_children1.getScene().getWindow();
            currentStage.close();

            // Отображение нового окна
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Обработка исключения, например, вывод сообщения об ошибке
            System.err.println("Ошибка при загрузке FXML: " + e.getMessage());
        }
    }


}
