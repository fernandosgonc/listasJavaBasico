package br.com.loiane.listas.aula34;

public class Calculadora {

	public static double soma(double a, double b){
		return a+b;
	}
	
	public static double subtrai(double a, double b){
		return a-b;
	}
	
	public static double multiplica(double a, double b){
		return a*b;
	} 
	
	public static double divide(double a, double b){
		if(b!=0){
			return a/b;
		}else{
			System.out.println("Impossívle dividir por 0");
			return 0;
		}
	}
	
	public static double potencializa(double a, double b){
		
		double total = 1;
		for(int i = 1; i<=b; i++){
			total *= a;
		}
		
		return total;
	}
	
	
	public static double fatorial(double a){
		
		double num = a, total = 1;
		for(int i = 1; i<=a; i++){
			total *= num;
			num--;
		}
		
		return total;
	}
	
}
