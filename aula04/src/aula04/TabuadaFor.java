package aula04;

import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		
		System.out.println("Digite um numero inteiro");
		
		int numero = read.nextInt();
		
		for(int i = 1; i <= 10; i = i++) {
			System.out.printf("\n %d x %d = %d", numero, i, (numero * i));
		}
		
		read.close();
	}

}
