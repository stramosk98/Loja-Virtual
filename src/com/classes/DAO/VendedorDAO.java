package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.DTO.Vendedor;
import com.classes.Conexao.Conexao;

public class VendedorDAO {

    final String NOMEDATABELA = "vendedor";
    public boolean inserir(Vendedor vendedor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nomeVendedor) VALUES (?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, vendedor.getNomeVendedor());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Vendedor vendedor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET descricao = ? WHERE idVendedor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, vendedor.getNomeVendedor());
            ps.setInt(2, vendedor.getIdVendedor());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean excluir(Vendedor vendedor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE idVendedor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, vendedor.getIdVendedor());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public Vendedor procurarPorId(Vendedor vendedor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idVendedor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, vendedor.getIdVendedor());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Vendedor obj = new Vendedor();
                obj.setIdVendedor(rs.getInt(1));
                obj.setNomeVendedor(rs.getString(2));
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
    public Vendedor procurarPorNome(Vendedor vendedor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nomeVendedor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, vendedor.getNomeVendedor());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Vendedor obj = new Vendedor();
                obj.setIdVendedor(rs.getInt(1));
                obj.setNomeVendedor(rs.getString(2));
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
    public boolean existe(Vendedor vendedor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nomeVendedor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, vendedor.getNomeVendedor());
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
    public List<Vendedor> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Vendedor> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    public List<Vendedor> montarLista(ResultSet rs) {
        List<Vendedor> listObj = new ArrayList<Vendedor>();
        try {
            while (rs.next()) {
                Vendedor obj = new Vendedor();
                obj.setIdVendedor(rs.getInt(1));
                obj.setNomeVendedor(rs.getString(2));
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