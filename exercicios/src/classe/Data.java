package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	//Melhor opcao!
	String dataFormatada() {
		return String.format("Sua data é %d/%d/%d",dia, mes, ano);
	}
	
	// Vai exibir apenas no terminal do sistema
	void obterDataFormatada() {
		System.out.printf("Sua data é %d/%d/%d \n",dia, mes, ano);
	}
	
	// Vai exibir apenas no terminal do sistema
	void obterDataFormatada2() {
		System.out.println(dataFormatada());
	}
	
	
}
