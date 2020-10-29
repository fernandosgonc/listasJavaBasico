package br.com.loiane.listas.aula43;

public class ContaTeste {

	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.depositar(1000);
		//cp.sacar(999);
		cp.calculaNovoSaldo();
		System.out.println(cp.getSaldo());
		
		
		ContaBancaria ce = new ContaEspecial();
		ce.depositar(1000);
		ce.sacar(1050);
		System.out.println(ce.getSaldo());
		
	}
	
}

