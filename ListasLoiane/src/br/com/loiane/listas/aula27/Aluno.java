package br.com.loiane.listas.aula27;

public class Aluno {

	String nome;
	String matricula;
	String curso;
	String[] disciplinas;
	double[][] notas;

	boolean estaAprovado(int indice) {
		indice--;
		double notaMedia = 0;
		for (int i = 0; i < notas[indice].length; i++) {
			notaMedia += notas[indice][i];
			System.out.println("Nota "+(i+1)+": "+notas[indice][i]);
		}

		notaMedia /= notas.length;
		System.out.println("Média: "+notaMedia);

		if (notaMedia >= 7) {
			return true;
		}
		return false;
	}


	
	
}
