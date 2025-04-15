package aula03;

import java.util.Scanner;

public class ConversorMoedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		
		System.out.println("***************************************");
		
		System.out.println("           Conversor de moedas         ");
		
		System.out.println("***************************************");
		
		System.out.println("\n1-Converter para Dollar(USD$)");
		System.out.println("2-Converter para Euros (EUR$)");
		System.out.println("3-Converter para Pesos (AR$)\n");
		
		System.out.println("***************************************");
		
		System.out.println("Digite a opção desejada:");
		
		int option = read.nextInt();
		
		System.out.println("Digite o valor em R$ a ser convertido:");
		
		double quantity = read.nextDouble();
		
		double valorConvertido = 0.0;
		String moeda = "";
		
		switch(option) {
			case 1:  
				valorConvertido = quantity / 5.86;
				moeda = "Dollar";
				break;
			case 2:
				valorConvertido = quantity / 6.63;
				moeda = "Dollar";
				break;
			case 3:
				valorConvertido = quantity / 0.0049;
				moeda = "Peso Argentino";
				break;
			default:System.out.println("a opção selecionada é invalida.");
				read.close();
				return;
		}
		System.out.printf("\n a quantidade R$%.2f convertida para %s fica equivalente a: %.2f", quantity,moeda, valorConvertido );
		
		read.close();
		}

	
}


