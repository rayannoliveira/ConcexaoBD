package br.com.dao;

import br.com.conexao.ConnectionFactory;
import br.com.classes.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class usuarioDAO {

	   private Connection con;
	   private PreparedStatement stmt;
	   private ResultSet rs;
	   private String comandosql;  	
public usuarioDAO() {
	con=ConnectionFactory.getConnection();
}

public void salvarUsuario(Usuario a) {
	try {
		comandosql = "insert into usuario(nome,idade) values(?,?)";
		stmt=con.prepareStatement(comandosql);
		stmt.setString(1, a.getNome());
		stmt.setString(2, a.getIdade());
		stmt.execute();
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.print("o erro é "+e);
	}
}

public void mostrarUsuario() {
	
}
	
}
