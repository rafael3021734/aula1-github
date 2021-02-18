package Entidades;

public class Alunos {
	private String prontuario;
	private String nome;
	private Integer idade;
	private Disciplinas nome_disciplina;
	
	public Alunos(String prontuario, String nome, Integer idade) {
		this.prontuario = prontuario;
		this.nome = nome;
		this.idade = idade;		
	}

	public Alunos(String prontuario, Disciplinas nome_disciplina) {		
		this.prontuario = prontuario;
		this.nome_disciplina = nome_disciplina;
	}

	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Disciplinas getDisciplina() {
		return nome_disciplina;
	}

	public void setDisciplina(Disciplinas nome_disciplina) {
		this.nome_disciplina = nome_disciplina;
	}
	
	

}
