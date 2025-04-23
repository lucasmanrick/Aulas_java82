package CollectionsQueueStack;

import java.util.Stack;

public class StackPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.add("Comunicação não violenta");
		stack.add("Jogos Vorazes");
		stack.add("Quem pensa enriquece");
		stack.add("A coragem de ser imperfeito");
		stack.add("Diario de um banana");
		stack.add("Senhor dos aneis");
		stack.add("Codigo da Vinci");
	
		stack.pop(); // retira o ultimo elemento da lista
		
		System.out.println(stack);
		
		stack.push("Roube como um artista"); //envia um elemento para o final da fila.
		
		System.out.println(stack);
		
		System.out.println(stack.peek()); // mostra o ultimo elemento da lista
		
		
	
	}

}
