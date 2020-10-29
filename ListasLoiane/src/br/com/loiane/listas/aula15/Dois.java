package br.com.loiane.listas.aula15;

import java.util.Scanner;

public class Dois {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com uma letra:");
        String caract = scan.next();
        char letra = caract.charAt(0);
        scan.close();
        
        if(letra >= 32 && letra<=64){
        	System.out.printf("Símbolo inválido.");
        }else{
        	switch (letra) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U': System.out.printf("%c é uma vogal.", letra);
			
			break;
			
			default: System.out.printf("Consoante");
        	}
        }
        

	}

}
