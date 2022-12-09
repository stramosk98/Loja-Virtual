package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.DTO.Produto;
import com.classes.Conexao.Conexao;

public class ProdutoDAO {

    final String NOMEDATABELA = "produto";
    public boolean inserir(Produto produto) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nomeProduto) VALUES (?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getNomeProduto());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Produto produto) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET descricao = ? WHERE idProduto = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getNomeProduto());
            ps.setInt(2, produto.getIdProduto());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean excluir(Produto produto) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE idProduto = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, produto.getIdProduto());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public Produto procurarPorId(Produto produto) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idProduto = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, produto.getIdProduto());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Produto obj = new Produto();
                obj.setIdProduto(rs.getInt(1));
                obj.setNomeProduto(rs.getString(2));
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
        	 e.printStackTrace();
             return null;
        }
    }
    public Produto procurarPorNome(Produto produto) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nomeProduto = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getNomeProduto());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Produto obj = new Produto();
                obj.setIdProduto(rs.getInt(1));
                obj.setNomeProduto(rs.getString(2));
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    public boolean existe(Produto produto) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nomeProduto = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getNomeProduto());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ps.close();
                rs.close();
                conn.close();
                return true;
            }
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return false;
        }
        return false;
    }
    public List<Produto> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Produto> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    public List<Produto> montarLista(ResultSet rs) {
        List<Produto> listObj = new ArrayList<Produto>();
        try {
            while (rs.next()) {
                Produto obj = new Produto();
                obj.setIdProduto(rs.getInt(1));
                obj.setNomeProduto(rs.getString(2));
                listObj.add(obj);
            }
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
}