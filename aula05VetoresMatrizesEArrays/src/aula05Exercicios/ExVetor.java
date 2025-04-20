package aula05Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ExVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int listNums[] = new int [10], numForFind;
		
		
		
		for(int i = 0; i < 10; i ++) {
			boolean numExist;
			int numInserted;
			do {
					numExist = false;
					System.out.println("Digite o numero que ficará na posição: " + i + " da lista: " );
					numInserted = leia.nextInt();
					for(int compare = 0; compare < listNums.length; compare++) {
						if (i == compare) {continue;}
						if(numInserted == listNums[compare]) {
							numExist = true;
								
						}
					}
					
			}while (numExist == true);
				listNums[i] = numInserted;
			}
		
		System.out.println("A lista foi totalmente preenchida");
		
		int existOrNot;
		
		do {
			existOrNot = 0 ;
			System.out.println("\ndigite um numero da lista que você queira saber a posição do mesmo:");
			numForFind = leia.nextInt();
			
			existOrNot = Arrays.binarySearch(listNums, numForFind);
			if (existOrNot >= 0) {
				System.out.printf("\n O numero %d está na posição %d da lista", numForFind, existOrNot);
			}else {
				System.out.println("Não foi possivel encontrar o numero especificado, tente novamente!");
			}
			 
		}while(existOrNot >= 0);
		
		
		
		
		leia.close();
	}

}
