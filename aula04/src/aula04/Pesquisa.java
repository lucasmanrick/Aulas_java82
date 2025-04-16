package aula04;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		
		int idade,esporte, futebol=0,voleibolM18 = 0, basqueteMN18=0, outros=0, totalResp=0;
		float totalAge = 0;
		
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			System.out.println("\n Digite a sua idade:");
			idade=read.nextInt();
			
			System.out.println("Digite o seu esporte favorito: \n \n 1.Futebol \n 2.Voleibol \n 3.Basquete \n 4.Outros");
			esporte=read.nextInt();
			
			if (esporte == 1) {
				futebol++;
			}else if (esporte == 2 && idade >= 18) {
				voleibolM18 ++;
			}else if (esporte == 3 && idade < 18) {
				basqueteMN18++;
			}else if(esporte == 4 ){
				outros++;
			}
			
			totalResp++;
			totalAge += idade;
			
			System.out.println("Deseja preencher as preferencias de outro usuario?\n (S/N)");
			read.skip("\\R");  //esse comando ignora o carro, ou seja se fizermos sem ele o nextline vai ler o camndo \r. ai se acrescentarmos o skip ele ignora o comando que volta para o começo da linha.
			continua = read.next().toUpperCase();
			
		}
		
		System.out.printf("\n Resultado:\n PESSOAS QUE PREFEREM FUTEBOL: %d \n PESSOAS QUE PREFEREM VOLEIBOL E SÃO MAIORES DE IDADE: %d \n PESSOAS QUE PREFEREM BASQUETE E QUE SÃO MENORES DE IDADE: %d \n OUTROS: %d  \nMédia de idade da pesquisa: %.2f", futebol,voleibolM18,basqueteMN18,outros, totalAge / totalResp);
		read.close();
	}

}
