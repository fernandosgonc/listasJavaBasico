package br.com.loiane.listas.aula19;

import java.util.Random;

public class VintaTres {

	public static void main(String[] args) {

		int[] a = new int[10];
		boolean ePar = true;
		Random rdm = new Random();

		for (int i = 0; i < a.length; i++) {

			a[i] = rdm.nextInt(50);
		}

		for (int A : a) {
			System.out.print(A + " ");
		}

		System.out.println("\nWhile");

		int j = 0;
		while (ePar) {

			if (a[j] % 2 == 0) {
				System.out.print(a[j] + " ");
			} else {
				ePar = false;
			}
			j++;
		}
	}
}
