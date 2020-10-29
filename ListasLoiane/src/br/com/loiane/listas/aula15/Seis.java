package br.com.loiane.listas.aula15;

import java.util.Scanner;

public class Seis {

	public static void main(String[] args) {

		System.out.println("Digite seu salário atual");
		Scanner scan = new Scanner(System.in);
		double salario = scan.nextDouble();
		scan.close();
		
		double novoSalario;
		int reajuste;
		if(salario <=280){
			novoSalario = salario+(salario*0.2);
			reajuste = 20;
		}else if(salario <=700){
			novoSalario = salario+(salario*0.15);
			reajuste = 15;
		}else if(salario <1500){
			novoSalario = salario +(salario*0.1);
			reajuste = 10;
		}else{
			novoSalario = salario + (salario*0.05);
			reajuste = 5;
		}
		
		
		System.out.printf("Salário antes do reajuste %.2f", salario);
		System.out.printf("%nReajuste: %dp/c", reajuste);
		System.out.printf("%nSalário reajustado: R$%.2f", novoSalario);
	}

}
