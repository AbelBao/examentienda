package com.example.examentienda;

import com.example.examentienda.Modelo.Conexion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;

public class Tienda extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Tienda.class.getResource("Inicio.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 460, 400);
        stage.setTitle("Gestor Tienda");
        stage.setScene(scene);
        stage.show();
        //Conexion conexion = new Conexion();
        //Connection con= conexion.conectarMySQL();
    }

    public static void main(String[] args) {
        launch();
    }
}