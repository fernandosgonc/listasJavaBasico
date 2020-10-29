package br.com.loiane.listas.aula27;

public class ContaCorrenteTest {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.numero = 1234;
		cc.saldo = 1000;
		cc.limiteEspecial = 100;
		cc.especial = true;
		
		
		System.out.println(cc.consultaSaldo());
		cc.saca(1050);
		System.out.println(cc.consultaSaldo());
		System.out.println(cc.verificaUsoChequeEspecial());
		System.out.println(cc.limiteEspecial);
	}

}
