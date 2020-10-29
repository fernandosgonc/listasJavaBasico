package br.com.loiane.listas.aula17;

import java.util.Scanner;

public class Sete {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[] numeros = new double[5];
		
		for(int i = 0; i<numeros.length; i++){
			numeros[i] = scan.nextDouble();
		}
		scan.close();
		
		double maior = numeros[0];
		double menor = numeros[0];
		for(int i = 0; i<numeros.length; i++){
			if(numeros[i]>maior){
				maior = numeros[i];
			}
			if(numeros[i]<menor){
				menor = numeros[i];
			}
		}
		
		System.out.println("Maior: "+maior+"\nMenor: "+menor);
	}

}
