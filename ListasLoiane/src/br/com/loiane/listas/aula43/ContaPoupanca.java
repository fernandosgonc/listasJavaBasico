package br.com.loiane.listas.aula43;

public class ContaPoupanca extends ContaBancaria{

	private int diaRendimento;
	
	
	public double calculaNovoSaldo(){
		return (this.getSaldo()*0.11)+this.getSaldo();
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	
	
}
