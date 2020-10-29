package br.com.loiane.listas.aula19;

public class TrintaUma {

	public static void main(String[] args) {
		
		int[] a = new int[20];
		int[] b = new int[20];
		
		for(int i = 0; i<a.length; i++){
			a[i] = i*3;
		}
		
		int ocup = 0;
		
		for(int j = 0; j<a.length; j++){
			if(a[j]%2==0){
				b[ocup] = a[j];
				ocup++;
			}
		}
		
		for(int i = 0; i<a.length; i++){
			if(a[i]%2!=0){
				b[ocup] = a[i];
				ocup++;
			}
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
