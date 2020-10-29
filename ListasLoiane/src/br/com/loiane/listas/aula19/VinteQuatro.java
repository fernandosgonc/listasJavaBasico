package br.com.loiane.listas.aula19;

public class VinteQuatro {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		
		for(int i = 0; i<a.length; i++){
			a[i] = i;
			if(i>=a.length/2){
				a[i] = a[a.length-1-i]; 
			}
		}
		
		for(int A:a){
			System.out.print(A);
		}
	}
	
}
