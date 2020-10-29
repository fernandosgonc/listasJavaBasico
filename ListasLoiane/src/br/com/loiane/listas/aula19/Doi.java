package br.com.loiane.listas.aula19;

public class Doi {

	public static void main(String[] args) {
		 int[] a = new int[8];
		 int[] b = new int[a.length];
		 
		 for(int i = 0; i<8; i++){
			 a[i] = i;
			 b[i] = a[i]*2;
		 }
		 
		 System.out.println('A');
		 
		 for(int A : a){
			 System.out.print(A+" ");
		 }
		 
		 System.out.println("\nB");
		 for(int B : b){
			 System.out.print(B+" ");
			 }
		 }
	
}
