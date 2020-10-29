package br.com.loiane.listas.aula34;

public class ContadorTeste {

	public static void main(String[] args) {

		Contador c = new Contador();
		Contador c2 = new Contador();
		System.out.println(Contador.getContador());
		Contador.zeraContador();
		System.out.println(Contador.getContador());
		Contador c3 = new Contador();
		System.out.println(Contador.getContador());
		
	}

}
