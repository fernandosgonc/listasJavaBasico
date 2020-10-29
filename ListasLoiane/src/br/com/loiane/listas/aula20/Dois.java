package br.com.loiane.listas.aula20;


public class Dois {

	public static void main(String[] args) {

		int[][] a = new int[10][10];

		int maior = -1, menor = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) Math.round(Math.random() * 9);
					
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i<a[7].length; i++){
			if (a[7][i] > maior) {
				maior = a[7][i];
			}
			
			if (a[7][i] < menor) {
				menor = a[7][i];
			}

		}
		
		
		System.out.println("Maior: "+maior+"\nMenor:"+menor);
	}

}
