package aula02Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		String colaborador;
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		int quantidadeHExtras;
		float descontos;
		
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o nome do Colaborador:");
		colaborador = read.next();
	
		
		System.out.println("Digite o Salario Bruto do colaborador:");
		salarioBruto = read.nextFloat();
		
		
		System.out.println("Digite a quantia em dinheiro referente ao adicional Noturno do colaborador:");
		adicionalNoturno = read.nextFloat();
		
		System.out.println("Digite a quantia em dinheiro referente a cada Hora Extra:");
		horasExtras = read.nextFloat();
		
		System.out.printf("\nDigite quantas horas extras o colaborador %s fez: ", colaborador);
		quantidadeHExtras = read.nextInt();
		
		System.out.println("Digite os descontos referente ao salario do colaborador:");
		descontos = read.nextFloat();
		
		System.out.printf("\nO salário liquido do funcionario '%s' é equivalente a : %.2f ", colaborador, (salarioBruto + adicionalNoturno + (horasExtras * quantidadeHExtras) - descontos));
		
	}

}
