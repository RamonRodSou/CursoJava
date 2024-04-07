package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informacoes do funcionario
		
		
		//Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos =  442; // maximo 32767;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // 3_134_845_223 se colocar sem o "L" no final, o JAVA intende que eh do tipo "int" e verifica a capacidade do tamanho.

		
		//Tipos numericos reais
		float salario = 11_445.44F;  // mesma coisa do long, se nao colcoar o "F" no final, o JAVA vai entender que é um "double".
		double vendasAcumuladas = 2_991_797_193.01;
		
		
		//Tipo booleanos
		boolean estaDeFerias = false; // ou true
		
		
		//Tipo caractere
		char status = 'A'; // permite apenas um caractere ou um codigo unicode
		
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " +  salario);
		System.out.println("Férias: " + estaDeFerias);
		System.out.println("Status: " + status);
	}
	
	

}
