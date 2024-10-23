package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		String valor = "";
				
		while (!valor.equalsIgnoreCase("sair")) {			
				System.out.print("Digite o valor: ");
				valor = entrada.nextLine();
		}
		
		if(valor.equalsIgnoreCase("sair")) {
			System.out.print("Parabéns consegiu sair");
		}
		
		entrada.close();
	}

}
