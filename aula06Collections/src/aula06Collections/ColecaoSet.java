package aula06Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> frutas = new HashSet<String>();
		Scanner leia = new Scanner(System.in);
		
		frutas.add("Maça");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Maça"); //não vai repetir a maçã, pois ela ja foi inserida.
		
		
//		System.out.println(frutas);
//		frutas.forEach(System.out::println);
	
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		
		
		System.out.println("Morango existe na minha coleção? " + frutas.contains("Morango"));  
		
		frutas.remove("Morango");
		
		
		System.out.println("\n \ncriando um iterador obs: o iterador pega os dados que tinha na coleção frutas até o atual momento, ou seja uma branch.");
		
		//criando um iterator
		
		Iterator<String> iFrutas = frutas.iterator();
		
		while (iFrutas.hasNext()) {
			System.out.println(iFrutas.next());
		};
		
		System.out.println("TRANSFORMANDO O SET EM UM ARRAYLIST, PARA ORDENAR POR ORDEM ALFABETICA");
		
		ArrayList<String> frutasList = new ArrayList<String>();  //criamos o array list (que possui indices);
		frutasList.addAll(frutas); //colocamos a coleção SET que NÃO possui indices e passamos os dados para dentro da arraylist QUE POSSUI os indices, ou seja, demos indices/posições aos elementos set.
		frutasList.sort(null); // ordenado em ordem alfabetica.
		
		System.out.println("dados do array organizado: \n");
		frutasList.forEach(System.out::println);
		
		leia.close();
	}

}
