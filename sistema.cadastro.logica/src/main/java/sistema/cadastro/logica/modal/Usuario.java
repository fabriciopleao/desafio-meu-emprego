package sistema.cadastro.logica.modal;

public class Usuario {

	private String nome;
	private int idade;
	private String email;
	private String senha;

	
	// Método construtor
	public Usuario(String nome, int idade, String email, String senha) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.senha = senha;
	}
	
	// Getters and Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
