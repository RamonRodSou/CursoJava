package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		/*
		 * Tudo em JAVA é objeto, menos os primitivos.
		 * String textoString = "Texto";
		 * String é uma classe, um objeto, e todos os objetos tem seus atributos:
		 * textoString.(atributos)
		 */
		
		String s = new String ("Texto");
		
		
		/*
		 Os tipos primitovs nao sao objetos.
		 int é um tipo primitivo, e os primitivos nao tema tributos
		 mas tem os 
		 Wrappers - é a versao objeto dos tipos primitivos
		 */
		
		int a = 123;
		
		System.out.printf("Tipos %nString Objeto: %s %nPrimitivo que nao é um objeto: %d", s,a);
	}

}
