package br.com.loiane.listas.aula46;

public class Quadrado extends Figura2D{

	private double lado;
	private double diagonal;
	
	public Quadrado(){
		this.setNome("Quadrado");
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}

	@Override
	public double calcularArea() {
		return this.lado*this.lado;
	}
	
	
	
}
