package aula04Exercicios;

import java.util.Scanner;

public class EXWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		
		
			int lessThen21 = 0;
			int moreThen50 = 0;
			int totalAssign = 0;
			float currentNum = 0;
			int menuChoose;
			
			
			do {
			
			while (currentNum >= 0) {
				System.out.println("\nDigite a idade da pessoa:");
				currentNum = read.nextFloat();
				
					if(currentNum < 21 && currentNum >= 0) {
						lessThen21++;
					}
					if (currentNum > 50) {
						moreThen50++;
					}
				
					totalAssign++;
			}
			
			System.out.printf("\n quantidade total de preenchimento foi de %d pessoas, destes %d são MENORES de 21 anos e %d são MAIORES de 50 anos", totalAssign, lessThen21,moreThen50);
			System.out.println("\nSelecione uma opção do menu: \n \n 1.Fazer o prenchimento novamente \n \n 2.Sair do Programa.");
			menuChoose = read.nextInt();
			currentNum = 0;
			totalAssign = 0;
			lessThen21 = 0;
			moreThen50 = 0;
			
		}while (menuChoose != 2);
		
		System.out.println("Fim do programa.");
		
		read.close();
	}

}
