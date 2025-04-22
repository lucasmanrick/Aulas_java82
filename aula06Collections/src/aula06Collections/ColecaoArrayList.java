package aula06Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ColecaoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Double> numeros = new ArrayList<Double>();
		
		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(9.0);
		numeros.add(6.0);
		numeros.add(2.0);
		
		System.out.println("Digite um numero Real: ");
		numeros.add(leia.nextDouble()); // adicionamos um numero a coleção
		
		//iterando sobre a coleção e mostrando todos numeros existentes.
		for (var numero : numeros) {
			System.out.println(numero);
		}
		
		
		System.out.println("o numero 3 EXISTE NA LISTA? " + numeros.contains(3.0)); // verifica se existe o numero 3 na coleção.
		System.out.println("o numero 3 está na posição: " + numeros.indexOf(3.0)); // verifica a posição do numero 3 na coleção..
		System.out.println("a posição 2 (indice 2) contem o numero:  " + numeros.get(2)); // verifica o numero que está na posição 2 da coleção.
		
		numeros.set (2,10.0); // posição 2 agora passa a valer 10 e o antigo numero que estava na posição 2 some.
		
		
		System.out.println("exibe os dados após a atualização:");
		numeros.forEach(System.out::println); // basicamente passamos que para cada item da coleção faça o sysout em cada elemento para mostrar na tela,  o :: serve como um referenciador, por exemplo, usa o print ln :: "que pertence" ao sys.out.
		
		
//		numeros.remove(6.0); // podemos excluir tanto pelo valor quanto pelo indice. (esse exemplo excluimos pelo valor)
		numeros.remove(2); // excluindo pela posição 2 (indice);
		
		System.out.println("exibe os dados após a remoção do numero 2.0");
		
		numeros.forEach(System.out::println);
		
		System.out.println("tamanho atual da lista: "+ numeros.size()); // serve para ver o tamanho da coleção atual (.length).
		
		System.out.println("A coleção está vazia? " + numeros.isEmpty()); //retorna true ou false caso esteja vazia ou não.
		
		System.out.println("Ordenando os dados em ordem crescente, ou alfabetido");
		numeros.sort(null); //ordena a coleção.
		numeros.forEach(System.out::println);
		
		leia.close();
	}

}
