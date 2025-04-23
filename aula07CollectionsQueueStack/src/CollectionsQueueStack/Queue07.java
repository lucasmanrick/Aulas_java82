package CollectionsQueueStack;

import java.util.LinkedList;
import java.util.Queue;

public class Queue07 {

	public static void main(String[] args) {
	
		Queue<String> queue = new LinkedList<String>(); //Criação da estrutura de dados Fila.
	
		queue.add("Carlos");
		queue.add("Giovana");
		queue.add("Livia");
		queue.add("Maria");
		queue.add("Samuel");
		queue.add("Fabricio");
		queue.add("Victor");
		
		
		System.out.println(queue);
		
		queue.remove();
		
		System.out.println(queue);
	
		queue.add("Thiago");
		
		System.out.println(queue.peek()); // o peek ele SÓ MOSTRA o primeiro elemento da fila (HEAD), ou seja o proximo item a sair da fila.
		
		System.out.println(queue.poll()); // o pool ao contrario do peek ele tambem mostra o primeiro da fila, POREM ELE JA REMOVE DA FILA O PRIMEIRO ITEM DA FILA.
		
		System.out.println(queue); //já nao mostra a giovana pois ela foi removida.
		
		
		int contador = 0;
		for (var pessoa : queue) {
			contador++;
			if (pessoa.equalsIgnoreCase("Samuel")) {
				System.out.println(pessoa + " está na posição: " + contador);
			}
		}
		
	}

}
