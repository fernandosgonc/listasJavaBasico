package br.com.loiane.listas.aula17;

import java.util.Scanner;

public class Dois {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Dgite o usuário:");
		String user = scan.next();
		String senha;
		boolean valido = false;

		do{
		System.out.println("Agora a senha");
		senha = scan.next();
		
		if(user.equalsIgnoreCase(senha)){
			System.out.println("A senha não deve ser igual ao username");
			//igual = true;
		}else{
			valido = true;
		}
		}while(!valido);		
		scan.close();
		
		
	}

}
