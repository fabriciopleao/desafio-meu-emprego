package contador.logica.caracteres;

public class AlgoritimoA {

	//FASE 1 - LOGICA DE PROGRAMAÇÃO
	// Montar um algoritimo para ler a quantidade de letras 'a' na mensagem abaixo
    //"Eu sou a pessoa mais incrível que eu posso ser, e através do meu esforço vou conquistar o que já é MEU."
	
	public static int contarLetra(String frase, char a) {
		
		//método tranformando todos os caracteres da frase desejada em minúsculas
		frase = frase.toLowerCase();
		
		//variável indicando a inicialização da contagem
		int contadorLetra = 0;
		
		//método transformando a letra desejada em mínuscula
		char letraLowerCase = Character.toLowerCase(a);

		//o loop percorre cada caractere na string 'frase'
		for (int i = 0; i < frase.length(); i++) {
			
		//método para obter o caractere na posição 'i' da string 'frase'
		//onde o caractere é armazenado na váriavel 'letterA'
			char letterA = frase.charAt(i);
			
		//verificar se a letra 'a' é igual à letra convertida para minúsculas
			if (letterA == letraLowerCase) {
				
		//Se o caractere na posição atual for igual à letra desejada
		//o contador é incrementado, indicando que uma ocorrência da letra foi encontrada.		
				contadorLetra++;
			}
		}
		//retorna o valor atual do contador
		return contadorLetra;
	}
		//método main com finalidade de contar quantos caracteres 'a' existem na frase
	public static void main(String[] args) {
		String frase = "Eu sou a pessoa mais incrível que eu posso ser, e através do meu esforço vou conquistar o que já é MEU.";
		char letraA = 'a';
		int resultado = contarLetra(frase, letraA);

		System.out.println("Número de vezes que a letra '" + letraA + "' aparece: " + resultado);

	}

}
