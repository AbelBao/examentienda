package com.example.examentienda.Modelo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Date;

public class Pedido {
    private int idPedido;
    private Date fechaAlta;
    private Date fechaEntrega;
    private int estado;
    private Cliente cliente;
    private float precioTotal;
    private ObservableList<ProductoPedido> productos= FXCollections.observableArrayList();

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public ObservableList<ProductoPedido> getProductos() {
        return productos;
    }

    public void setProductos(ObservableList<ProductoPedido> productos) {
        this.productos = productos;
    }
}
