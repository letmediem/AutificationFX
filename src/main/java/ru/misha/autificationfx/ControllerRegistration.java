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
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControllerRegistration {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backButton_children1;

    @FXML
    private TextField confirmPasswordTextField;

    @FXML
    private CheckBox female_checkBox;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private AnchorPane hello_pane;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField loginTextField;

    @FXML
    private CheckBox male_checkBox;

    @FXML
    private TextField passwordTextField;

    @FXML
    private Button registration_Button;

    @FXML
    void handleBack(ActionEvent event) {

    }

    @FXML
    private void handleRegistration() {
        // Получаем значения из полей ввода
        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String login = loginTextField.getText();
        String password = passwordTextField.getText();
        String confirmPassword = confirmPasswordTextField.getText();
        String gender = (male_checkBox.isSelected()) ? "male" : "female";

        // Проверка на пустые поля и совпадение паролей
        if (firstName.isEmpty() || lastName.isEmpty() || login.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            // Обработка ошибки - выводите сообщение или что-то еще
            System.out.println("Заполните все поля");
            return;
        }

        if (!password.equals(confirmPassword)) {
            // Обработка ошибки - выводите сообщение или что-то еще
            System.out.println("Пароли не совпадают");
            return;
        }

        // Теперь вы можете передать эти данные в метод добавления пользователя в базу данных
        DataBaseManager.addUser(firstName, lastName, login, password, gender);

        // Дополнительные действия после успешной регистрации, если необходимо
    }



}


