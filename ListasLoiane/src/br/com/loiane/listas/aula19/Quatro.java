package br.com.loiane.listas.aula19;

public class Quatro {

	public static void main(String[] args) {
		
		int[] A = new int[10];
		double[] B = new double[A.length];
		
		for(int k = A.length-1; k>=0; k--){
			A[k] = k-2;
			B[k] = Math.sqrt(A[k]);
		}
		
		System.out.println("A");
		for(int a:A){
			System.out.print(a+" ");
		}
		System.out.println("\nB");
		for(double b:B){
			System.out.print(b+" ");
		}
		
	}
}
