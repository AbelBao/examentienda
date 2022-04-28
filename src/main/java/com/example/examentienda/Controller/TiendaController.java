package com.example.examentienda.Controller;

import com.example.examentienda.Modelo.Cliente;
import com.example.examentienda.Modelo.Conexion;
import com.example.examentienda.Modelo.Pedido;
import com.example.examentienda.Modelo.ProductoPedido;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TiendaController {

    public List<Pedido> getAllPedidos(){
        List<Pedido> listaPedidos=new ArrayList<>();
        List<ProductoPedido> listaProductosPedido=new ArrayList<>();
        Conexion cn=new Conexion("localhost","tienda","root","");
        Connection conn=cn.conectarMySQL();
        String sqlSelect="select * from pedidos";
        try {
            Statement stm=conn.createStatement();
            ResultSet rs=stm.executeQuery(sqlSelect);
            while(rs.next()){
                int idCliente=rs.getInt("idCliente");
                int idPedido=rs.getInt("idPedido");
                Cliente cliente=
                listaProductosPedido=getProductoPedido(idPedido);
                listaPedidos.add(new Pedido(rs.getInt("idPedido"),rs.getDate("FechaAlta"),rs.getDate("FechaEntrega"),rs.getInt("Estado"),));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaPedidos;
        //return null;
    }

    public List<ProductoPedido> getProductoPedido(int idPedido){
        Conexion cn=new Conexion("localhost","tienda","root","");
        Connection conn=cn.conectarMySQL();
        String sqlSelectlistaProductos="select * from listaproductos T1 inner join productos T2 on T1.productos_idproducto where T1.pedidos_idPedido=?";
        PreparedStatement stm1 = null;
        try {
            stm1 = conn.prepareStatement(sqlSelectlistaProductos);
            stm1.setInt(1,idPedido);
            ResultSet rs1=stm1.executeQuery(sqlSelectlistaProductos);
            while(rs1.next()){

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
