package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario ("Ramon");
		
		lista.add(u1);
		lista.add(new Usuario("Samara"));
		lista.add(new Usuario("Eloisa"));
		lista.add(new Usuario("Antonio"));
		lista.add(new Usuario("Hilda"));
		lista.add(new Usuario("Cris"));

		System.out.println(lista.get(2).nome); // Acessar pelo indice
		
		System.out.println(">>>" + lista.remove(5));
		System.out.println(">>> " + lista.remove(new Usuario("Hilda")));
		System.out.println("Tem " + lista.contains(new Usuario("Eloisa")));


		for( Usuario u: lista) {
			System.out.println(u.nome);
			//System.out.println(u.toString());

		}
		
	}
}
