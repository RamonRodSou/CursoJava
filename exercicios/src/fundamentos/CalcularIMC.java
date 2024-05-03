package fundamentos;

import java.util.Scanner;

public class CalcularIMC {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua altura: ");
		String alutraString = entrada.nextLine().replace(",",".");
		
		System.out.print("Digite seu peso: ");
		String pesoString = entrada.nextLine().replace(",",".");
		
		double altura = Double.parseDouble(alutraString);
		double peso = Double.parseDouble(pesoString);
		
		double imc = peso / ( altura * altura);

		System.out.printf("Seu IMC é: %.2f", imc);
	}
}
