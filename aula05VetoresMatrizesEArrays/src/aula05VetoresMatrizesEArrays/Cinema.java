package aula05VetoresMatrizesEArrays;

public class Cinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] assentos = {
				{1,0,1,1,1,1},
				{1,0,1,1,1,1},
				{1,0,1,1,1,1},
				{1,0,1,1,1,1},
				{1,0,1,1,1,1},
				{1,0,1,1,1,1},
		};
		
		int ocupadas = 0, livres = 0;
		
		for (int[] vetor : assentos) {
			for(int assento : vetor) {
				if (assento == 1) {
					ocupadas++;
				}else {
					livres++;
				}
			}
		}
		
		System.out.println("assentos ocupados:" + ocupadas);
		System.out.println("assentos livres:" + livres);
		
	}

}
