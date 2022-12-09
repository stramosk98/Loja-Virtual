package com.classes.BO;

import com.classes.DTO.Produto;
import com.classes.DAO.ProdutoDAO;
import java.util.List;

public class ProdutoBO {

    public boolean inserir(Produto produto){
        if (existe(produto) != true) {
            ProdutoDAO produtosDAO = new ProdutoDAO();
            return produtosDAO.inserir(produto);
        }
        return false;
    }
    public boolean alterar(Produto produto){
        ProdutoDAO produtosDAO = new ProdutoDAO();
        return produtosDAO.alterar(produto);
    }
    public boolean excluir(Produto produto){
        ProdutoDAO produtosDAO = new ProdutoDAO();
        return produtosDAO.excluir(produto);
    }
    public Produto procurarPorId(Produto produto){
        ProdutoDAO produtosDAO = new ProdutoDAO();
        return produtosDAO.procurarPorId(produto);
    }
    public Produto procurarPorNome(Produto produto){
        ProdutoDAO produtosDAO = new ProdutoDAO();
        return produtosDAO.procurarPorNome(produto);
    }
    public boolean existe(Produto produto){
        ProdutoDAO produtosDAO = new ProdutoDAO();
        return produtosDAO.existe(produto);
    }
    public List<Produto> pesquisarTodos(){
        ProdutoDAO produtosDAO = new ProdutoDAO();
        return produtosDAO.pesquisarTodos();
    }
    
}