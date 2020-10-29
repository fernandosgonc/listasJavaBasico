package br.com.loiane.listas.aula52;

public class Contato {
	
	private String nome;
	private String telefone;
	private static int contador;
	private int id;
	
	public Contato(){
		Contato.contador++;
		this.id = Contato.contador;
	}

	
	@Override
	public String toString() {
		return "[ID: "+ this.id+"\n"
				+ "NOME: "+this.nome+"\n"
				+ "TELEFONE: "+this.telefone+"]\n";
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}
	
	
	
	

}
