package br.com.loiane.listas.aula27;

public class ContaCorrente {

	int numero;
	double saldo;
	boolean especial;
	double limiteEspecial;
	
	
	boolean saca(double valor){
		if(valor<=saldo){
			saldo -= valor;
			return true;
		}else{
			
			if(especial){
				
				double limite = saldo + limiteEspecial;
				
				if(valor<=(saldo+limite)){
					limiteEspecial = limiteEspecial - (valor-saldo);
					saldo -= valor;
					return true;
				}
			}
			
			return false;
		} 
	}
	
	void deposita(double valor){
		saldo += valor;
	}
	
	double consultaSaldo(){
		return saldo;
	}
	
	boolean verificaUsoChequeEspecial(){
		return saldo<0;
	}
	
}
