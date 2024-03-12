package sistema.cadastro.logica.service;

import java.util.ArrayList;
import java.util.List;

import sistema.cadastro.logica.modal.Usuario;

public class GestorUsuarios {

	// Lista para armazenar os dados de usuario
	public List<Usuario> usuarios = new ArrayList<Usuario>();

	// Método para cadastrar novo usuário
	public void cadastrarUsuario(String nome, int idade, String email, String senha) {
	    // Verifica se algum dos campos obrigatórios está em branco
	    if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
	        System.out.println("PREENCHA OS CAMPOS OBRIGATÓRIOS!");
	        return; // Sai do método sem cadastrar o usuário
	    }
	    
	    // Verifica se o usuário já está cadastrado pelo email
	    boolean usuarioExistente = usuarios.stream().anyMatch(usuario -> usuario.getEmail().equals(email));

	    if (!usuarioExistente) {
	        Usuario novoUsuario = new Usuario(nome, idade, email, senha);
	        usuarios.add(novoUsuario);
	        System.out.println("USUÁRIO CADASTRADO COM SUCESSO! \n" + "Nome: " + nome + " Idade: " + idade + " Email: " + email);
	        System.out.println("");
	    } else {
	        System.out.println("Usuário já cadastrado com o email: " + email);
	        System.out.println("");
	    }
	}

	// Método para listar usuários
	public void listarUsuario() {
		if (usuarios.isEmpty()) {
			System.out.println("");
			System.out.println("Nenhum usuário cadastrado.");
			System.out.println("");
		} else {
			System.out.println("");
			System.out.println("Lista de usuários:");
			for (Usuario usuario : usuarios) {
				System.out.println("Nome - " + usuario.getNome() + ", Idade - " + usuario.getIdade() + ", Email - "
						+ usuario.getEmail());
			}
		}
	}

	// Método para alteração de usuário
	public void alterarUsuario(String nomeAntigo, String novoNome, int novaIdade, String novoEmail, String novaSenha) {
		for (Usuario usuario : usuarios) {
			if (usuario.getNome().equals(nomeAntigo)) {
				usuario.setNome(novoNome);
				usuario.setIdade(novaIdade);
				usuario.setEmail(novoEmail);
				usuario.setSenha(novaSenha);
				System.out.println("");
				System.out.println("Usuário alterado com sucesso: Nome - " + novoNome + ", Idade - " + novaIdade
						+ ", Email - " + novoEmail);
				System.out.println("");
				return;
			}
		}
		System.out.println("");
		System.out.println("Usuário não encontrado para alteração.");
		System.out.println("");
	}

	// Método para excluir usuário
	public void excluirUsuario(String nome) {
		boolean usuarioEncontrado = false;

		for (Usuario usuario : usuarios) {
			if (usuario.getNome().equals(nome)) {

				usuarios.remove(usuario);
				System.out.println("");
				System.out.println("Usuário excluído com sucesso: Nome - " + nome);
				System.out.println("");
				usuarioEncontrado = true;
				break;
			}
			if (!usuarioEncontrado) {
				System.out.println("");
				System.out.println("Usuário não encontrado na lista.");
				System.out.println("");

			}
		}

	}

}
