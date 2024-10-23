package EqualsHashcode;

public class Equals {

	public static void main(String[] args) {
		
		Usuarios u1 = new Usuarios();
		u1.nome = "Ramon";
		u1.email = "ramon@gmail.com" ;
		
		Usuarios u2 = new Usuarios();
		u2.nome = "Samara";
		u2.email = "samara@gmail.com" ;
		
		Usuarios u3 = new Usuarios();
		u3.nome = "Ramon";
		u3.email = "ramon@gmail.com" ;
		
		System.out.println( u1 == u3);
		System.out.println( u1.equals(u3));
		System.out.println( u3.equals(u1));


	}
}
