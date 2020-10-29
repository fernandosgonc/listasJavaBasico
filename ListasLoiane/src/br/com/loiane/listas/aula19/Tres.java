package br.com.loiane.listas.aula19;

public class Tres {

	public static void main(String[] args) {
		int[] a = new int[15];
		int[] b = new int[a.length];
		
		for(int i = a.length-1; i>=0; i--){
			a[i] = i*2;
			b[i] = (int)Math.pow(a[i], 2);
		}
		
		System.out.println("A");
		for(int A:a){
			System.out.print(A+" ");
		}
		System.out.println("\nB");
		for(int B:b){
			System.out.print(B+" ");
		}
	}
}
