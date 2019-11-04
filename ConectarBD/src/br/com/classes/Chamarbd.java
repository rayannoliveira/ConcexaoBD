package br.com.classes;

import br.com.conexao.ConnectionFactory;
import br.com.classes.Usuario;
import br.com.dao.usuarioDAO;

public class Chamarbd {
	
	private String idade="23";
	private String nomeBd="Rayanne";
 public Chamarbd() {
	 salvarbd();
 }
	
	public void salvarbd() {
		System.out.println("foi");
		Usuario ai= new Usuario();
		ai.setNome(nomeBd);
		ai.setIdade(idade);
		usuarioDAO objDao = new usuarioDAO();
		objDao.salvarUsuario(ai);
	}
	

}
