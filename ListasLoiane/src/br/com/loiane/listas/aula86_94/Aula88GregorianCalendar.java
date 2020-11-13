package br.com.loiane.listas.aula86_94;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88GregorianCalendar {

	public static void main(String[] args) {

		Calendar hoje = Calendar.getInstance();
		GregorianCalendar hoje1 = new GregorianCalendar();
		// System.out.println(hoje);
		// System.out.println(hoje1);
		imprimirCalendar(hoje1);
		imprimirCalendar(hoje);
	
		
		
	}

	private static void imprimirCalendar(Calendar hoje) {

		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d:%02d", dia, (mes + 1), ano, hora, minutos, segundos);

	}
}
