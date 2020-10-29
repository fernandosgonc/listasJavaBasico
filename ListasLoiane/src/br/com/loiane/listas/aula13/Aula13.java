package br.com.loiane.listas.aula13;

import java.util.Scanner;

public class Aula13 {

		public static void main(String[] args) {
			System.out.println("Main");
		}
}

class Um{
	public static void main(String[] args) {
		System.out.println("Ola Mundo");
	}
	
}

class Dois{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor\n");
		double a = scan.nextDouble();
		scan.close();
		System.out.println("o valor informado foi: "+a);
		System.out.printf("O valor informado foi %.2f", a);
	}
}

class Tres{
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o 1� n�mero: ");
		double a = scan.nextDouble();
		System.out.println("Digite o 2� n�mero: ");
		double b = scan.nextDouble();
		scan.close();
		System.out.printf("A soma dos n�meros �: %.2f", Tres.soma(a, b));
	}
	
	
	private static double soma(double a, double b){
		
		return a+b;
	}
}

class Quatro{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a 1� nota: ");
		double a = scan.nextDouble();
		System.out.println("Digite a 2� nota: ");
		double b = scan.nextDouble();
		System.out.println("Digite a 3� nota: ");
		double c = scan.nextDouble();
		System.out.println("Digite a 4� nota: ");
		double d = scan.nextDouble();
		scan.close();
		System.out.printf("Sua m�dia � de %.3f", Quatro.retornaMedia(a, b, c, d));
	}
	
	private static double retornaMedia(double a, double b, double c, double d){
		return (a+b+c+d)/4;
	}
	
}

class Cinco{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a qtd de metros: ");
		double m = scan.nextDouble();
		scan.close();
		System.out.printf("%f", m, "m equevalem a %.2f", Cinco.metroPCm(m), "cm");
	}
	
	private static double metroPCm(double m){
		return m*100;
	}
}

class Seis{
	
	public static void main(String[] args) {
		System.out.println("Digite o raio do c�rculo: ");
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		scan.close();
		System.out.printf("A �rea do c�rculo �: %.3f", Seis.calculaArea(r), "ua�");
	}
	
	private static double calculaArea(double r){
		return Math.pow(r, 2)*Math.PI;
	}
}

class Sete{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Tamanho do lado: ");
		double l = scan.nextDouble();
		scan.close();
		System.out.printf("Area do quadrado � %.5f", Sete.calculaAreaQuadrado(l), "ua�");
		System.out.printf("%nDobro da �rea � %.3f", (Sete.calculaAreaQuadrado(l)*2));
	}
	
	private static double calculaAreaQuadrado(double l){
		return Math.pow(l, 2);
	}
}

class Oito{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Valor por hora: ");
		double vph = scan.nextDouble();
		System.out.println("Horas trabalhadas");
		double h = scan.nextDouble();
		scan.close();
		System.out.printf("Seu sal�rio esse m�s � de %.2f", Oito.retornaPagamento(vph, h));
	}
	
	private static double retornaPagamento(double vph, double h){
		return vph*h;
	}
}

class Nove{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Temperatura em Fahrenheit: ");
		double t = scan.nextDouble();
		scan.close();
		System.out.printf("%.3f�F", t);
		System.out.printf(" equivale a %.3f", Nove.FahrenheitPCelsius(t), "�C");
	}
	
	private static double FahrenheitPCelsius(double f){
		return (f-32)*5/9;
	}
}


class Treze{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Valor por hora: ");
		double vph = scan.nextDouble();
		System.out.println("horas trabalhdas: ");
		double h = scan.nextDouble();
		scan.close();
		System.out.printf("+ Sal�rio L�quido: %.2f", Treze.calculaSalarioLiquido(vph, h));
	}
	
	private static double calculaSalarioLiquido(double vph, double h){
		double salarioB = vph*h;
		double inss = salarioB*0.08;
		double ir = salarioB*0.11;
		double sindicato = salarioB*0.05;
		double descontos = inss+ir+sindicato;
		
		return salarioB-descontos;
		
		
	}
}
















