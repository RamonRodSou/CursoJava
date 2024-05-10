package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		// Calc Media, usuario digita nota de 0 a 10;
		// armazenar no valor total, e total a soma de todas as notas
		// outra variavel para definir quantas notas validas foram digitadas
		// sempre que o usuario digitar nota valida, vai somar na outra variavel 1,2,3....
		// no final vai calcular media, quando o usuario digitar -1 vai sair do programa e calc a media
		
		
		Scanner entrada = new Scanner(System.in);

		double notas = 0.0;
		double media = 0.0;
		int contador = 0;
		double valor = 0.0;
		
		while(notas != (-1)) {
			
			System.out.print("Digite uma nota: ");
			notas = entrada.nextDouble();
			
			if( notas <= 10 && notas >= 0 ) {
				valor += notas;
				contador++;
			}else if(notas != -1) {
				System.out.println("Nota invalida");
			}
			
			System.out.println(contador);
		}
		
		media = valor / contador ;
		System.out.println("Média: " + media);
		
		entrada.close();
	}

}
