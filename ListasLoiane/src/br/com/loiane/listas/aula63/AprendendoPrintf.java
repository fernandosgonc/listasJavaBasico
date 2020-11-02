package br.com.loiane.listas.aula63;


public class AprendendoPrintf {
	
	public static void main(String[] args) {
		
		System.out.printf("%s%n", "Olá Mundo!"); //%s -- pra Strings
		System.out.printf("%S%n", "Olá, mundo!"); //%S -- para deixar a string em cix alta
		System.out.printf("%c%n", 'c'); //%c -- para carctere
		System.out.printf("%C%n", 'c'); //caractere em caixa alta
		System.out.printf("%n"); //%n -- pula linha, melhor que usar \n
		
		
		int valor = 123456;
		System.out.printf("%d%n", valor); //%d -- para inteiros 
	
		double flutuante = 3.121543;
		System.out.printf("%f%n", flutuante); //%f -- para ponto flutuante
		
		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s%n", olaMundo); //20 caracteres vzios à esquerda da string
		System.out.printf("%-20s%n", olaMundo); //20 caracteres vzios à direita da string
		
		System.out.printf("%+d%n", valor); //%+ -- força a mostrar o sinal do valor
		System.out.printf("%015d%n", valor); //quero o numero com 15 css, completa com 0 à esquerda
	
		System.out.printf("%,d%n", valor); //separa as casas decimais
		
	
		int valor2 = -12345;
		System.out.printf("% d%n", valor2); //% d -- mostra o sinal do numero se for negativo, se positivo deixa espaço em branco
		
		System.out.printf("R$%10.2f%n", flutuante); //10 numeros antes da virgula(complet com espço em branco), 2 depois 
		
	}

}
