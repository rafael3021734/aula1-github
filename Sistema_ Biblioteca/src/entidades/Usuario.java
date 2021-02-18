package entidades;

public class Usuario {
	
	private int UsuarioID;
	private String Nome;
	private String Telefone;
	private String Email;
	private String Senha;
	public Usuario(int usuarioID, String nome, String telefone, String email, String senha) {		
		UsuarioID = usuarioID;
		Nome = nome;
		Telefone = telefone;
		Email = email;
		Senha = senha;
	}
	public int getUsuarioID() {
		return UsuarioID;
	}
	public void setUsuarioID(int usuarioID) {
		UsuarioID = usuarioID;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}

}
