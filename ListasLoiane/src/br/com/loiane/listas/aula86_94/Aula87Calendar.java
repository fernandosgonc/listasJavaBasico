package br.com.loiane.listas.aula86_94;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance(); //forma de instanciar Calendar; singleton
		System.out.println(hoje);
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d:%02d", dia, (mes+1), ano, hora, minutos, segundos);
		
		
		hoje.add(Calendar.DAY_OF_MONTH, 8);

		System.out.println();
		System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d:%02d", hoje.get(Calendar.DAY_OF_MONTH), (mes+1), ano, hora, minutos, segundos);

	}
	
}
