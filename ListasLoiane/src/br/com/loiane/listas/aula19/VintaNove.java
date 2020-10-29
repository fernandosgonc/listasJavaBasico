package br.com.loiane.listas.aula19;

import java.util.Random;

public class VintaNove {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[a.length + b.length];

		Random r = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(10);
			b[i] = r.nextInt(20);

		}

		System.out.println("A");
		for (int A : a) {
			System.out.print(A + " ");
		}

		System.out.println("\nB");

		for (int B : b) {
			System.out.print(B + " ");
		}

		for (int j = 0; j < a.length; j++) {
			
			c[j] = a[j];
			c[a.length+j] = b[j];
		}

		System.out.println("\nC");
		int k = 0;
		while (k < c.length) {
			System.out.print(c[k] + " ");
			k++;
		}
	}

}
