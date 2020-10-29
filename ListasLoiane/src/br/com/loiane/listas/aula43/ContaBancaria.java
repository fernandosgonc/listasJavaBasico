package br.com.loiane.listas.aula43;

public class ContaBancaria {

	private String nomeCliente;
	private long numConta;
	private double saldo;

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public long getNumConta() {
		return numConta;
	}

	public void setNumConta(long numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

}
