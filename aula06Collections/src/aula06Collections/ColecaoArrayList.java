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
		numeros.add(leia.nextDouble()); // adicionamos um numero a cole��o
		
		//iterando sobre a cole��o e mostrando todos numeros existentes.
		for (var numero : numeros) {
			System.out.println(numero);
		}
		
		
		System.out.println("o numero 3 EXISTE NA LISTA? " + numeros.contains(3.0)); // verifica se existe o numero 3 na cole��o.
		System.out.println("o numero 3 est� na posi��o: " + numeros.indexOf(3.0)); // verifica a posi��o do numero 3 na cole��o..
		System.out.println("a posi��o 2 (indice 2) contem o numero:  " + numeros.get(2)); // verifica o numero que est� na posi��o 2 da cole��o.
		
		numeros.set (2,10.0); // posi��o 2 agora passa a valer 10 e o antigo numero que estava na posi��o 2 some.
		
		
		System.out.println("exibe os dados ap�s a atualiza��o:");
		numeros.forEach(System.out::println); // basicamente passamos que para cada item da cole��o fa�a o sysout em cada elemento para mostrar na tela,  o :: serve como um referenciador, por exemplo, usa o print ln :: "que pertence" ao sys.out.
		
		
//		numeros.remove(6.0); // podemos excluir tanto pelo valor quanto pelo indice. (esse exemplo excluimos pelo valor)
		numeros.remove(2); // excluindo pela posi��o 2 (indice);
		
		System.out.println("exibe os dados ap�s a remo��o do numero 2.0");
		
		numeros.forEach(System.out::println);
		
		System.out.println("tamanho atual da lista: "+ numeros.size()); // serve para ver o tamanho da cole��o atual (.length).
		
		System.out.println("A cole��o est� vazia? " + numeros.isEmpty()); //retorna true ou false caso esteja vazia ou n�o.
		
		System.out.println("Ordenando os dados em ordem crescente, ou alfabetido");
		numeros.sort(null); //ordena a cole��o.
		numeros.forEach(System.out::println);
		
		leia.close();
	}

}
