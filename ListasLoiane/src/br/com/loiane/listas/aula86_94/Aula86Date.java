package br.com.loiane.listas.aula86_94;

import java.util.Date;

public class Aula86Date {

	public static void main(String[] args) {
		
		Date dataHoje = new Date();
		System.out.println(dataHoje);
		System.out.println("Milissegundos desde 1 Jan 1970 " +dataHoje.getTime());
		
	}
}
