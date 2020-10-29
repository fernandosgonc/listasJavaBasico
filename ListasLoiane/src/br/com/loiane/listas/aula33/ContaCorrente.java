package br.com.loiane.listas.aula33;

public class ContaCorrente {

	private double saldo;
	private String titular;
	private double limite;
	private boolean especial;
	private int numero;

	public ContaCorrente(String titular) {
		this.titular = titular;
	}

	public ContaCorrente() {

	}

	public boolean saca(double valor) {
		if (!especial) {
			if (valor > this.saldo) {
				return false;
			} else {
				this.saldo -= valor;
				return true;
			}
		} else {
			double limiteEspecial = saldo + limite;
			if (valor > limiteEspecial) {
				return false;
			} else {
				this.limite = limite - (valor - saldo);
				this.saldo -= valor;
				return true;
			}
		}

	}
	
	
	public void deposita(double valor){
		this.saldo += valor;
	}

	
	public boolean verificaChequeEspecial(){
		return (saldo<0);
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double consultarSaldo() {
		return saldo;
	}

}
