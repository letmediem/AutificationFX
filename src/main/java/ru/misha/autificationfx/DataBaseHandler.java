package ru.misha.autificationfx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHandler {

    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/Users";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "2004";

    public static void insertUser(String firstName, String lastName, String username, String password, String gender) {
        String insertQuery = "INSERT INTO users (first_name, last_name, username, password, gender) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, username);
            preparedStatement.setString(4, password);
            preparedStatement.setString(5, gender);

            preparedStatement.executeUpdate();

            System.out.println("User inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Другие методы для работы с базой данных могут быть добавлены здесь

}

