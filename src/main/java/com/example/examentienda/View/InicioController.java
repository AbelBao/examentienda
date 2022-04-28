package com.example.examentienda.View;

import com.example.examentienda.Modelo.Pedido;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.List;

public class InicioController extends BasicController {
    @FXML
    TableView tblUltPedidos;
    @FXML
    TableColumn cIdPedido, cNombreCliente;
    @FXML
    Button btnEditPedido, btnVerPedidos,btnVerClientes, btnVerProductos;

    protected void cargaTabla(){
        List<Pedido> pedidos=t.getAllPedidos();
    }

    @FXML
    protected void btnEditPedidoClick() {
    }
    @FXML
    protected void btnVerPedidosClick() {
    }
    @FXML
    protected void btnVerClientesClick() {
    }
    @FXML
    protected void btnVerProductosClick() {
    }
}