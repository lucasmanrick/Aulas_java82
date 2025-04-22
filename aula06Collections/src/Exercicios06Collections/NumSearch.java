package Exercicios06Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		Set<Integer> listNums = new HashSet<Integer>();
		int numForFind, menuChoose = 1;
		
		for(int i = 0; i < 10; i ++) {
			System.out.printf("\nDigite o numero da posição %d da lista: ", i);
			listNums.add(read.nextInt());
		}
		
		
		
		while(menuChoose != 0) {
			System.out.println("Digite um numero para verificar se o mesmo existe na lista e sua posição: ");
			numForFind = read.nextInt();
			
			
			if (listNums.contains(numForFind)) {
				System.out.printf("\n O numero %d foi encontrado na lista", numForFind);
				
				ArrayList<Integer> parseToArray = new ArrayList<Integer>();
				parseToArray.addAll(listNums);
				
				System.out.printf("\n O numero %d está na posição: %d \n", numForFind, parseToArray.indexOf(numForFind));
				
				System.out.println("Escolha uma opção: \n Sair do programa (envie o numero 0) \n Procurar por outro numero (envie um numero entre 1-9)");
				menuChoose = read.nextInt();
			}else {
				menuChoose = read.nextInt();
				System.out.printf("\n o numero %d não foi encontrado na lista", numForFind);
			}
		}
		
		
		
		
		read.close();
	}

}
