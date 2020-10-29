package br.com.loiane.listas.aula17;

import java.util.Scanner;

public class VinteECinco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor, total = 0, dinheiro, troco;
		System.out.println("Lojas Tabajara");
		for(int i = 1; ;i++){
			valor = sc.nextDouble();
			total += valor;
			System.out.println("Produto "+i+": R$ "+valor);
			
			if(valor==0){
				dinheiro = sc.nextDouble();
				troco = dinheiro - total;
				break;				
			}
		}
		sc.close();

		
		System.out.println("Total: R$ "+total+"Dinheiro: R$"+dinheiro+"\nTroco: R$ "+troco);
		
	}

}
