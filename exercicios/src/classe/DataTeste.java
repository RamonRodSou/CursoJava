package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data padrao = new Data();
		String dataPadraoNaTela = padrao.dataFormatada();
		System.out.println(dataPadraoNaTela);
		
		Data aniversarioAntonio = new Data(13,07, 2020);
		String dataAniversarioAntonioNaTela = aniversarioAntonio.dataFormatada();
		System.out.println(dataAniversarioAntonioNaTela);
		
	//	Scanner entrada = new Scanner(System.in);
		
	//	System.out.print("Digite o dia do seu aniversario: ");
	//	aniversarioAntonio.dia = entrada.nextInt();
	//	System.out.println();
		
	//	System.out.print("Digite o mës do seu aniversario: ");
	//	aniversarioAntonio.mes = entrada.nextInt();
	//	System.out.println();

		
	//	System.out.print("Digite o ano que: ");
	//	aniversarioAntonio.ano = entrada.nextInt();
		
	//	aniversarioAntonio.obterDataFormatada();
		
	//	String dataFormatada = aniversarioAntonio.dataFormatada();
	//	System.out.println(dataFormatada);;

	//	entrada.close(); 
	}

}
