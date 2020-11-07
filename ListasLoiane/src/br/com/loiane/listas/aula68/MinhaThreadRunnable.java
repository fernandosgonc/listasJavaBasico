package br.com.loiane.listas.aula68;

public class MinhaThreadRunnable implements Runnable{

	private String nome;
	private int tempo;

	public MinhaThreadRunnable(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {

		for (int i = 0; i < 6; i++) {
			System.out.println(this.nome + " contador " + i);
			System.out.println();
			try {
				Thread.sleep(this.tempo);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}

		}
		System.out.println(this.nome + " terminou");
	}

	
}
