package br.com.loiane.listas.aula33;

public class Lampada {

	private String modelo;
	private String marca;
	private double tensao;
	private double potencia;
	private boolean estado;
	private String tipo;
	private String cor;
	
	
	public Lampada(){
		this.estado = false;
	}
	
	
	
	public void liga(){
		if(!this.estado){
			this.estado = true;
		}
	}
	
	public void desliga(){
		if(this.estado){
			this.estado = false;
		}
	}
	
	
	
	
	
	
	public void setMarca(String marca) {
		this.marca = marca;
	}



	public void setTensao(double tensao) {
		this.tensao = tensao;
	}



	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public String getModelo(){
		return this.modelo;
	}

	public String getMarca() {
		return marca;
	}

	public double getTensao() {
		return tensao;
	}

	public double getPotencia() {
		return potencia;
	}

	public boolean isEstado() {
		return estado;
	}

	public String getTipo() {
		return tipo;
	}

	public String getCor() {
		return cor;
	}
	
	
	
	
}
