package Entidades;

public class Matricula {
	private Alunos prontuario;
	private Disciplinas nome_disciplina;
	
	public Matricula(Alunos prontuario, Disciplinas nome_disciplina) {
		super();
		this.prontuario = prontuario;
		this.nome_disciplina = nome_disciplina;
	}

	public Alunos getProntuario() {
		return prontuario;
	}

	public void setProntuario(Alunos prontuario) {
		this.prontuario = prontuario;
	}

	public Disciplinas getDisciplina() {
		return nome_disciplina;
	}

	public void setDisciplina(Disciplinas nome_disciplina) {
		this.nome_disciplina = nome_disciplina;
	}
	
}
