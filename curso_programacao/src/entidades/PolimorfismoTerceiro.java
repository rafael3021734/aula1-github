package entidades;

public class PolimorfismoTerceiro extends PolimorfismoFuncionario {

	private Double adicional;
	
	public PolimorfismoTerceiro() {
		super();
	}

	public PolimorfismoTerceiro(String nome, Integer horas, Double valorHora, Double adicional) {
		super(nome, horas, valorHora);
		this.adicional = adicional;
	}

	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}
	
	@Override   //subscreve o método do polimorfismo.
	public double pagamento() {
		return super.pagamento() + adicional * 1.1;
	}
	
	
}
