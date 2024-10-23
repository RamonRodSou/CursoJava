package fundamentos;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		String celsiusTemp = entrada.next().replace(",", ".");
		
		double celius = Double.parseDouble(celsiusTemp);
		
		double fahrenheit = (celius * 1.8) + 32;
		
		System.out.printf("Temperatura em Fahrenheit: %.2f F", fahrenheit);
		entrada.close();

	}
}
