package operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 8.0;		

		String resultadoFinal = media >= 7.0 ? 
				"Aprovado" : "Recuperacao";
	
		System.out.println(resultadoFinal);
		
		
		double nota =  9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf ("Tem descont? %s", resultado);
		
		
	}

}
