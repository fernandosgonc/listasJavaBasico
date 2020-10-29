package br.com.loiane.listas.aula17;

import java.util.Scanner;

public class Tres {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String nome;
		double salario;
		int idade;
		char sexo, estadoCivil;
		
		boolean tudoOk = false;
		do{
			nome = scan.next();
			if(nome.length()>3){
				tudoOk = true;
			}else{
				System.out.println("Nome precisa +3 caracteres");
			}
		}while(!tudoOk);
		
		tudoOk = false;
		do{
			idade = scan.nextInt();
			if(idade>0 && idade <150){
				tudoOk = true;
			}else{
				System.out.println("Idaave inválida");
			}
		}while(!tudoOk);
		
		tudoOk = false;
		do{
			salario = scan.nextDouble();
			if(salario>0){
				tudoOk = true;
			}else{
				System.out.println("Salário inválido");
			}
		}while(!tudoOk);
		
		tudoOk = false;
		do{
			String s;
			s = scan.next();
			sexo = s.charAt(0);
			if(sexo == 'f' || sexo=='m'){
				tudoOk = true;
			}else{
				System.out.println("Opção inválida");
			}
		}while(!tudoOk);
		
		tudoOk = false;
		do{
			String s = scan.next();
			estadoCivil = s.charAt(0);
			if(estadoCivil == 's' || estadoCivil=='c' || estadoCivil=='v' || estadoCivil == 'd'){
				tudoOk = true;
			}else{
				System.out.println("Opção inválida");
			}
		}while(!tudoOk);
		
		
		
		
		
		
		
		
		scan.close();
		
		
	}

}
