package br.com.loiane.listas.aula46;

public class PiramideBaseTriangular extends Piramide {

	private Triangulo base;

	
	public Triangulo getBase() {
		return base;
	}

	public void setBase(Triangulo base) {
		this.base = base;
	}

	@Override
	public double calcularArea() {

		double areaLateral = (this.getFaceLateral().calcularArea())*3;
		double areaBase = this.base.calcularArea();
		return areaLateral+areaBase;
		
	}

	@Override
	public double calcularVolume() {
		return (this.base.calcularArea()*this.getFaceLateral().getAltura())/3;
	}

	
	
	
}
