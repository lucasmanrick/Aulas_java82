package aula03Exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum,secondNum,thirdNumValidate;
		int menuChoose;
		String maiorMenor;
		
		Scanner read = new Scanner (System.in);
		
		
		do {
			 System.out.println("Seja bem vindo ao Menu");
			 System.out.println("Escolha uma opção");
			 System.out.println("1.Fazer nova comparação");
			 System.out.println("2.Encerrar programa");
			 
			 menuChoose = read.nextInt();
			 
			 if(menuChoose == 1) {
				 System.out.println("Digite o primeiro numero da Soma:");
				 firstNum = read.nextInt();
				 System.out.println("Digite o segundo numero da Soma:");
				 secondNum = read.nextInt();
				 System.out.println("Digite o numero a ser comparado com o resultado da soma:");
				 thirdNumValidate = read.nextInt();
				 
				 if(firstNum + secondNum > thirdNumValidate) {
					 maiorMenor = "maior";
				 }else {
					 maiorMenor = "menor";
				 }
				 
				 System.out.printf("\n %d + %d é igual a %d, e %d é %s que %d\n", firstNum, secondNum, (firstNum + secondNum), (firstNum + secondNum), maiorMenor, thirdNumValidate);
				 
			 }
			
		}
		while(menuChoose != 2);
		
		System.out.println("fim do programa");
		read.close();
	}

}
