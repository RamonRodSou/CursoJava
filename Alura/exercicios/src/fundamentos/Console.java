package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
	
	// Jogar Dados no Console
		
		// print  fica tudo na mesma linha
		System.out.print("Bom");
		System.out.print(" dia! \n\n");
		
		//println pula uma linha
		System.out.println("Bom");
		System.out.println("Dia");
		
		//printf é um print formatado
		System.out.printf("Numero do Sorteio %d %d %d %d %d %n", 2,1,3,5,6);
		System.out.printf("Meu Salário é %.1f %n", 15090.5678);
		System.out.printf("Nome: %s %n", "João");
		 
		//Entrada de informacao 
		Scanner entrada = new Scanner(System.in); 
		
		System.out.print("\n\nDigite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobreNome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		/*Então, o que acontece é: "Qual a sua idade?" é impresso, digitamos o valor e apertamos enter. 
		 * Quando fazemos isso, o buffer de entrada fica com o conteúdo "25\n", e quando o nextInt() 
		 * faz a leitura, ele lê apenas o 25, deixando o "\n" para trás. Depois disso, "Qual o seu nome?" 
		 * é impresso, e o método nextLine() vai ler tudo que estiver no buffer de entrada até encontrar um "\n".
		 *  Como o nextInt() deixou um "\n" para trás, é esse o valor que o nextLine() lê. 
		 *  Isso conclui a leitura e a próxima linha de código, que é "Qual o seu sobrenome?", é impressa.
		 *  Para resolver esse problema, precisamos "pegar" o "\n" que o nextInt() não lê. 
		 *  Isso pode ser feito colocando um comando nextLine() depois do nextInt(), 
		 *  de modo que o código abaixo vai funcionar da maneira como queríamos.
		*/
		entrada.nextLine();
		
		System.out.print("Digite o nome da sua mae: ");
		String nomeMae = entrada.nextLine();
		
		System.out.printf("%nNome: %s %nSobrenome: %s %nIdade: %d anos %nSua mae é a: %s", nome, sobreNome, idade, nomeMae);
		
		
		entrada.close();
	}
	
	
}
