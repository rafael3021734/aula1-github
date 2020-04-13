package exercicios81;

public class ContaBancaria {
	private int numeroConta;
	private String titular;
	private double saldo;
	
	public ContaBancaria(){
		
	}
	public ContaBancaria(int numeroConta, String titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	public ContaBancaria(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}

	public void setnumeroConta(int numeroConta){
		this.numeroConta = numeroConta;
	}
	public int getnumeroConta() {
		return numeroConta;
	}
	public void settitular(String titular) {
		this.titular = titular;
	}
	public String gettitular() {
		return titular;
		
	}
	public void setsaldo(double saldo) {
		this.saldo = saldo;
		
	}
	public double getsaldo() {
		return saldo;
	}
	public String toString() {
		return "numero da conta" + getnumeroConta();
	}
}
