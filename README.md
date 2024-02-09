# desafio-meu-emprego-logica
Este projeto desenvolvido em Java na IDE Eclipse visa abordar desafios propostos com o objetivo de aprimorar habilidades e alcançar oportunidades de emprego. A primeira fase concentra-se na lógica de programação, incluindo a implementação de algoritmos para resolver problemas específicos.


## Fase 1: Lógica de Programação
### 1) Contagem de letras 'a'
Implementação de um algoritmo que conta a quantidade de letras 'a' na mensagem fornecida.

	Mensagem fornecida: Eu sou a pessoa mais incrível que eu posso ser, e através do meu esforço vou conquistar o que já é MEU.

### 2) Sistema de Cadastro
Desenvolvimento de um sistema de cadastro com funcionalidades completas de cadastro, exclusão, listagem e alteração de dados, utilizando uma lista para armazenamento.


## Instruções de uso
- Clone este repositório.
- Abra o projeto em uma IDE Java (Eclipse de preferência).
- Siga as instruções específicas de cada desafio dentro de sua respectiva pasta.
- Execute o projeto conforme necessário para testar as funcionalidades implementadas.


## Exemplo de uso contador
### Aqui está um exemplo de como usar a função de contagem de letras 'a':

	Linha 40 - informe a frase desejada
	String frase = "Eu sou a pessoa mais incrível que eu posso ser, e através do meu esforço vou conquistar o que já é MEU.";

	Linha 41 - informe a o caracter desejado
	char letraA = 'a';

	Console:
	Número de vezes que a letra 'a' aparece: 6


## Exemplo de uso sistema de cadastro
### Aqui está um exemplo de como usar as funções de cadastro:

 	- Chame o metodo da classe GestorUsuarios utilizando o ponteiro "gestor". 

   	- Função de cadastro.
  	- Informe nome, idade, email e senha.
	gestor.cadastrarUsuario("Fabio", 25, "teste@gmail.com", "teste123");
	gestor.cadastrarUsuario("João", 33, "teste@gmail.com", "teste123");
		
	- Função de listar usuários cadastrados.
	gestor.listarUsuario();
		
	- Função de alterar usuários
	- Informe o nome que deseja alterar, novo nome, nova idade, novo email e nova senha (Caso queira alterar uma única informação, 		mantenha as mesmas informações).
	gestor.alterarUsuario("Fabio", "Anderson", 40, "teste@gmail.com", "teste123");

 	- Função de listar usuários cadastrados.
	gestor.listarUsuario();

  	- Função de excluir usuário.
   	- Informe o nome do usuário.
	gestor.excluirUsuario("Anderson");

 	Console:
  	USUÁRIO CADASTRADO COM SUCESSO! 
	Nome: Fabio Idade: 25 Email: teste@gmail.com
	===================================================
	USUÁRIO CADASTRADO COM SUCESSO! 
	Nome: João Idade: 33 Email: teste@gmail.com
	===================================================
	===================================================
	Lista de usuários:
	Nome - Fabio, Idade - 25, Email - teste@gmail.com
	Nome - João, Idade - 33, Email - teste@gmail.com
	===================================================
	Usuário alterado com sucesso: Nome - Anderson, Idade - 40, Email - teste@gmail.com
	===================================================
	===================================================
	Lista de usuários:
	Nome - Anderson, Idade - 40, Email - teste@gmail.com
	Nome - João, Idade - 33, Email - teste@gmail.com
	===================================================
	Usuário excluído com sucesso: Nome - Anderson
	===================================================
