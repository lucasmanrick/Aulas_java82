 
package aula02Exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		

		float salario;
		float abono;
		float novoSalario;
		
		System.out.println("Ol�, seja bem vindo ao sistema gerenciador de saldo: Digite o salario desejado: ");
		
		
		salario = read.nextFloat();
		
		System.out.printf("O sal�rio digitado foi: %.2f", salario);
		System.out.println("\nDigite o Abono: ");
		
		abono = read.nextFloat();
		
		System.out.printf("\nAbono de: %.2f", abono);
		
		novoSalario = salario + abono;
		
		System.out.printf("\nnovo salario = %.2f", novoSalario);
	}

}
