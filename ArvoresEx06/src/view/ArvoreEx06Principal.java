package view;
import br.edu.fateczl.arvore.inteiro.ArvoreInt;

public class ArvoreEx06Principal {

public static void main (String[] args) {
		
		int[] vetor = {12, 16, 4, 2, 8, 6};
		int tamanhovet = vetor.length;
		
		ArvoreInt arvoreint = new ArvoreInt();
		
		for (int i = 0; i < tamanhovet; i ++) {
			arvoreint.insert(vetor[i]);
		}
		
		arvoreint.search(6);
		arvoreint.remove(12);
		
		try {
			System.out.println();
			arvoreint.postfixSearch();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
