package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		// Desafio
		// tenho que ter o mesmo resultado da escadinha de #
		// Não posso usar valor numérico para controlar o laço!
		
		String maximo = "#####";
		Boolean minimo = (valor.equals(maximo));
		
		while(minimo != true) {
			
			System.out.println(valor);
			
			minimo = (valor.equals(maximo));
			valor += "#";
		}
		
		// resposta do professor:
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}

	}
	
	
	

}
