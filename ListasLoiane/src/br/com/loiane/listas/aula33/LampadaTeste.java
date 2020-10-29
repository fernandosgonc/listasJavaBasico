package br.com.loiane.listas.aula33;

public class LampadaTeste {

	
	public static void main(String[] args) {
		
		Lampada l1 = new Lampada();
		l1.setMarca("Philips");
		l1.setModelo("A10f50");
		l1.setTensao(9.6);
		l1.setPotencia(60);
		l1.setTipo("Led");
		l1.setCor("Vermelha");
		
		System.out.println(l1.isEstado());
		
		if(l1.isEstado()){
			l1.desliga();
		}else{
			l1.liga();
		}
		
		l1.desliga();
		
		//l1.liga();
		System.out.println(l1.isEstado());
	}
}
