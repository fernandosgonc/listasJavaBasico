package br.com.loiane.listas.aula19;

public class Um {

	public static void main(String[] args) {
		int[] A = new int[5];
		int[] B = new int[5];
		
		for(int i = 0; i <A.length; i++){
			A[i] = i*2;
			B[i] = A[i];
		}
		
		System.out.println("A");
		for(int a : A){
			System.out.print(a+" ");
		}
		
		System.out.println("\n\nB");
		for(int b : B){
			System.out.print(b+" ");
		}
	}
	
}
