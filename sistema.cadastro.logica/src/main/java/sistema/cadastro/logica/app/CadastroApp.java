package sistema.cadastro.logica.app;

import sistema.cadastro.logica.service.GestorUsuarios;

public class CadastroApp {

	// SISTEMA DE CADASTRO

	public static void main(String[] args) {

		GestorUsuarios gestor = new GestorUsuarios();

		//Exemplos de cadastro:
		//Informe nome, idade, email e senha.
		gestor.cadastrarUsuario("Fabio", 25, "teste@gmail.com", "teste123");
		gestor.cadastrarUsuario("João", 33, "teste@gmail.com", "teste123");
		
		//Tentativa de cadastro sem preencher os dados obrigatórios.
		gestor.cadastrarUsuario("", 0, "", "");
		
		//Listando usuários cadastrados
		gestor.listarUsuario();
		
		//Função de alterar usuários
		//Informe o nome que deseja alterar, novo nome, nova idade, novo email e nova senha 
		gestor.alterarUsuario("Fabio", "Anderson", 40, "teste@gmail.com", "teste123");
		
		gestor.listarUsuario();
		
		//Excluindo usuários cadastrados
		gestor.excluirUsuario("Anderson");

	}
}
