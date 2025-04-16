package aula04Exercicios;

import java.util.Scanner;

public class EXFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner (System.in);
		
		int menuChoose;
		
		do {
			int odd = 0;
			int even = 0;
			
			for(int i=0; i < 10; i++) {
				System.out.printf("\nDigite o %dº numero inteiro:\n",i+1);
				int currentNum = read.nextInt();
				if( currentNum % 2 == 0) {
					System.out.printf("\nO numero %d é par ",currentNum);
					even++;
				}else {
					System.out.printf("\nO numero %d é impar",currentNum);
					odd++;
				}
			}
			
			System.out.printf("\n \n Dos numeros inseridos %d são PARES  e %d são IMPARES \n \n Selecione uma das opções abaixo: \n 1.Fazer novamente \n 2.Sair \n ", even,odd);
			menuChoose = read.nextInt();
			
			while (menuChoose != 1  && menuChoose !=2) {
				System.out.println("Opção invalida, insira uma opção entre 1 e 2");
				System.out.println("Selecione uma das opções abaixo: \n 1.Fazer novamente \n 2.Sair \n");
				menuChoose = read.nextInt();
			}
			
		}while (menuChoose != 2);
		
		
		
		System.out.println("Fim do programa.");
		
		read.close();
	}

}
