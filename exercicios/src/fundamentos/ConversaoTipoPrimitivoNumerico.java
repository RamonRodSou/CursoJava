package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		double aa = 1.123456789999;
		;
		System.out.println(aa);
		
		float b = (float) 1.123456789999; // explicita ( CAST )
		System.out.println(b);
		
		
		int c = 310; 
		byte d = (byte) c; 
		
		/* 
		 * vai dar um numero negativo pq ele chega no ultimo numero que o byte suporta 
		 * que é 127 Positivo e depois vota pro  -128 e vai aumentando novamente.
		 */
		
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; // explicita ( CAST )
		System.out.println(f);
	}
}
