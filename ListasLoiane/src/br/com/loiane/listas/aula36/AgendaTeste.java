package br.com.loiane.listas.aula36;

import java.util.Scanner;

public class AgendaTeste {

	public static void main(String[] args) {
		
		System.out.println("Qual o nome da agenda?");
		
		Agenda ag1 = new Agenda();
		Scanner scan = new Scanner(System.in);
		ag1.setNomeAgenda(scan.next());
		
		System.out.println("Quantos contatos deseja adicionar?");
		int qtd = scan.nextInt();
		
		
		Contato[] contatos = new Contato[qtd];
		for(int i = 0; i<qtd; i++){
			Contato c = new Contato();
			System.out.println("Nome "+(i+1));
			c.setNome(scan.next());
			System.out.println("Email "+(i+1));
			c.setEmail(scan.next());
			System.out.println("Telefone "+(i+1));
			c.setTelefone(scan.next());
			contatos[i] = c;
		}
		scan.close();
		
		ag1.setContatos(contatos);
		System.out.println(ag1.toString());
		
		
		
	}
	
}
