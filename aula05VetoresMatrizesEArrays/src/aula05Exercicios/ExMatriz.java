package aula05Exercicios;

import java.util.Scanner;

public class ExMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int menuChoose;
		do {
			int matrizReceive[][] = new int[3][3];
			String diagonalD = "";
			String diagonalE = "";
			int countDown = 2;
			menuChoose = 0;
			
			for (int i = 0; i < 3 ; i ++) {   //itera sobre as linhas da matriz
				for(int j = 0; j < 3; j ++) {  //itera sobre as colunas da matriz
					System.out.printf("\n estamos na linha %d digite o numero que ficará na coluna %d \n", i + 1 , j + 1);
					matrizReceive[i][j] = leia.nextInt();
					
					if(i == j) { //se a linha e a coluna forem o mesmo numero (diagonal normal) 
						diagonalD += Integer.toString(matrizReceive[i][j]);
					}
				}
				
				diagonalE += Integer.toString(matrizReceive[i][countDown]); // pega a diagonal de modo inverso, enquanto a linha sobe de numero o contador desce
				countDown -= 1;
			}
			
			System.out.println("Diagonal Principal: " + diagonalD);
			System.out.println("Diagonal Secundaria: " + diagonalE);
			
			int sumD = 0;
			int sumE = 0;
			
			
			for (int y = 0 ; y < 3; y++) {
				 sumD += Character.getNumericValue(diagonalD.charAt(y));
				 sumE += Character.getNumericValue(diagonalE.charAt(y));
			}
			
			System.out.println("Soma da Diagonal principal: " + sumD);
			System.out.println("Soma da Diagonal secundaria: " + sumE);
			
			System.out.println("\n \n Digite qualquer NUMERO ACIMA DE 0 para continuar.  \n \n Digite o NUMERO 0 para sair \n");
			menuChoose = leia.nextInt();
		}while (menuChoose != 0); 
		
		
		leia.close();
		
	}

}
