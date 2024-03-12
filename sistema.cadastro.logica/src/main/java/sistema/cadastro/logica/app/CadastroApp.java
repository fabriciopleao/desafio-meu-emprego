package sistema.cadastro.logica.app;

import sistema.cadastro.logica.service.GestorUsuarios;

public class CadastroApp {

	// SISTEMA DE CADASTRO

	public static void main(String[] args) {

		GestorUsuarios gestor = new GestorUsuarios();

		//Exemplos de cadastro:
		//Informe nome, idade, email e senha.
		gestor.cadastrarUsuario("Fabio", 25, "teste@gmail.com", "teste123");
		gestor.cadastrarUsuario("Jo�o", 33, "teste@gmail.com", "teste123");
		
		//Tentativa de cadastro sem preencher os dados obrigat�rios.
		gestor.cadastrarUsuario("", 0, "", "");
		
		//Listando usu�rios cadastrados
		gestor.listarUsuario();
		
		//Fun��o de alterar usu�rios
		//Informe o nome que deseja alterar, novo nome, nova idade, novo email e nova senha 
		gestor.alterarUsuario("Fabio", "Anderson", 40, "teste@gmail.com", "teste123");
		
		gestor.listarUsuario();
		
		//Excluindo usu�rios cadastrados
		gestor.excluirUsuario("Anderson");

	}
}
