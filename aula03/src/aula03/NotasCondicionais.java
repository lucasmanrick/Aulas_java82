package aula03;

import java.util.Scanner;

public class NotasCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		
		System.out.println("Digite a nota do aluno:");
		float nota = read.nextFloat();
		
		if(nota >= 7) {
			System.out.println("Aluno aprovado!");
		
		}else if (nota >=5 && nota < 7) {
			
		}
		else {
			System.out.println("Aluno reprovado!");
		}
		
		
		
		read.close();
	}

}
