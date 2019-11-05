package br.com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import br.com.conexao.Conector;

public class DAOusuario {
	private Connection con;
    private PreparedStatement stmt;
    private String comandoSql;
    private ResultSet res;
    
    public DAOusuario(){
   	 con= Conector.getConection();
    }   
    
    public void cadastrarUsuario(String nome,String idade) throws SQLException{
        comandoSql = "insert into usuario(nome,idade) values(?,?)";
         try {
            
             stmt=con.prepareStatement(comandoSql);
             stmt.setString(1,nome);
             stmt.setString(2,idade);
             stmt.executeUpdate();               
            
           JOptionPane.showMessageDialog(null, "matriculado com sucesso");
            
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar aluno"+ ex);
         }
         finally
         { 
        
         } 
     }
    
    
}
