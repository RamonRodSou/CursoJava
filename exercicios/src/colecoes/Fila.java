package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Os 2 adicionam
		// Diferença é o comportamento quando a fila esta cheia
		fila.add("Ramon"); // retorna false
		fila.offer("Samara"); // Lanca uma excecao
		fila.add("Antonio");
		fila.offer("Eloisa");
		
		// comportamento quando nao tem nada na fila, fila vazia 
		// Peek e Element -> obtem o proximo elemento da fila sem remover
		// System.out.println(fila.peek()); // retorna Null
		// System.out.println(fila.element()) ;  // Lanca uma excecao
		
		
		// fila.size();     tamanho da fila
		// fila.clear();    limpa fila
		// fila.isEmpty();  saber se a fila esta vazia
		// fila.contain();	saber se existe esse elemento
		
		// Retorna o proxima da fila e remove
		System.out.println(fila.poll());// retorna false
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); 
		System.out.println(fila.remove()); // Lanca uma excecao


	}
}
