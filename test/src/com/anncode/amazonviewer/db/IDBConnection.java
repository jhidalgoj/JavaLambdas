package com.anncode.amazonviewer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.anncode.amazonviewer.db.DataBase.*;

public interface IDBConnection {
    default Connection connectToDB() throws ClassNotFoundException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL+DB,USER,PASSWORD);

            if ( connection != null){
                System.out.println("Se establecio coneccion");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally{

            return connection;
        }
    }
}
