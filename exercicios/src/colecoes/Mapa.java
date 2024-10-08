package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Ramon");
		usuarios.put(1, "Ramon Rodrigues "); // adiciona em cima do primeiro
		usuarios.put(20, "Samara");
		usuarios.put(3, "Antonio");
		usuarios.put(41, "Eloisa");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Samara"));

		System.out.println(usuarios.get(1));
		//System.out.println(usuarios.remove(2));
		//System.out.println(usuarios.remove(2, "Gui"));

		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}

		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}

		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " - ");
			System.out.println(registro.getValue());

		}
	} 
 
}
