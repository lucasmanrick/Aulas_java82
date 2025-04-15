package aula03Exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		
		int numReceived;
		
		for(int i=0;i > -2; i++) {
			System.out.println("Digite um novo numero para verificar se o mesmo é impar ou par e se ele é positivo ou negativo:");
			numReceived = read.nextInt(); 
			
			String evenOdd;
			
			String positiveNegative;
			
				if(numReceived % 2 == 0) {
					evenOdd = "par";
				}else {
					evenOdd = "impar";
				}
				
				if(numReceived > 0) {
					positiveNegative = "positivo";
				}else {
					positiveNegative = "negativo";
				}
				
				System.out.printf("\nO numero %d é %s  e também é um numero %s!! \n", numReceived, evenOdd, positiveNegative);
			}
		
		read.close();
		}
		
	}



