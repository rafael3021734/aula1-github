package entidades;

public class ContaPoupanca extends ContaBancaria {

	private Double taxaJuros;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer number, String holder, Double balance, Double taxaJuros) {
		super(number, holder, balance);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void updateBalance() {
		balance += balance * taxaJuros;
	}
	
    @Override
	public void saque(double montante) {
         balance -= montante;
    }
}
