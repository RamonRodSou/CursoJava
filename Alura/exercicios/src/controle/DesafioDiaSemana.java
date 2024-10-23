package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		// Digitar 
		// Domingo -> 1
		// Quarta -> 4
		// Terça -> 3
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o dia da semana ");
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("Domingo") ) {
			System.out.println("Domingo = 1");
				
		}else if(dia.equalsIgnoreCase("Quarta")) {
			System.out.println("Quarta = 4");
			
		}else if(dia.equalsIgnoreCase("Terça") || dia.equalsIgnoreCase("Terca")) {
			System.out.println("Terça = 3");
			
		}else {
			System.out.println("Dia inválido");
		}
		
	}

}
