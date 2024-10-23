package operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		
		// INCREMENTO E DECREMENTO
		
		// Forma Pos Fixada
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		// Forma Pre Fixada
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println( a + "\n" + b);
		
		System.out.println("Mini Desafio ...");
		System.out.println(++a == b--);
		System.out.println( a == b);
		System.out.println(a);
		System.out.println(b);
	}

}
