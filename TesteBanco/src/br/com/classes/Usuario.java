package br.com.classes;

import java.sql.SQLException;

import br.com.dao.DAOusuario;

public class Usuario {
	private static String nome="rayanne";
	private static String idade="23";
	public static void main(String[] args) throws SQLException {
	DAOusuario objdao= new DAOusuario();
	objdao.cadastrarUsuario(nome, idade);
	
		
	}

}
