package fa.training;

import fa.training.entities.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=hibernate;encrypt=true;trustServerCertificate=true";
        String username = "sa";
        String password = "Trangbg2k";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println(connection);
            System.out.println("Connected to the database!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
