package br.com.loiane.listas.aula43;

public class ContaEspecial extends ContaBancaria{

	private double limite;	
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}



	@Override
	public boolean sacar(double valor) {
		double limiteEspecial = this.getLimite()+this.getSaldo();
			
		if(limiteEspecial>=valor){
		this.limite = this.getLimite()-(valor-this.getSaldo());
			super.sacar(valor);
			return true;
		}
			return false;
	}
}
