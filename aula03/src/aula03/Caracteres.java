package aula03;

public class Caracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//MOSTRANDO ALGUNS METODOS DE STRINGS.
		
		String frase_01 = "Turma Java 82";
		String frase_02 = "TURMA JAVA 82";
		
		System.out.println(frase_01 == frase_02); //retorna false, pois difere um do outro com letras maiusculas e minusculas.
		
		
		System.out.println(frase_01.equals(frase_02)); //equals assim como o == leva em considera��o letras maiusculas e minusculas na compara��o.
		
		
		System.out.println(frase_01.equalsIgnoreCase(frase_02)); // j� este metodo de string n�o leva em considera��o letras maiusculas e minusculas, apenas valida se � a mesma letra.
		
		System.out.println(frase_01.compareTo(frase_02)); // apareceu o resultado 32, pois esse metodo retorna 0 se for igual e 
		
	}

}
