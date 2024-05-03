package fundamentos;

import java.util.Scanner;

public class FahrenheitToCelsius {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		
		double trindaEDois = 32.0;
		double umPontoOito = 1.8;
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		String fahrenheitString = entrada.nextLine().replace(",",".");

		double fahrenheit = Double.parseDouble(fahrenheitString) ;

		double celsius = ( fahrenheit - trindaEDois ) / umPontoOito;
		
		System.out.printf("Temperatura é: %.2f Celsius", celsius );
		
		entrada.close();
	}

}
