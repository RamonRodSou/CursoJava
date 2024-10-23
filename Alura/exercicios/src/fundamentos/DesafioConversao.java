package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	// Desafio Pegar 3 Salário, fazer a média, e se o usuario digitar 
	// "Ponto ou Virgula" deve funcionar do mesmo jeito.
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Salario de Janeiro: " );
		String janeiro = entrada.nextLine().replace(",",".");
		
		System.out.print("Salario de fevereiro: ");
		String fevereiro = entrada.nextLine().replace(",",".");
		
		System.out.print("Salario de março: ");
		String marco = entrada.nextLine().replace(",",".");
		
		double valorJaneiro = Double.parseDouble(janeiro);
		double valorFevereiro = Double.parseDouble(fevereiro);
		double valorMarco = Double.parseDouble(marco);
		
		double soma = valorJaneiro + valorFevereiro + valorMarco;
		double media = soma / 3;
		
		System.out.println("Soma = " + soma);
		System.out.println("Média = " + media);
		
		entrada.close();
	}
	

}
