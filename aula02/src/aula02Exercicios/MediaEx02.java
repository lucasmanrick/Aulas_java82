package aula02Exercicios;

import java.util.Scanner;

public class MediaEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner read = new Scanner(System.in);
		
		
		float num1,num2,num3,num4;
		
		System.out.println("Digite a Nota 1");
		num1 = read.nextFloat();
		
		System.out.println("Digite a Nota 2");
		num2 = read.nextFloat();

		System.out.println("Digite a Nota 3");
		num3 = read.nextFloat();
		
		System.out.println("Digite a Nota 4");
		num4 = read.nextFloat();
		
		System.out.printf("\nSua média de notas é: %.1f", (num1+num2+num3+num4)/4);
	}

}
