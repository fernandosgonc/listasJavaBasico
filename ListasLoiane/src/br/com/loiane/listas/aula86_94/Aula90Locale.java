package br.com.loiane.listas.aula86_94;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {

	public static void main(String[] args) {

		Locale loc = Locale.getDefault();
		System.out.println(loc);
		
		Locale[] locs = Locale.getAvailableLocales();
		for(Locale locc : locs){
			System.out.println("Nome: "+locc.getDisplayName());
			System.out.println("Código da língua "+locc.getLanguage());
			System.out.println("Cod Pais: "+locc.getCountry());
			System.out.println("*******************");
		}

		Locale eua = new Locale("pt");
		Locale.setDefault(eua);
		System.out.println();
		System.out.println(Locale.getDefault());
		System.out.println();
		
		
		long numero = 123456789l;
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf.format(numero));
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf1.format(numero));
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		System.out.println(nf2.format(numero));
		
	} 

}
