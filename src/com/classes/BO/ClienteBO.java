package com.classes.BO;

import com.classes.DTO.Cliente;
import com.classes.DAO.ClienteDAO;
import java.util.List;

public class ClienteBO {

    public boolean inserir(Cliente cliente){
        if (existe(cliente) != true) {
            ClienteDAO clientesDAO = new ClienteDAO();
            return clientesDAO.inserir(cliente);
        }
        return false;
    }
    
    public boolean alterar(Cliente cliente){
        ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.alterar(cliente);
    }
    
    public boolean excluir(Cliente cliente){
        ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.excluir(cliente);
    }
    
    public Cliente procurarPorId(Cliente cliente){
        ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.procurarPorId(cliente);
    }
    
    public Cliente procurarPorNome(Cliente cliente){
        ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.procurarPorNome(cliente);
    }
    
    public boolean existe(Cliente cliente){
        ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.existe(cliente);
    }
    
    public List<Cliente> pesquisarTodos(){
        ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.pesquisarTodos();
    }
    
}