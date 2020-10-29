package br.com.loiane.listas.aula20;


public class Tre {

	public static void main(String[] args) {
		
		int[][] a = new int[3][3];
		
		for(int i = 0; i<a.length; i++){
			for(int j = 0; j<a[i].length; j++){
				a[i][j] = (int)Math.round(Math.random()*9);
			}
		}
		
		int par = 0, impar = 0;
		
		for(int i = 0; i<a.length; i++){
			for(int j = 0; j<a[i].length; j++){
				if(a[i][j]%2==0){
					par++;
				}else{
					impar++;
				}
			}
			
		}
		
		for(int i = 0; i<a.length; i++){
			for(int j = 0; j<a[i].length; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Par: "+par+"\nImpar: "+impar);
	}
}
