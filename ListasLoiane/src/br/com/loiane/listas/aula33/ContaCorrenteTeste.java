package br.com.loiane.listas.aula33;

public class ContaCorrenteTeste {
	
	public static void main(String[] args) {
		
		String titular = "José Fernando";
		
		ContaCorrente cc = new ContaCorrente(titular);
		
		System.out.println(cc.consultarSaldo());
		cc.deposita(1000);
		cc.setEspecial(true);
		cc.setLimite(100);
		cc.saca(1076);
		System.out.println(cc.consultarSaldo());
		System.out.println(cc.verificaChequeEspecial());
		System.out.println(cc.getLimite());
	}

}
