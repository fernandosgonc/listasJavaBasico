package br.com.loiane.listas.aula86_94;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Aula94DiferencaEntreDatas {

public static void main(String[] args) {
	
	try {
		diferencaDataAteJava7();
	} catch (ParseException e) {
		e.printStackTrace();
	}
	
	System.out.println();
	
	diferencaDataJava8();
	
	System.out.println();
	
	diferencaJava8ComTempo();
}	

	public static void diferencaDataAteJava7() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date primeiraDt = sdf.parse("01/01/2020");
		
		Date segundaDt = sdf.parse("01/02/2020");
		
		long diffEmMilli = Math.abs(segundaDt.getTime()-primeiraDt.getTime());
		long diff = TimeUnit.DAYS.convert(diffEmMilli, TimeUnit.MILLISECONDS);
		
		System.out.println(diff);
	}
	
	public static void diferencaDataJava8(){
		LocalDate data1 = LocalDate.of(2020, 01, 01);
		LocalDate data2 = LocalDate.of(2023, 02, 28);
		
		Period periodo = Period.between(data1, data2);
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anos = periodo.getYears();

		
		System.out.println("Dias:" +dias);
		System.out.println("Meses: "+meses);
		System.out.println("Anos: "+anos);
	}
	
	
	public static void diferencaJava8ComTempo(){
		LocalDateTime data1 = LocalDateTime.of(2020,  1, 10, 15, 30);
		LocalDateTime data2 = LocalDateTime.of(2020,  1, 11, 15, 30);
		
		Duration duracao = Duration.between(data1, data2);
		long diff = duracao.toMinutes();
		System.out.println(diff);
	}
	
}


