package operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 2;
		int b = a;
		int c = a + b;
		
		
		c += b; // c = c + b;
		c -= b; // c = c - b;
		c *= b; // c = c * b;
		c /= b; // c = c / b;
		
		
		System.out.println(c);
		c %= 2; // c = c % 2; R: 0 ou 1;
		if ( c == 0 ) {
			System.out.println(c + " é par");
		}else {
			System.out.println(c + " é impar");
		}
		
		
	}
}
 