/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author petru
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            String url = "jdbc:sqlserver://DESKTOP-NSMD3G2:1433;databaseName=VehicleRecords";
            String username = "sa";
            String password = "databasetest";
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }
}
