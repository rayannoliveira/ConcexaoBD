package br.com.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
	  private final static String DRIVER = "com.mysql.jdbc.Driver";
	    private final static String URL = "jdbc:mysql://fdb15.awardspace.net:3306/2196330_bdconecta ";
	    private final static String USER = "2196330_bdconecta ";
	    private final static String SENHA = "38949abc";
	//Metodo responsavel por estabelecer a conexão com o BD
	    public static Connection getConnection() {
	    
	        try {
	            Class.forName(DRIVER);
	            System.out.println("foi");
	            return DriverManager.getConnection(URL, USER, SENHA);
	            
	        } catch (ClassNotFoundException | SQLException e) {
	            throw new RuntimeException("Erro na conex�o", e);
	        }
	    }

	 
	
}
