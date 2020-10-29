package br.com.loiane.listas.aula46;

public class Cilindro extends Figura3D {

	private Circulo base;
	private double altura;
	
	public Cilindro(){
		this.setNome("Cilindro");
	}

	public Circulo getBase() {
		return base;
	}

	public void setBase(Circulo base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (this.base.calcularArea()*2)+(this.base.getCircunferencia()*this.altura);
	}

	@Override
	public double calcularVolume() {
		return this.base.calcularArea()*this.altura;
		
	}
	
	
	
	
}
