package br.com.loiane.listas.aula34;

import java.util.Scanner;

public class ConversaoDeUnidadesDeVolume {

	public static double converte(double a, Scanner scan){
		
		System.out.println("Qual conversao vc deseja?");
		System.out.println("1 - L p/ cm³");
		System.out.println("2 - m³ p/ L");
		System.out.println("3 - m3 p/ pés³");
		System.out.println("4 - Galão am p/ pol³");
		System.out.println("5 - Galão am p/ L");
		
		int op;
		op = scan.nextInt();

		switch (op) {
		case 1: return litroParaCmCubico(a);			
		case 2: return metroCubicoParaLitros(a);	
		case 3: return metroCubicoParaPesCubicos(a);
		case 4: return galaoAmericanoParaPolegadasCubicas(a);
		case 5: return galaoAmericanaParaLitros(a);
		default: return -1;
		
		}
	}
	
	private static double litroParaCmCubico(double a){
		return a*1000;
	}
	
	private static double metroCubicoParaLitros(double a){
		return a*1000;
	}
	
	private static double metroCubicoParaPesCubicos(double a){
		return a*(35.32);
	}
	
	private static double galaoAmericanoParaPolegadasCubicas(double a){
		return a*231;
	}
	
	private static double galaoAmericanaParaLitros(double a){
		return a*(3.785);
	}
	
	
	
}
