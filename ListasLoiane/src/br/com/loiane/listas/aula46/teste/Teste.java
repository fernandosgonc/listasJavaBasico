package br.com.loiane.listas.aula46.teste;

import br.com.loiane.listas.aula46.PiramideBaseQuadrada;
import br.com.loiane.listas.aula46.Quadrado;
import br.com.loiane.listas.aula46.Triangulo;

public class Teste {
	
	public static void main(String[] args) {
		
	Quadrado quadrado1 = new Quadrado();
	quadrado1.setLado(2);
	Triangulo triangulo = new Triangulo();
	triangulo.setBase(quadrado1.getLado());
	triangulo.setAltura(3);
	
	PiramideBaseQuadrada p1 = new PiramideBaseQuadrada();
	p1.setBase(quadrado1);
	p1.setFaceLateral(triangulo);
	System.out.println(p1.calcularArea());

	}

}
