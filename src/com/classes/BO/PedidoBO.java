package com.classes.BO;

import com.classes.DTO.Pedido;
import com.classes.DAO.PedidoDAO;
import java.util.List;

public class PedidoBO {

    public boolean inserir(Pedido pedido){
        if (existe(pedido) != true) {
            PedidoDAO pedidosDAO = new PedidoDAO();
            return pedidosDAO.inserir(pedido);
        }
        return false;
    }
    public boolean alterar(Pedido pedido){
        PedidoDAO pedidosDAO = new PedidoDAO();
        return pedidosDAO.alterar(pedido);
    }
    public boolean excluir(Pedido pedido){
        PedidoDAO pedidosDAO = new PedidoDAO();
        return pedidosDAO.excluir(pedido);
    }
    public Pedido procurarPorId(Pedido pedido){
        PedidoDAO pedidosDAO = new PedidoDAO();
        return pedidosDAO.procurarPorId(pedido);
    }
    public boolean existe(Pedido pedido){
        PedidoDAO pedidosDAO = new PedidoDAO();
        return pedidosDAO.existe(pedido);
    }
    public List<Pedido> pesquisarTodos(){
        PedidoDAO pedidosDAO = new PedidoDAO();
        return pedidosDAO.pesquisarTodos();
    }
    
}