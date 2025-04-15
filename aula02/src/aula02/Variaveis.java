package aula02;
import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		// Definição das variáveis
		System.out.println("Digite o primeiro numero inteiro:");
		int numero_01 = leia.nextInt();
		System.out.println("Digite o segundo numero inteiro:");
		int numero_02 = leia.nextInt();
		
		String nome = "Lucas";
		
		nome.length();
		
		// Exibição em tela
	
		System.out.printf("Váriavel numero 1 é igual a: %d \n", numero_01);  //o printF serve como um template string, que substitui o %d pelo valor da variavel numero_01.
		System.out.println("Váriavel numero 2 é igual a: " + numero_02);
		System.out.println("a soma da variavel 1 e 2 é: \n" + (numero_01 + numero_02));
		
		
		// Definição da constante PI
		final float PI = 3.1415f;  
		
		// Exibição em tela
		
		System.out.printf("Constante PI é igual a: %.2f\n", PI); // %.2f serve para determinar que queremos 2 casas depois do ponto (essa forma serve especificamente para mostrar variaveis do tipo double/float.
		leia.close();
	}

}
