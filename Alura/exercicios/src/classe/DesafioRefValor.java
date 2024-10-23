package classe;


public class DesafioRefValor {
		
	int a = 3; // não pode mexer aqui!

	static int b = 5;
	public static void main(String[] args) {

		// pode mexer aqui
		DesafioRefValor valorA = new DesafioRefValor();
		
		System.out.println(valorA.a); // pode mexer aqui	
		// pode mexer aqui
		
		System.out.println(b);
	}
	
}
		

