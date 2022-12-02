package com.classes.BO;

import com.classes.DTO.Vendedor;
import com.classes.DAO.VendedorDAO;
import java.util.List;

public class VendedorBO {

    public boolean inserir(Vendedor vendedor){
        if (existe(vendedor) != true) {
            VendedorDAO vendedorsDAO = new VendedorDAO();
            return vendedorsDAO.inserir(vendedor);
        }
        return false;
    }
    public boolean alterar(Vendedor vendedor){
        VendedorDAO vendedorsDAO = new VendedorDAO();
        return vendedorsDAO.alterar(vendedor);
    }
    public boolean excluir(Vendedor vendedor){
        VendedorDAO vendedorsDAO = new VendedorDAO();
        return vendedorsDAO.excluir(vendedor);
    }
    public Vendedor procurarPorId(Vendedor vendedor){
        VendedorDAO vendedorsDAO = new VendedorDAO();
        return vendedorsDAO.procurarPorId(vendedor);
    }
    public Vendedor procurarPorNome(Vendedor vendedor){
        VendedorDAO vendedorsDAO = new VendedorDAO();
        return vendedorsDAO.procurarPorNome(vendedor);
    }
    public boolean existe(Vendedor vendedor){
        VendedorDAO vendedorsDAO = new VendedorDAO();
        return vendedorsDAO.existe(vendedor);
    }
    public List<Vendedor> pesquisarTodos(){
        VendedorDAO vendedorsDAO = new VendedorDAO();
        return vendedorsDAO.pesquisarTodos();
    }
}