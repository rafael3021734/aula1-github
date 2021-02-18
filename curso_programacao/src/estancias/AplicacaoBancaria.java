package estancias;

import entidades.ContaJuridica;
import entidades.ContaBancaria;
import entidades.ContaPoupanca;

public class AplicacaoBancaria {

	public static void main(String[] args) {
	  
		ContaBancaria acc = new ContaBancaria(1001, "Alex", 0.0);
		ContaJuridica bacc = new ContaJuridica(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING

		ContaBancaria acc1 = bacc;
		ContaBancaria acc2 = new ContaJuridica(1003, "Bob", 0.0, 200.0);
	    ContaBancaria acc3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);
	
	    //DOWNCASTING
	    
	    ContaJuridica acc4 = (ContaJuridica)acc2;
	    acc4.limite(100.0);
	    
	    
	    if (acc3 instanceof ContaJuridica) {
	    	ContaJuridica acc5 = (ContaJuridica)acc3;
	    	acc5.limite(200.0);
	    	System.out.println("Loan!");
	    	
	    }
	    
	    if (acc3 instanceof ContaPoupanca) {
	    	ContaPoupanca acc5 = (ContaPoupanca)acc3;
	    	acc5.updateBalance();
	    	System.out.println("update!");
	    }
	}

}
