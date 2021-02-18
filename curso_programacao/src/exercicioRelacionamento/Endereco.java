package exercicioRelacionamento;

public class Endereco {
	private String nomeRua;
	private String numero;
	private String complemento;
	private String cidade;
	private String estado;
	private String cep;
	
	public String getnomeRua() {
		return nomeRua;
	}
	public void setnomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}
	public String getnumero() {
		return numero;
	}
	public void setnumero(String numero) {
		this.numero = numero;
	}
	public String getcomplemento() {
		return complemento;
	}
	public void setcomplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getcidade() {
		return cidade;
	}
	public void setcidade(String cidade) {
		this.cidade = cidade;
	}
	public String getestado() {
		return estado;
	}
	public void setestado(String estado) {
	this.estado = estado;
	}
	public String getcep() {
		return cep;
	}
	public void setcep(String cep) {
		this.cep = cep;
	}
	
}
