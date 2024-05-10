package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar " + "As palavras mágicas...");
			System.out.print("Quer Sair? ");
			 texto = entrada.nextLine();
			
		} while (!texto.equalsIgnoreCase("sair"));
		
			System.out.println("Parabéns vocÊ conseguiu sair!!");
		
		entrada.close();
	}
}
