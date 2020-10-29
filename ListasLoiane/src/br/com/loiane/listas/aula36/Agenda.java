package br.com.loiane.listas.aula36;

public class Agenda {

	private Contato[] contatos;
	private String nomeAgenda;

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	public void adicionaContato(Contato c) {
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				contatos[i] = c;
			}
		}
	}
	
	

	public String toString() {
		String s = "### " + this.nomeAgenda + " ###\n";
		for (int k = 0; k < this.contatos.length; k++) {
			s+= contatos[k].toString();
		}
		
		return s;
	}

}
