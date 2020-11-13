package br.com.loiane.listas.aula86_94;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat {

	public static void main(String[] args) {
		
		
		Date hoje = new Date();
		System.out.println(hoje);
		System.out.println(Locale.getDefault());
		
		
//		Locale.setDefault(new Locale("en", "US"));
		DateFormat df = DateFormat.getInstance();
		String hojeFormatado = df.format(hoje);
		System.out.println("BR: "+hojeFormatado);
		
		Locale.setDefault(new Locale("en", "US"));
		hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println("EUA: " +hojeFormatado);
		
		Locale.setDefault(new Locale("fr", "FR"));
		hojeFormatado = df.format(hoje); 
		System.out.println("FR: "+hojeFormatado);
		
		
		Locale.setDefault(new Locale("en", "US"));
		String data = "02/02/2019 11:56 am";
		try {
			Date dataDate = DateFormat.getInstance().parse(data);
			String dataFormatada = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG).format(dataDate);
			System.out.println(dataDate);
			System.out.println(dataFormatada);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
