package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		
		double [] notasAlunoA = new double [3];
	  //double notasAlunoA [] = new double [3];
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;

		// Para mostrar o Array, tem que chamar o obj Arrays e coloca a notacao .toString
		System.out.println(Arrays.toString(notasAlunoA));
		
		// Pegar a primeira nota
		System.out.println(notasAlunoA[0]);
		
		// Pegar a ultima nota
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		
		// Pegar a uma quantidade errada do tamanho do array, vai dar erro
		// System.out.println(notasAlunoA[4]);
		
		//Pegando o Array e Somando no Total e fazendo a média
		double totalAlunoA = 0;
		
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);


//---------------------------------------------------------------------------------
		
		// Outrta forma de fazer um Array
		final double notaArmazenada = 6.0;
		double [] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
		double totalAlunoB = 0;
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];

		}
		System.out.println(totalAlunoB / notasAlunoB.length);
		
		
//---------------------------------------------------------------------------------
		
		//Exercicio Foreach
		
		for(double nota: notasAlunoB) {
			System.out.print(nota + " ");
		}

		
	}
}
