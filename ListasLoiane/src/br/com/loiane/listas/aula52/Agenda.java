package br.com.loiane.listas.aula52;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {

	private Contato[] contatos;
	private String nomeAgenda;

	public Agenda() {
		this.contatos = new Contato[4];
	}

	public void adicionaContato(Contato c) throws AgendaCheiaException {
		boolean cheia = true;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				contatos[i] = c;
				cheia = false;
				break;
			}
		}

		if (cheia) {
			throw new AgendaCheiaException(this.nomeAgenda);
		}
	}

	public String consultaContato(String nomeContato) throws ContatoNaoExisteException {

		String s = "";

		List<Contato> resultado = new ArrayList<>();

		for (Contato c : contatos) {
			if (c != null && c.getNome().equals(nomeContato)) {
				resultado.add(c);
			}
		}

		if (!resultado.isEmpty()) {
			Iterator<Contato> it = resultado.iterator();
			while (it.hasNext()) {
				s += it.next().toString();
			}
		} else {
			s = new ContatoNaoExisteException(nomeContato).getMessage();
			throw new ContatoNaoExisteException(nomeContato);
		}

		return s;
	}

	@Override
	public String toString() {
		String s = "*** INF. DOS CONTATOS *** \n";
		boolean temContatos = false;
		if (contatos != null) {
			for (Contato c : contatos) {
				if (c != null) {
					temContatos = true;
					s += c.toString() + "\n";
				}
			}
		}
		if(!temContatos)s+= "Agenda vazia.";
		return s;
	}

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

}
