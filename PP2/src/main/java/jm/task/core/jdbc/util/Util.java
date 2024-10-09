package jm.task.core.jdbc.util;

import java.sql.*;
import java.util.logging.*;

public class Util {
    private static Connection connection = null;
    private static Util instance = null;

    private Util() {
        String url = "jdbc:mysql://localhost/kata1";
        String username = "root";
        String password = "2901password";
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Util getInstance() {
        if (instance == null) {
            instance = new Util();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
