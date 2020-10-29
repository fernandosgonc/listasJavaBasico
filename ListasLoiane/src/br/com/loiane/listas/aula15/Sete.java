package br.com.loiane.listas.aula15;

import java.util.Scanner;

public class Sete {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double vph = scan.nextDouble();
		double h = scan.nextDouble();
		double sb = vph*h;
		scan.close();
		
		double ir;
		int taxa;
		double sindicato = sb*0.03;
		double fgts = sb*0.11;
		double inss = sb*0.1;
		
		if(sb<=900){
			ir = 0;
			taxa = 0;
		}else if(sb <=1500){
			ir = sb*0.05;
			taxa = 5;
		}else if(sb<=2500){
			ir = sb*0.1;
			taxa = 10;
		}else{
			ir = sb*0.2;
			taxa = 20;
		}
		
		double descontos = ir+inss+sindicato;
		System.out.printf("Salário Bruto: (%.0f * %.0f): R$%.2f", vph, h, sb);
		System.out.printf("%n(-) IR (%d): R$%.2f", taxa, ir);
		System.out.printf("%n(-) INSS (3p/c): R$%.2f", inss);
		System.out.printf("%nFGTS (11p/c): R$%.2f", fgts);
		System.out.printf("%nTotal de descontos: R$%.2f", descontos);
		System.out.printf("%nSalário Líquido: R$%.2f", (sb-descontos));
		
		
		
	}

}
