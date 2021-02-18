package entidades;

public class ContaBancaria {

	 private Integer number;
	 private String holder;
	 protected Double balance;
	 
	 public ContaBancaria() {
		 
	 }
	public ContaBancaria(Integer number, String holder, Double balance) {
		  this.number = number;
		  this.holder = holder;
		  this.balance = balance;
		 }
	 
	 public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
    
	public void saque(double montante) {
         balance -= montante + 5.0;
	}
	
	public void deposito(double montante) {
	     balance += montante;
	
	}
	
	
}
