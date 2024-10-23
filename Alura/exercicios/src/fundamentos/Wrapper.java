package fundamentos;

public class Wrapper {

	public static void main(String[] args) {
		
		// Versao Orientada a Objeto dos tipos primitivos

		//byte
		
		Byte b = 100;
		Short s = 1000;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		
		//int
		
		String numero = "17459";
		
		Integer i = 10000;		
		Integer parseInt = Integer.parseInt(numero);
		Long l = 100000L;
		System.out.println(( parseInt + i )* 2 );
		System.out.println( l / 3 );
		
		//float
		Float f = 123.02F;
		System.out.println(f);
		
		//double
		Double d = 1234.4321;
		System.out.println(d);
		
		//boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		//char
		Character ch = 'R';
		System.out.println(ch + "amon");
		
	}
	
}
 