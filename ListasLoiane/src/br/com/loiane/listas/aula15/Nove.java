package br.com.loiane.listas.aula15;

import java.util.Scanner;

public class Nove {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite os valores de a, b e c: ");
		double a = scan.nextDouble();
		double b, c, delta, raiz1, raiz2;
		
		if(a==0){
			System.out.printf("Não é equação quadrada.");
			System.exit(0);
		}else{
			b = scan.nextDouble();
			c = scan.nextDouble();
			delta = Math.pow(b, 2)-4*a*c;
			
			if(delta<0){
				System.out.printf("Não possui raízes reais.");
				System.exit(0);
			}else if(delta == 0){
				b = b*(-1);
				raiz1 = (b)/(2*a);
				System.out.printf("Raíz: %.5f", raiz1);
			}else{
				b = b*(-1);
				raiz1 = (b + Math.sqrt(delta))/2*a;
				raiz2 = (b - Math.sqrt(delta))/2*a;
				System.out.printf("Raízes: %.0f %.0f", raiz1, raiz2);
			}
		}
		
		
	
	
	
		scan.close();
	}
}
