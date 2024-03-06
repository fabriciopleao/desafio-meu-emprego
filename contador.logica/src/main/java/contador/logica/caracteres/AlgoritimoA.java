package contador.logica.caracteres;

public class AlgoritimoA {

	// LOGICA DE PROGRAMAÇÃO
	// Algoritimo criado para verificar a quantidade de vezes que um determinado
	// caracterer aparece em uma mensagem.

	public static int contarLetra(String mensagem, char caractereDesejado) {

		// variável indicando a inicialização da contagem
		int contadorLetra = 0;

		// o loop percorre cada caractere na string 'frase'
		for (int i = 0; i < mensagem.length(); i++) {

			// método para obter o caractere na posição 'i' da string 'frase'
			char caractere = mensagem.charAt(i);

			// Verifica se o caractere atual é igual ao caractere desejado
			if (caractere == caractereDesejado) {
				// Incrementa o contador se for igual
				contadorLetra++;
			}
		}
		// retorna o valor atual do contador
		return contadorLetra;
	}

	// método main com finalidade de contar quantos caracteres 'a' existem na frase
	public static void main(String[] args) {

		// informe o caractere
		char caractere = 'a';
		
		// informe a mensagem
		String mensagem = "Eu sou a pessoa mais incrível que eu posso ser, e através do meu esforço vou conquistar o que já é MEU.";

		// informe a frase
		int resultado = contarLetra(mensagem, caractere);

		// imprime a quantidade
		System.out.println(resultado);
		
	}

}
