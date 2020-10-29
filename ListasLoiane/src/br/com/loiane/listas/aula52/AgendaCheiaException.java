package br.com.loiane.listas.aula52;

public class AgendaCheiaException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomeAgenda;
	
	public AgendaCheiaException(String nomeAgenda){
		this.nomeAgenda = nomeAgenda;
	}
	
	@Override
	public String getMessage() {

		return "A agenda "+nomeAgenda+" está cheia.";
		
	}
	
}
