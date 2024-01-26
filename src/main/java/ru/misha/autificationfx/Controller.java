package ru.misha.autificationfx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button authSignInButton;

    @FXML
    private Button loginSignUpButton;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;



    public void initialize(ActionEvent actionEvent) {
        authSignInButton.setOnAction(event -> {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("children-1.fxml"));
                Parent root = fxmlLoader.load();
                Stage hello_pane = new Stage();
                hello_pane.setScene(new Scene(root));
                hello_pane.setTitle("Hello");
                hello_pane.show();

                Stage currentStage = (Stage) authSignInButton.getScene().getWindow();
                currentStage.close();

            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        loginSignUpButton.setOnAction(event -> {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("registration.fxml"));
                Parent root = fxmlLoader.load();
                Stage hello_pane = new Stage();
                hello_pane.setScene(new Scene(root));
                hello_pane.setTitle("Registration");
                hello_pane.show();

                Stage currentStage = (Stage) authSignInButton.getScene().getWindow();
                currentStage.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });


    }



}
