package br.com.loiane.listas.aula62;

public class Varargs {

	
	public static void main(String[] args) {
		System.out.println(soma(1,2,3,4,5));
	}
	
	
	
	public static int soma(Integer... numeros){
		
		int total = 0;
		for(int a: numeros){
			total+=a;
		}
		return total;
		
	}
}
