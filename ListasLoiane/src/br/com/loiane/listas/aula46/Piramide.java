package br.com.loiane.listas.aula46;

public abstract class Piramide extends Figura3D{

	private Triangulo faceLateral;
	
	public Piramide(){
		this.setNome("Pirâmide");
	}


	public Triangulo getFaceLateral() {
		return faceLateral;
	}

	public void setFaceLateral(Triangulo faceLateral) {
		this.faceLateral = faceLateral;
	}
	
	
}
