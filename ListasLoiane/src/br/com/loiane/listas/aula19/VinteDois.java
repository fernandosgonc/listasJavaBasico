package br.com.loiane.listas.aula19;

public class VinteDois {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		
		for(int i=0; i<a.length; i++){
			a[i] = (int)Math.round(Math.random()*1);
		}
		
		
		
		int cont1 = 0;
		for(int A:a){
			System.out.println(A);
			
			if(A==1){
				cont1++;
			}
		}
		
		int pct1 = (cont1*100)/a.length;
		int pct0 = 100-pct1;
		
		System.out.println(pct1);
		System.out.println(pct0);
		
		
	}
}
