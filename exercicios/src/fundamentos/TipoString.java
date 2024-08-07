package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2)); // pegar o 2 character 
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!!"));
		System.out.println(s + "!!!");
		
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));

		System.out.println(s.toUpperCase().endsWith("TARDE"));

		System.out.println(s.length());

		System.out.println(s.equals("boa tarde"));
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("BoA TaRdE"));

		
		var nome = "Ramon";
		var sobreNome = "Rodrigues";
		var idade = 30;
		var salario = 21600.9328;
		
		System.out.println("Nome: " + nome +
							"\nSobrenome: " + sobreNome +
							"\nIdade: " + idade + 
							"\nSalário: " + salario + "\n\n");
		
		String texto = ("Nome: " + nome +
					"\nSobrenome: " + sobreNome +
					"\nIdade: " + idade + 
					"\nSalário: " + salario + "\n\n");

		System.out.println(texto);
		
		String frase = String.format("Sr %s %s tem %d anos e ganha R$%.2f \n", nome, sobreNome, idade, salario);
		
		
		System.out.println(frase);
		System.out.printf("O Sr %s %s tem %d anos e ganha R$%.2f ele é muito rico \n\n", nome, sobreNome, idade, salario);
		
		
		// funções da String
		
		System.out.println("Testando alguma coisa".contains("alg"));
		System.out.println("Testando alguma coisa".indexOf("a coi"));
		System.out.println("Testando alguma coisa".substring(9, 14));

	}
};


