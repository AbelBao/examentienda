package com.example.examentienda.Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {

    private String driver="com.mysql.cj.jdbc.Driver";
    private String database;
    private String hostname;
    private String port;

    private String url;

    private String username;
    private String password;

    public Conexion(String url, String database, String usr, String pass) {
        this.url = "jdbc:mysql://"+url+":3306/"+database+"";
        this.driver="com.mysql.cj.jdbc.Driver";
        this.username = usr;
        this.password = pass;
    }

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
