package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	String formato = "Data: %d/%d/%d";

	Data () {
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this(1, 1, 1970); // estou chamando o construtor de baixo dentro desse construtor (* this como metodo)
	}
	
	// this para referenciar o método atual
	// this nao pode ser usado em metodo static
	// this é uma instancia da classe
	
	Data (int dia, int mes, int ano) {
		this.dia = dia ;    // this para diferenciar o parametro como método
		this.mes = mes;
		this.ano = ano;
	}
	
	//Data (int diaInicial, int mesInicial, int anoInicial) {
	//	dia = diaInicial ;
	//	mes = mesInicial;
	//	ano = anoInicial;
	//}
	
	


	//Melhor opcao!
	String dataFormatada() {
		return String.format(formato, this.dia, mes, ano);
	}
	
	// Vai exibir apenas no terminal do sistema
	void obterDataFormatada() {
		System.out.printf(formato,dia, mes, ano);
	}
	
	// Vai exibir apenas no terminal do sistema
	void obterDataFormatada2() {
		System.out.println(dataFormatada());
		//ou
		System.out.println(this.dataFormatada());

	}
}
