package aula03Exercicios;

import java.util.Scanner;

public class ExSwitch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigoProduto,quantidade,valorUnitario;
		
		Scanner read = new Scanner (System.in);
		
		String choosed;
		
		do {
			System.out.println("\nSeja muito bem vindo ao gerenciador de compras \n Selecione uma das opções do menu: \n \n 0.Sair do menu \n 1.Cachorro Quente \n 2.X-Salada \n 3.X-Bacon \n 4.Bauru \n 5.Refrigerante \n 6.Suco de laranja");
			
			codigoProduto = read.nextInt();
			
			
			switch (codigoProduto) {
				case 0: 
					System.out.println("Saindo do sistema!");
					read.close();
					return
					;
				case 1: 
					choosed = "Cachorro Quente";
					valorUnitario = 10;
					System.out.printf("\nSelecione a quantidade de %s comprada:", choosed);
					quantidade = read.nextInt();
					break ;
				case 2: 
					choosed = "X-Salada";
					valorUnitario = 15;
					System.out.printf("\nSelecione a quantidade de %s comprada:", choosed);
					quantidade = read.nextInt();
					break;
				case 3: 
					valorUnitario = 15;
					choosed = "X-Bacon";
					System.out.printf("\nSelecione a quantidade de %s comprada:", choosed);
					quantidade = read.nextInt();
					break;
				case 4: 
					choosed = "Bauru";
					valorUnitario = 12;
					System.out.printf("\nSelecione a quantidade de %s comprada:", choosed);
					quantidade = read.nextInt();
					break;
				case 5: 
					choosed = "Refrigerante";
					valorUnitario = 8;
					System.out.printf("\nSelecione a quantidade de %s comprada:", choosed);
					quantidade = read.nextInt();
					break;
				case 6: 
					choosed = "Suco de laranja";
					valorUnitario = 13;
					System.out.printf("\nSelecione a quantidade de %s comprada:", choosed);
					quantidade = read.nextInt();
					break;
				default:
					System.out.println("Escolha uma opção valida!");
					read.close();
					return;
			}
			
			
			System.out.printf("\n O total de %s comprados ficou: %d \n",choosed , valorUnitario * quantidade, "\n" );
			System.out.println("\nSeja muito bem vindo ao gerenciador de compras \n Selecione uma das opções do menu: \n \n 0.Sair do menu \n 1.Cachorro Quente \n 2.X-Salada \n 3.X-Bacon \n 4.Bauru \n 5.Refrigerante \n 6.Suco de laranja");
			
			codigoProduto = read.nextInt();
			
			
		} while (codigoProduto != 0);
		
		System.out.println("Saindo do sistema!");
		
		read.close();
	}

}
