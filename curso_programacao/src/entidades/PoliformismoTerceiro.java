package entidades;

public class PoliformismoTerceiro extends PoliformismoFuncionario {

	private Double adicional;
	
	public PoliformismoTerceiro() {
		super();
	}

	public PoliformismoTerceiro(String nome, Integer horas, Double valorHora, Double adicional) {
		super(nome, horas, valorHora);
		this.adicional = adicional;
	}

	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}
	
	@Override   //subscreve o método do poliformismo.
	public double pagamento() {
		return super.pagamento() + adicional * 1.1;
	}
	
	
}
