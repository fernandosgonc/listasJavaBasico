package br.com.loiane.listas.aula36;

public class Curso {

	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	@Override
	public String toString() {
		String s = "##########\n CURSO: "+this.getNome()+"\n"
				+ "HORARIO: "+this.getHorario()+"\n"
						+this.professor.toString();
		
		for(Aluno a : alunos){
			s+= a.toString();
		}
		s+= "MEDIA DA TURMA: "+this.fazMedia();
		s+= "\n##########";
		return s;
						
	}
	
	public double fazMedia(){
		double soma = 0;
		for(Aluno a: alunos){
				soma += a.fazMedia(a.getNotas());
		}
		
		soma = soma/this.alunos.length;
		return soma;
		
	}
	
	
}
