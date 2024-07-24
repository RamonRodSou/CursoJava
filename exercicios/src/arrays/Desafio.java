package arrays;

import java.util.Scanner;

public class Desafio {
	
	// Calcular a Media de notas dos alunos
	// O programa vai perguntar quantas notas quer calcular
	// O usuario vai passar cada nota
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print(" Informe quantas notas quer calcular");
		int quantidade = entrada.nextInt();
		
		double [] notas = new double [quantidade];
		

		for(int i = 0; i < notas.length; i++) {
			System.out.print("informe a nota " + (i + 1) + " : ");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		System.out.print("Média: " + total / notas.length );
		
		entrada.close();
	}

}
