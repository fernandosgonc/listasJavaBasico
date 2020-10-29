package br.com.loiane.listas.aula35;

public class Fibonacci {

	public static int retornaTermoN(int n){
		
		
		int a0 = 0;
		int a1 = 1;
		
		int enesimo = 0;
		for(int i = 2; i<n; i++){
			enesimo = a0+a1;
			a0 = a1;
			a1 = enesimo;
		}
		
		return enesimo;
	}

public static void main(String[] args) {
	System.out.println(retornaTermoN(12));
}
}

