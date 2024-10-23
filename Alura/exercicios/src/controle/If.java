package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Ïnforme a media do aluno: ");
		
		double media = entrada.nextDouble();
		
		if ( media <= 10.0 && media >= 7.0) {
			System.out.println("Aluno Aprovado");
		}
		
		boolean  reprovado = ( media < 70.0 && media >= 4.5 );
		if (reprovado) {

			System.out.println("Aluno Reprovado");
		}
		
		if ( media < 4.5 && media >= 0) System.out.println("Aluno Reprovado");

	
		entrada.close();
	}

}
