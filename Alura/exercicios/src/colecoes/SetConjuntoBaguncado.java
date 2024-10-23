package colecoes;

import java.util.HashSet;
import java.util.Set;

public class SetConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		// como nao aceita tipos primitivos ele vai converter para classes
		conjunto.add(1.2);       // converte o double => classe Double
		conjunto.add(true);      // boolean => Boolean
		conjunto.add("teste");   // String
		conjunto.add(1);         // int => Interger
		conjunto.add('x');       // char => Charactere
		
		
		// Saber o Tamanho, nao é o length e sim o size
		System.out.println("Tamanho é " + conjunto.size());
		
		// nao aceita repeticao, entao vaic ontinuar tamanho 5
		conjunto.add("teste");
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("Tamanho é " + conjunto.size());
		
		
		// contains ver se tem o valor na coletion
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// Fazendo a Uniao entre 2 conjuntos
		//conjunto.addAll(nums);
		//System.out.println(conjunto);
		
		// Fazendo a intercessao, pegar apenas os elementes que tem nos 2 conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);



	}

}
