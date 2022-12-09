package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.DTO.Admin;
import com.classes.Conexao.Conexao;

public class AdminDAO {

    final String NOMEDATABELA = "admin";
    public boolean inserir(Admin admin) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nomeAdmin) VALUES (?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, admin.getNomeAdmin());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
   
    public Admin procurarPorId(Admin admin) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idAdmin = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, admin.getIdAdmin());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Admin obj = new Admin();
                obj.setIdAdmin(rs.getInt(1));
                obj.setNomeAdmin(rs.getString(2));
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
    public Admin procurarPorNome(Admin admin) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nomeAdmin = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, admin.getNomeAdmin());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Admin obj = new Admin();
                obj.setIdAdmin(rs.getInt(1));
                obj.setNomeAdmin(rs.getString(2));
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
    public boolean existe(Admin admin) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nomeAdmin = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, admin.getNomeAdmin());
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
    public List<Admin> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Admin> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    public List<Admin> montarLista(ResultSet rs) {
        List<Admin> listObj = new ArrayList<Admin>();
        try {
            while (rs.next()) {
                Admin obj = new Admin();
                obj.setIdAdmin(rs.getInt(1));
                obj.setNomeAdmin(rs.getString(2));
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