package br.com.loiane.listas.aula56.teste;

import br.com.loiane.listas.aula56.Calculadora;

public class CalculadoraMain {

	public static void main(String[] args) {

		double a = 3;
		double b = 5;
		
		for(int i = 0; i<Calculadora.values().length; i++){
			System.out.print("x ");
			System.out.print(Calculadora.values()[i].toString());
			System.out.print(" y = ");
			System.out.print(Calculadora.values()[i].executaOperacao(a, b));
			System.out.println();
		}
		
		
		
	}

}
