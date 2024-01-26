package ru.misha.autificationfx;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseManager {
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/Users";
    private static final String JDBC_USER = "postgres";
    private static final String JDBC_PASSWORD = "2004";

    public static void addUser(String firstName, String lastName, String username, String password, String gender) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String sql = "INSERT INTO users (first_name, last_name, username, password, gender) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, firstName);
                preparedStatement.setString(2, lastName);
                preparedStatement.setString(3, username);
                preparedStatement.setString(4, password);
                preparedStatement.setString(5, gender);
                //preparedStatement.executeUpdate();
                int rowsAffected = preparedStatement.executeUpdate();

                // Вывести информацию о добавлении записи в базу данных
                if (rowsAffected > 0) {
                    System.out.println("Пользователь успешно добавлен в базу данных.");
                } else {
                    System.out.println("Не удалось добавить пользователя в базу данных.");
                }


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
