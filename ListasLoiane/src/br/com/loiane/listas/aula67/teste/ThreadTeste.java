package br.com.loiane.listas.aula67.teste;

import br.com.loiane.listas.aula67.MinhaThread;

public class ThreadTeste {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		MinhaThread thr1 = new MinhaThread("Thread #1", 1000);
		MinhaThread thr2 = new MinhaThread("Thread #2", 500);
		
	}
}
