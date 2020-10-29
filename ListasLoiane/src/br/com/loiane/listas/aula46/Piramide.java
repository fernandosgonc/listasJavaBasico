package br.com.loiane.listas.aula46;

public abstract class Piramide extends Figura3D{

	private Triangulo faceLateral;
	
	public Piramide(){
		this.setNome("Pir�mide");
	}


	public Triangulo getFaceLateral() {
		return faceLateral;
	}

	public void setFaceLateral(Triangulo faceLateral) {
		this.faceLateral = faceLateral;
	}
	
	
}
