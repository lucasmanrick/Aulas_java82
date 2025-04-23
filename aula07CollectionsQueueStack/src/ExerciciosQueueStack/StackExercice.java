package ExerciciosQueueStack;

import java.util.Scanner;
import java.util.Stack;

public class StackExercice {

	public static void main(String[] args) {
		Stack<String> stackFlow = new Stack<String>();
		
		Scanner read = new Scanner(System.in);
		
		int menuChoose;
		
		do {
			System.out.println("\n****************************");
			System.out.println("Seja bem vindo ao menu! \n \n 1 - Adicionar Novo Livro a Pilha \n 2 - Listar todos os Livros \n 3 - Retirar Livro da Pilha \n 0 - Sair do programa ");
			System.out.println("****************************");
			
			menuChoose = read.nextInt();
			
			switch(menuChoose) {
				case 1 : 
					System.out.println("\nDigite o nome do livro:");
					read.skip("[\\n\\r]+");
					stackFlow.push(read.nextLine());
					System.out.println(stackFlow);
					System.out.println("Novo Livro adicionado com sucesso!");
					break;
				case 2 :  
					if(stackFlow.isEmpty()) {
						System.out.println("\nA Pilha está vazia no momento!");
						break;
					}
					System.out.println("Os seguintes livros se encontram na pilha: ");
					for(var livro : stackFlow) {
						System.out.println(livro);
					}
					break;
					
				case 3 :
					if(stackFlow.isEmpty()) {
						System.out.println("\nA Pilha está vazia no momento!");
						break;
					}
					System.out.printf("\n O Livro %s era o ultimo da pilha, portanto foi retirado!",stackFlow.peek() );
					stackFlow.pop();
					break;
				default: System.out.println("\nselecione uma opção valida!");
				break;
			}
			
		}while (menuChoose != 0);
			
		
		read.close();


	}

}
