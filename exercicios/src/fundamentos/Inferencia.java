package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		//a = "..."; ele nao vai aceitar uma string, pq ja foi definidor que eh do tipo double
		
		var b = 3.4; // aqui msmo eu declarando um VAR o JAVA ler o que receve e entende que é um DOUBLE	
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);

		// c = 2.43;  nao consuigo fazer isso pq o VAR C é endido pelo JAVA que é uma string 
			
		double d;
		d = 123.23;
		System.out.println(d);
		
		/*
		 * nao consigo fazer isso com o var
		 * no VAR tenho que declarar tudo na mesma linha
		 * pro java poder inferir qual tipo é a variavel
		 
			var e;
			123.24;
			System.out.println(e);
		 */

	}
}
