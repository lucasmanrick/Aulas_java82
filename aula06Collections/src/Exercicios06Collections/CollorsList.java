package Exercicios06Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class CollorsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> coresStorage = new ArrayList<String>();
		
		Scanner read = new Scanner(System.in);
		int menuChoose;
		
		do {
			
		for(int i=0; i < 5; i++) {
			System.out.printf("\n Digite uma cor para adicionar na lista: ");
			coresStorage.add(read.next());
		}
		
		System.out.println("Listando as cores inseridas na lista: ");
		coresStorage.forEach(System.out::println);
		
		
		System.out.println("Listando as cores Ordenadas em ordem alfabetica: ");
		
		coresStorage.sort(null); 
		
		coresStorage.forEach(System.out::println);
		
		
		System.out.println("Escolha uma opção: \n sair do sistema (numero 0) \n Utilizar sistema novamente (Qualquer numero) ");
		menuChoose = read.nextInt();
		
		switch (menuChoose){
		case 0:
			 System.out.println("Saindo do sistema!");
			 break;
		 default:
			 System.out.println("Reiniciando o sistema");
		}
		}while(menuChoose != 0);
		
		read.close();
	}

}
