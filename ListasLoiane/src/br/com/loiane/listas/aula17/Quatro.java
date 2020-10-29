package br.com.loiane.listas.aula17;

public class Quatro {

	public static void main(String[] args) {

		double paisA = 80000;
		double paisB = 200000;
		
		double taxaA = 0.03;
		double taxaB = 0.015;
		
		int contador = 0;
		
		do{
			paisA = paisA + (paisA*taxaA);
			paisB = paisB+ (paisB*taxaB);
			contador++;
		}while(paisA<paisB);
		
		System.out.println("Populações: \nA "+paisA+"\nB "+paisB+"\n"+contador);
	}

}
