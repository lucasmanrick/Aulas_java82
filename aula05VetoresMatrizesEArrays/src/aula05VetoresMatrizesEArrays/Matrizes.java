package aula05VetoresMatrizesEArrays;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrizInteiros[][] =  {{10,15,35},{70,120,140}, {50,100,150}};
		
		int matrizIrregular[][] =  {{10,15},{70,120}, {50,100}};
		Float matrizReal[][] = new Float[3][3];
		Scanner leia = new Scanner(System.in);
		
		for (int linha = 0; linha < matrizInteiros.length; linha ++) {
			for (int coluna = 0; coluna < matrizInteiros[linha].length; coluna ++) {
				System.out.printf("\n matriz de inteiros[%d][%d]: %d", linha,coluna, matrizInteiros[linha][coluna]);
			}
		}
		
		for (int linha = 0; linha < matrizReal.length; linha ++) {
			for (int coluna = 0; coluna < matrizReal[linha].length; coluna ++) {
				
				 matrizReal[linha][coluna] = leia.nextFloat();
			}
		}
		
		for(Float[] vetor: matrizReal) {
			for (var valor : vetor) {
				System.out.println("O elemento atual é :" + valor);
			}
		}
		
//		outro teste de matriz irregular:
		
		for (int linha = 0; linha < matrizIrregular.length; linha ++) {
			for (int coluna = 0; coluna < matrizIrregular[linha].length; coluna ++) {
				System.out.printf("\n matriz de inteiros[%d][%d]: %d", linha,coluna, matrizInteiros[linha][coluna]);
			}
		}
		
		leia.close();
	}

}
