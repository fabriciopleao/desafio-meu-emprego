package sistema.cadastro.logica.service;

import java.util.ArrayList;
import java.util.List;

import sistema.cadastro.logica.modal.Usuario;

public class GestorUsuarios {

	// Lista para armazenar os dados de usuario
	public List<Usuario> usuarios = new ArrayList<Usuario>();

	// M�todo para cadastrar novo usu�rio
	public void cadastrarUsuario(String nome, int idade, String email, String senha) {
	    // Verifica se algum dos campos obrigat�rios est� em branco
	    if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
	        System.out.println("PREENCHA OS CAMPOS OBRIGAT�RIOS!");
	        return; // Sai do m�todo sem cadastrar o usu�rio
	    }
	    
	    // Verifica se o usu�rio j� est� cadastrado pelo email
	    boolean usuarioExistente = usuarios.stream().anyMatch(usuario -> usuario.getEmail().equals(email));

	    if (!usuarioExistente) {
	        Usuario novoUsuario = new Usuario(nome, idade, email, senha);
	        usuarios.add(novoUsuario);
	        System.out.println("USU�RIO CADASTRADO COM SUCESSO! \n" + "Nome: " + nome + " Idade: " + idade + " Email: " + email);
	        System.out.println("");
	    } else {
	        System.out.println("Usu�rio j� cadastrado com o email: " + email);
	        System.out.println("");
	    }
	}

	// M�todo para listar usu�rios
	public void listarUsuario() {
		if (usuarios.isEmpty()) {
			System.out.println("");
			System.out.println("Nenhum usu�rio cadastrado.");
			System.out.println("");
		} else {
			System.out.println("");
			System.out.println("Lista de usu�rios:");
			for (Usuario usuario : usuarios) {
				System.out.println("Nome - " + usuario.getNome() + ", Idade - " + usuario.getIdade() + ", Email - "
						+ usuario.getEmail());
			}
		}
	}

	// M�todo para altera��o de usu�rio
	public void alterarUsuario(String nomeAntigo, String novoNome, int novaIdade, String novoEmail, String novaSenha) {
		for (Usuario usuario : usuarios) {
			if (usuario.getNome().equals(nomeAntigo)) {
				usuario.setNome(novoNome);
				usuario.setIdade(novaIdade);
				usuario.setEmail(novoEmail);
				usuario.setSenha(novaSenha);
				System.out.println("");
				System.out.println("Usu�rio alterado com sucesso: Nome - " + novoNome + ", Idade - " + novaIdade
						+ ", Email - " + novoEmail);
				System.out.println("");
				return;
			}
		}
		System.out.println("");
		System.out.println("Usu�rio n�o encontrado para altera��o.");
		System.out.println("");
	}

	// M�todo para excluir usu�rio
	public void excluirUsuario(String nome) {
		boolean usuarioEncontrado = false;

		for (Usuario usuario : usuarios) {
			if (usuario.getNome().equals(nome)) {

				usuarios.remove(usuario);
				System.out.println("");
				System.out.println("Usu�rio exclu�do com sucesso: Nome - " + nome);
				System.out.println("");
				usuarioEncontrado = true;
				break;
			}
			if (!usuarioEncontrado) {
				System.out.println("");
				System.out.println("Usu�rio n�o encontrado na lista.");
				System.out.println("");

			}
		}

	}

}
