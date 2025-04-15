package aula03Exercicios;

import java.util.Scanner;

public class ExSwitch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		
		int num1,num2;
		int menuChoose;
		int whileCondition = 1;
		
		do {
			System.out.println("\nDigite o primeiro numero para ser calculado:");
			num1 = read.nextInt();
			System.out.println("Escolha uma das operações abaixo: \n 1.Somar \n 2.Subtrair \n 3.Multiplicar \n 4.Dividir");
			menuChoose = read.nextInt();
			System.out.println("Digite o segundo numero para ser calculado:");
			num2 = read.nextInt();
			
			
			
			switch(menuChoose) {
			case 1: 
				System.out.printf("\n %d + %d = %d", num1, num2, num1 + num2);
				break;
			case 2: 
				System.out.printf("\n %d - %d = %d", num1, num2, num1 - num2);
				break;
			case 3: 
				System.out.printf("\n %d * %d = %d", num1, num2, num1 * num2);
				break;
			case 4: 
				System.out.printf("\n %d / %d = %d", num1, num2, num1 / num2);
				break;
				default: System.out.println("opção invalida");
				read.close();
				return;
			}
			
		} 
		while (whileCondition != 0 );
	}

}
