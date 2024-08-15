package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetConjuntoComportado {
	public static void main(String[] args) {
		
		// Set<String> list = new HashSet<String>();
		// ou, só vai permitir valores do tipo String mesmo com o daimond vazio
		
		// HashSet vem desordenado
		Set<String> list = new HashSet<>();

		list.add("Ramon");
		list.add("Samara");
		list.add("Eloísa");
		list.add("Antonio");
		
		
		// for each  //  Nao é possivel acessar pelo indice
		
		for( String candidato: list) {
			// ele nao tem ordem pq ta usando o HashSet, 
			System.out.println(candidato);

		}
		
		System.out.println("----------");

		
		// TreeSet vem ordenado por ordem alfabetica
		SortedSet<String> list2 = new TreeSet<>();

		list2.add("Ramon");
		list2.add("Samara");
		list2.add("Eloísa");
		list2.add("Antonio");
		
		// for each  //  Nao é possivel acessar pelo indice
		
		for( String candidato2: list2) {
			// Vai vir na ordem 
			System.out.println(candidato2);
		}
		
		System.out.println("----------");

		
		// TreeSet vem ordenado 
		SortedSet<Integer> nums = new TreeSet<>();

		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		// for each
		
		for( int numeros: nums) {
			// Vai vir na ordem 
			System.out.println(numeros);
		}
		

	}
}
	
