package operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		/* 
		 * Trabalho na terca ( V ou F )
		 * Trabalho na quinta ( V ou F )
		 * 
		 * 1 - Se os 2 trabalhos derem certo, comprar Tv 50p no fds
		 * 2 - Se 1 trabalho der certo, comprar Tv 32P
		 * 3 - ou Comprando Tv 50 ou 32 a familia iria pro shop comer sorvete
		 * 4 - Os 2 trabalhos nao deram certo, familia em casa
		*/
		
		boolean trab1 = true;
		boolean trab2 = true;
		 
		System.out.println( "Comprar Tv 50 e tomar sorvete " + (trab1 && trab2));
		System.out.println( "Comprar Tv 32 e tomar sorvete " + (trab1 ^ trab2));
		System.out.println( "Comprar uma Tv 50 ou 32 e tomar Sorvete " + (trab1 || trab2) );
		System.out.println("Deu Ruim " + (!trab1 && !trab2));

		
	}
}
