package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "laranja";
		
		switch (faixa.toLowerCase()) {
		
		case "preta":
			System.out.println("Mestre");
		case "marrom":
			System.out.println("Professor");
		case "roxa":
			System.out.println("Supervisor");
		case "verde":
			System.out.println("Lutador");
		case "laranja":
			System.out.println("Aprendiz");
			break;
		default:
			System.out.println("Expectador");
		}

		System.out.println("Fim");
		
		int idade = 3;
		
		switch (idade) {
		case 3:
			System.out.println("Sabe nadar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe chorar");
		}

	}


}
