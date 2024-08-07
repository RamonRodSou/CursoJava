package fundamentos;

public class CalcularATemperatura {
	public static void main(String[] args) {
	
		// ( F - 32 ) * 5 / 9  = C
		// jshell no terminal para abrir o ambiente JAVA
		
		final double TRINTAEDOIS = 32;
		final double CINDODIVNOVE = 5.0/9.0;
		
		double fahrenheit = 82.3;
		double celsius = ( fahrenheit - TRINTAEDOIS ) * CINDODIVNOVE;
		
		System.out.println(fahrenheit + " fahrenheit para celsius é igual a: " + celsius);
		
		fahrenheit = 42.3;
		celsius = ( fahrenheit - TRINTAEDOIS ) * CINDODIVNOVE;
		
		System.out.println(fahrenheit + " fahrenheit para celsius é igual a: " + celsius);

	}

}
