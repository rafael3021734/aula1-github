package estancias;

public class teste1 {

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private String nome;
	public String cpf;
	public int  idade;
	
	
	
	public teste1 (String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	public teste1 (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	public teste1 (String nome) {
		this.cpf = nome;
	
	}
	
}

