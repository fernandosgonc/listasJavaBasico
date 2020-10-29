package br.com.loiane.listas.aula27;

public class Lampada {

	String marca;
	String modelo;
	double tensao;
	double potencia;
	String tipo;
	
	boolean estado;
	
	
	public void apaga(){
		estado = false;
	}
	
	public void acende(){
		estado = true;
	}
	
	
	public void mudarEstado(){
		if(estado){
			apaga();
		}else{
			acende();
		}
	}
	
	public void mostraEstado(){
		if(estado){
			System.out.println("ON");
		}else{
			System.out.println("OFF");
		}
	}
	
	
	
	public static void main(String[] args) {
		Lampada lam = new Lampada();
		lam.marca = "Panasonic";
		lam.tensao = 220;
		lam.tipo = "Led";
		
		lam.mostraEstado();
		lam.mudarEstado();
		lam.mostraEstado();
	}
}
