package classe;

import java.util.Scanner;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data aniversarioAntonio = new Data();

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia do seu aniversario: ");
		aniversarioAntonio.dia = entrada.nextInt();
		System.out.println();
		
		System.out.print("Digite o mës do seu aniversario: ");
		aniversarioAntonio.mes = entrada.nextInt();
		System.out.println();

		
		System.out.print("Digite o ano que: ");
		aniversarioAntonio.ano = entrada.nextInt();
		
		aniversarioAntonio.obterDataFormatada();
		
		String dataFormatada = aniversarioAntonio.dataFormatada();
		System.out.println(dataFormatada);;

		entrada.close();
	}

}
