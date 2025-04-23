package ExerciciosQueueStack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExercice {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
			
		int menuChoose;
		
		Queue<String> queuebank = new LinkedList<String>();
		
		do {
			System.out.println("\n**************MENU**************");
			System.out.println(" 1 - Adicionar Clientes a Fila \n 2 - Listar todos os Clientes \n 3 - Retirar Cliente da Fila \n 0 - Sair do programa ");
			System.out.println("*********************************");
			
			menuChoose = read.nextInt();
			
			switch(menuChoose) {
				case 0: 
					System.out.println("Saindo do sistema!");
					break;
				case 1 : 
					System.out.println("Digite o nome do cliente: ");
					read.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
					queuebank.add(read.nextLine());
					System.out.println("Cliente adicionado com sucesso!");
					break;
				case 2 :  
					if (queuebank.isEmpty()) {
						System.out.println("a fila está vazia");
						break;
					}
					System.out.println("os seguintes clientes estão na fila de espera: ");
					queuebank.forEach(System.out::println);
					break;
				case 3 :
					if (queuebank.isEmpty()) {
						System.out.println("A fila está vazia!");
						break;
					}
					
					System.out.printf("\n o cliente %s era o primeiro da fila e foi retirado: ", queuebank.poll());
					break;
				default: System.out.println("opção invalida, por favor selecione uma opção do menu!");
				break;
			}
			
		}while (menuChoose != 0);
			
		
		read.close();

	}

}
