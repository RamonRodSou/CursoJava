package controle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Inform o número");
		
		int numero = Integer.parseInt(valor);
		
		
		int mod = numero % 2;
		
		if(mod == 0 )System.out.println("O numero é Par" );
			
		else System.out.println("O numero é Impar" );

	}

}
