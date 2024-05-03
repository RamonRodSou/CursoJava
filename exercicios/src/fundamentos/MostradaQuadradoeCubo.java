package fundamentos;

import java.util.Scanner;

public class MostradaQuadradoeCubo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro: ");
		String numString = entrada.next().replace(",", ".");
		
		double num = Double.parseDouble(numString);
		
		double quadrado = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		
		System.out.printf("Qudarado: %.2f \nCubo: %.2f", quadrado, cubo);
		
		entrada.close();
	}

}
