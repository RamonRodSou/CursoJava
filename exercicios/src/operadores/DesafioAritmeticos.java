package operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		/*
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3);
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
	*/
		int numAa = 6;
		int numAb = 3;
		int numAb2 = 2;
		
		int divAa = 3;
		int divAb = 2;
		
		int numBa = 1;
		int numBa2 = 5;
		int numBb = 2;
		int numBb2 = 7;
		
		int divB = 2;
	
		int divGeral = 10;
		
		// Primeira Operação
		int formA = ( numAa * (numAb + numAb2) );
		int formAPow = (int) Math.pow(formA, 2);
		int formAdiv = (formAPow)/ (divAa * divAb);
			
		System.out.println(formAdiv);
		
		// Segunda Operação
		int formB = ((  numBa - numBa2) * (numBb - numBb2));
		int formBdiv = (formB)/ divB;
		int formBPow = (int) Math.pow(formBdiv, 2);

		System.out.println(formBPow);
		
		// Terceira Operacao
		
		int formAmenosBelevado3 = (int) Math.pow( (formAdiv - formBPow), 3);
		int dezElevado3 = (int) Math.pow(divGeral,3);
		
		int result = formAmenosBelevado3 / dezElevado3;
		
		System.out.println("O resultado é: " + result);
	
		

	}

}
