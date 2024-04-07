package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {

		// Notacao ponto
		// Atributos e comportamentos, o tipo primitivo nao aceita
		
		String s = "Bom dia X";
		// toUpCase é para deixar tudo maiusculo, porem dessa forma nao irar acontecer
		// nada
		s.toUpperCase();
		System.out.println(s);

		// tenho que armazenar dentro da variavel "s"
		s = s.toUpperCase();
		System.out.println(s);

		// mudando a letra X para Senhora

		s = s.replace("X", "Senhora");
		System.out.println(s);

		s = s
			.replace("Senhora", "Senhora Maiusculo")
			.toUpperCase()
			.concat("!!!");

		System.out.println(s);

		String x = "Ramon".toUpperCase().concat(" é lindo!");
		System.out.println(x);

	}

}
