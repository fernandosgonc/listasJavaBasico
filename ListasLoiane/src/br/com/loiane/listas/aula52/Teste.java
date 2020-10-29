package br.com.loiane.listas.aula52;

public class Teste {

	public static void main(String[] args) {

		Contato c1 = new Contato();
		c1.setNome("José");
		c1.setTelefone("99907-4947");
		
		
		Contato c2 = new Contato();
		c2.setNome("Maria");
		c2.setTelefone("99905-6519");
		
		Agenda a1 = new Agenda();
		a1.setNomeAgenda("Primeira Agenda");
		
		//Contato[] contatos = new Contato[3];
		//a1.setContatos(contatos);
		//contatos[1] = c1;
		//contatos[2] = c2;
		
		
		
		try{
			a1.adicionaContato(c1);
			a1.adicionaContato(c2);
			
		}catch(AgendaCheiaException e){
			System.out.println(e);
		}
		
		System.out.println(a1);
		try {
			System.out.println("CONSULTA");
			System.out.println(a1.consultaContato("Maria"));
		} catch (ContatoNaoExisteException e) {
			System.out.println(e);
		}
		


		
		
	}

}
