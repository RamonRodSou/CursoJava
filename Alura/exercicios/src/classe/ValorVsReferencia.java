package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {

		// Atribuicao por Valor, usando um PRIMITIVO	
		double a = 2;
		double b = a; // atribuicao por valor
		
		a++;
		b--;
		System.out.println(a + "   " + b);
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c + "Notamos que nao altera o valor");
		
		
		// Atribuicao por Referencia, usando OBJETO
		Data d1 = new Data(02, 07, 1993);
		Data d2 = d1; // astribuicao por referencia (objeto)
		
		d1.dia = 13;
		d2.mes = 9;
		d1.ano = 2024;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());

		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		
	}
	
	// oque passar aqui dentro como referencia, como é um objeto ele vai gerar um impacto diretamento
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	// nao vai gera impactor, 
	static void alterarPrimitivo(int a) {
		a = a + 5;
	}

}
