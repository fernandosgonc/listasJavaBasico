package br.com.loiane.listas.aula46;

public class Cubo extends Figura3D{

	private Quadrado face;
	
	public Cubo(){
		this.setNome("Cubo");
	}

	public Quadrado getFace() {
		return face;
	}

	public void setFace(Quadrado face) {
		this.face = face;
	}

	@Override
	public double calcularArea() {
		return this.face.calcularArea()*6;
	}

	@Override
	public double calcularVolume() {
		return Math.pow(this.face.getLado(), 3);
	}

	
	
}
