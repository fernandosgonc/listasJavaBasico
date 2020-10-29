package br.com.loiane.listas.aula35;

public class SomaRecursiva {

	public static int somaAteN(int n){
		
		
		if(n==1){
			return 1;
		}
		 
		
		return n+somaAteN(n-1);
		
	}

	
	public static void main(String[] args) {
		System.out.println(somaAteN(5));
	}
}
