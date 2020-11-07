package br.com.loiane.listas.aula67;

public class MinhaThread extends Thread {

	private String nome;
	private int tempo;

	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}

	@Override
	public void run() {

		for (int i = 0; i < 6; i++) {
			System.out.println(this.nome + " contador " + i);

			try {
				sleep(this.tempo);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}

		}
		System.out.println(this.nome + " terminou");
	}

}
