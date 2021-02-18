package entidades;

public class Autenticacao {
	
	private boolean UsuarioAutorizado;
	private Usuario UsuarioID;
	private Usuario Senha;
	public Autenticacao( Usuario usuarioID, Usuario senha) {
		UsuarioID = usuarioID;
		Senha = senha;
	}
	public boolean isUsuarioAutorizado() {
		return UsuarioAutorizado;
	}
	public void setUsuarioAutorizado(boolean usuarioAutorizado) {
		UsuarioAutorizado = usuarioAutorizado;
	}
	public Usuario getUsuarioID() {
		return UsuarioID;
	}
	public void setUsuarioID(Usuario usuarioID) {
		UsuarioID = usuarioID;
	}
	public Usuario getSenha() {
		return Senha;
	}
	public void setSenha(Usuario senha) {
		Senha = senha;
	}

}
