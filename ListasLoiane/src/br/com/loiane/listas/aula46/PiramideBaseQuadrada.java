package br.com.loiane.listas.aula46;

public class PiramideBaseQuadrada extends Piramide {

	private Quadrado base;
	
	public Quadrado getBase() {
		return base;
	}

	public void setBase(Quadrado base) {
		this.base = base;
	}

	@Override
	public double calcularArea() {
		double areaLateral = (this.getFaceLateral().calcularArea())*4;
		double areaBase = this.base.calcularArea();
		return areaLateral+areaBase;
	}

	@Override
	public double calcularVolume() {

		return (this.base.calcularArea()*this.getFaceLateral().getAltura())/3;
	}

	
	
}
