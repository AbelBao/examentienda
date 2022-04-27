package com.example.examentienda.persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {

    public String driver = "com.mysql.cj.jdbc.Driver";
    public String database = "tienda";
    public String hostname = "localhost";
    public String port = "3306";

    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database;

    public String username = "root";
    public String password = "";

    public Connection conectarMySQL() {
        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

}
