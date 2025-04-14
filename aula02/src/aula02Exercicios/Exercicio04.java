package aula02Exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numero1,numero2,numero3,numero4;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o numero 1:");
		numero1 = read.nextFloat();
		
		System.out.println("Digite o numero 2:");
		numero2 = read.nextFloat();
		
		System.out.println("Digite o numero 3:");
		numero3 = read.nextFloat();
		
		System.out.println("Digite o numero 4:");
		numero4 = read.nextFloat();
		
		
		System.out.printf("diferença: %.2f" , (numero1*numero2)-(numero3*numero4));
	}

}
