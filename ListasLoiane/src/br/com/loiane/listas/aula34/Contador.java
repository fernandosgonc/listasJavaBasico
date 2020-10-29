package br.com.loiane.listas.aula34;

public class Contador {

	static private int contador = 0;
	
	public Contador(){
		Contador.contador++;
	}
	
	public static int getContador(){
		return Contador.contador;
	}
	
	public static void zeraContador(){
		Contador.contador = 0;
	}
	
	
	
}
