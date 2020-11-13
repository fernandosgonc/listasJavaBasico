package br.com.loiane.listas.aula86_94;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Aula89SimpleDateFormat {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy KK:mma");

		Calendar hj = Calendar.getInstance();

		System.out.println(hj);
		System.out.println(sdf.format(hj.getTime()));

		// transformando String em um Date
		String data = new String("12/nov/2020");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MMM/yyyy");
		
		try {
			Date dataEmDate = sdf1.parse(data);
			System.out.println(dataEmDate);
			System.out.println(sdf.format(dataEmDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
