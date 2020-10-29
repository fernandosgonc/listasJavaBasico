package br.com.loiane.listas.aula36;

public class Aluno {

	private String nome;
	private String matricula;
	private double[] notas;
	
	public Aluno(){
		this.notas = new double[4];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double fazMedia(double[] notas){
		double soma = 0;
		for(double nota: this.notas){
			soma+= nota;
		}
		
		soma = soma/notas.length;
		return soma;
		
	}
	
	
	public String toString(){
		String s = "[Aluno: "+this.getNome()+"\n"
				+ "Matricula: "+this.getMatricula()+"\n"
						+ "Notas { ";
		
		for(double nota: notas){
			s+= nota+" ";
		}
		
		s+= "}\n";
		s+= "Media aritmética: "+this.fazMedia(this.getNotas())+"\n";
		return s;
	}
}
