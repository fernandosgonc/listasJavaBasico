package br.com.loiane.listas.aula68.teste;

import br.com.loiane.listas.aula68.MinhaThreadRunnable;

public class ThreadRunnableTeste {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		MinhaThreadRunnable t1 = new MinhaThreadRunnable("Thread #1", 1000);
		MinhaThreadRunnable t2 = new MinhaThreadRunnable("Thread #2", 300);
		MinhaThreadRunnable t3 = new MinhaThreadRunnable("Thread #3", 1500);
		
	}
}
