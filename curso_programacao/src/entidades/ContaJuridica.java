package entidades;

public class ContaJuridica extends ContaBancaria {

	private Double limiteImprestimo;

	public ContaJuridica() {
		super();
	}
	public ContaJuridica(Integer number, String holder, Double balance, Double limiteImprestimo) {
		super(number, holder, balance);
		this.limiteImprestimo = limiteImprestimo;
	}
	public Double getLimiteImprestimo() {
		return limiteImprestimo;
	}
	public void setLimiteImprestimo(Double limiteImprestimo) {
		this.limiteImprestimo = limiteImprestimo;
	} 	
	
	public void limite(double montante) {
		if (montante <= limiteImprestimo) {
		      balance += montante - 10.0;
		}
	}
	@Override
	public void saque(double montante){
		super.saque(montante);
		balance -= 2.0;
	
	}
		
	
	
	
}
