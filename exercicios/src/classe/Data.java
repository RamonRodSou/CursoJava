package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data () {
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	Data (int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial ;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	//Melhor opcao!
	String dataFormatada() {
		return String.format("Data:  %d/%d/%d",dia, mes, ano);
	}
	
	// Vai exibir apenas no terminal do sistema
	void obterDataFormatada() {
		System.out.printf("Data:  %d/%d/%d \n",dia, mes, ano);
	}
	
	// Vai exibir apenas no terminal do sistema
	void obterDataFormatada2() {
		System.out.println(dataFormatada());
	}
	
	
}
