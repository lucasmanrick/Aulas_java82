package aula04Exercicios;

import java.util.Scanner;

public class EXDoWhile {
	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		int currentNum, menuChoose,totalStorage = 0;
		do {
		
			do {
				
				System.out.println("Digite um numero:");
				currentNum = read.nextInt();
				
				
				if(currentNum > 0) {
					totalStorage += currentNum;
				}
				
			}while (currentNum != 0);
				System.out.printf("\nA soma dos numeros positivos é igual a : %d", totalStorage);
				System.out.println("\nDeseja fazer a soma de numeros positivos novamente? \n 1. Sim  \n 2. Não. \n");
				menuChoose = read.nextInt();
				currentNum = 1;
				totalStorage = 0;
		}while (menuChoose != 2);
		
		System.out.println("Fim da aplicação");
		read.close();
		
	}
}
