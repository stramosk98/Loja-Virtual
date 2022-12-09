package com.classes.BO;

import com.classes.DTO.Admin;
import com.classes.DAO.AdminDAO;
import java.util.List;

public class AdminBO {

    public boolean inserir(Admin admin){
        if (existe(admin) != true) {
            AdminDAO adminsDAO = new AdminDAO();
            return adminsDAO.inserir(admin);
        }
        return false;
    }
  
    public Admin procurarPorId(Admin admin){
        AdminDAO adminsDAO = new AdminDAO();
        return adminsDAO.procurarPorId(admin);
    }
    public Admin procurarPorNome(Admin admin){
        AdminDAO adminsDAO = new AdminDAO();
        return adminsDAO.procurarPorNome(admin);
    }
    public boolean existe(Admin admin){
        AdminDAO adminsDAO = new AdminDAO();
        return adminsDAO.existe(admin);
    }
    public List<Admin> pesquisarTodos(){
        AdminDAO adminsDAO = new AdminDAO();
        return adminsDAO.pesquisarTodos();
    }
}