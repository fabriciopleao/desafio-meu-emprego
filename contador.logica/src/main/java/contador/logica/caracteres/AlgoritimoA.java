package contador.logica.caracteres;

public class AlgoritimoA {

	//FASE 1 - LOGICA DE PROGRAMA��O
	// Montar um algoritimo para ler a quantidade de letras 'a' na mensagem abaixo
    //"Eu sou a pessoa mais incr�vel que eu posso ser, e atrav�s do meu esfor�o vou conquistar o que j� � MEU."
	
	public static int contarLetra(String frase, char a) {
		
		//m�todo tranformando todos os caracteres da frase desejada em min�sculas
		frase = frase.toLowerCase();
		
		//vari�vel indicando a inicializa��o da contagem
		int contadorLetra = 0;
		
		//m�todo transformando a letra desejada em m�nuscula
		char letraLowerCase = Character.toLowerCase(a);

		//o loop percorre cada caractere na string 'frase'
		for (int i = 0; i < frase.length(); i++) {
			
		//m�todo para obter o caractere na posi��o 'i' da string 'frase'
		//onde o caractere � armazenado na v�riavel 'letterA'
			char letterA = frase.charAt(i);
			
		//verificar se a letra 'a' � igual � letra convertida para min�sculas
			if (letterA == letraLowerCase) {
				
		//Se o caractere na posi��o atual for igual � letra desejada
		//o contador � incrementado, indicando que uma ocorr�ncia da letra foi encontrada.		
				contadorLetra++;
			}
		}
		//retorna o valor atual do contador
		return contadorLetra;
	}
		//m�todo main com finalidade de contar quantos caracteres 'a' existem na frase
	public static void main(String[] args) {
		String frase = "Eu sou a pessoa mais incr�vel que eu posso ser, e atrav�s do meu esfor�o vou conquistar o que j� � MEU.";
		char letraA = 'a';
		int resultado = contarLetra(frase, letraA);

		System.out.println("N�mero de vezes que a letra '" + letraA + "' aparece: " + resultado);

	}

}
