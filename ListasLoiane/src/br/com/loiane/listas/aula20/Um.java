package br.com.loiane.listas.aula20;

import java.util.Random;

public class Um {

	public static void main(String[] args) {

		double[][] a = new double[4][4];
		Random r = new Random(9);
		

		double maior = -1;
		int mLinha = 0, mColuna=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				a[i][j] = Math.round(r.nextDouble()*9);
				if(a[i][j]>maior){
					maior = a[i][j];
					mLinha = i;
					mColuna = j;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println("Maior: "+maior+"\nPosicao: ["+mLinha+"]["+mColuna+"]");
	}

}
