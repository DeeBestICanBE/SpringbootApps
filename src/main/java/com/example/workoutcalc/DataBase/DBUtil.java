package com.example.workoutcalc.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {



    private static String url = "jdbc:mysql://localhost:3306/db1";

    private static String user = "root";
    private static String password="11111111";

    private DBUtil() {

    }

public static Connection getConnection() throws SQLException {


    Connection connection = null;
        connection = DriverManager.getConnection(url,user,password);
        return connection;
}
}
