package aula05VetoresMatrizesEArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Vetores {

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//vetores com numeros inteiros iniciado com valores
		int vetorInteiros[] = {10, 15, 35, 70, 140, 280, 320, 480};
		
//		vetor com objetos float, tamanho 5.
		Float vetorReal[] = new Float[5];   // Float com F maiusculo, para trabalhar float como objeto
		
		float soma = 0;
		
		
		String vetorStrings[] = {"Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi"};
		
		
//		for tradicional para exibir dados do vetor inteiros
		for(int indice = 0; indice < vetorInteiros.length; indice++)
		{
		System.out.printf("vetorInteiros[%d]: %d\n", indice, vetorInteiros[indice]);
		}
		
//		for tradiciona para preencher o vetor no vetor Real
		for(int indice = 0; indice < vetorReal.length; indice++)
		{
			System.out.println("\nDigite um número Real: ");
			vetorReal[indice] = leia.nextFloat();
		}
		
		// for each 
		for(var valor : vetorReal) {  	// var coloca a tipagem da variavel conforme a tipagem original do vetor
			//System.out.println("Elemento atual: " + valor);
			soma += valor;
		}
		
//		exibindo soma
		System.out.println("\nResultado da soma\n" + soma);
		System.out.println("-------------------Organizando o vetor real em ordem crescente----------------------");
//		ordenando o vetor em ordem crescente.
		Arrays.sort(vetorReal);
		
//		exibindo o vetor real com os dados em ordem crescente
		for(var valor : vetorReal) {  	//var coloca a variavel conforme o vetor
			System.out.println("Elemento atual: " + valor);
		}
		
		System.out.println("-------------------Organizando o vetor real em ordem decrescente----------------------");
		
//		ordenando o vetor em ordem decrescente. lembrando que previamente ele deve estar ordenado em ordem crescente.
		Arrays.sort(vetorReal, Collections.reverseOrder());
		
		for(var valor : vetorReal) {  	//demonstrando vetor Real em ordem decrescente
			System.out.println("Elemento atual: " + valor);
		}
		
		
		
		
		Arrays.sort(vetorStrings); // organiza em ordem alfabetica.
		
		
		for(var raca : vetorStrings) {  	//demonstrando vetor Real em ordem decrescente
			System.out.println("Cachorro atual: " + raca);
		}
		
		leia.close();
	}
}

