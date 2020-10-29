package br.com.loiane.listas.aula46;

public class Circulo extends Figura2D{

	private double raio; 
	private double diametro;
	private double circunferencia;
	
	public Circulo(){
		this.setNome("Circulo");
		this.circunferencia = Math.PI*2*getRaio();
		this.diametro = 2*getRaio();
	}


	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	



	public double getDiametro() {
		return diametro;
	}


	public double getCircunferencia() {
		return circunferencia;
	}


	@Override
	public double calcularArea() {
		return Math.PI*(Math.pow(this.raio, 2));
	}
	
	
	
}
