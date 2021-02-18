package estancias;

import entidades.ContaBancaria;
import entidades.ContaJuridica;
import entidades.ContaPoupanca;

public class AplicacaoBancaria2 {

	public static void main(String[] args) {
		
		ContaBancaria acc1 = new ContaBancaria(1001, "Alex", 1000.0);
		acc1.saque(200.0);
		System.out.println(acc1.getBalance());
        
		ContaBancaria acc2 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
		acc2.saque(200.0);
		System.out.println(acc2.getBalance());
	
		ContaBancaria acc3 = new ContaJuridica(1003, "Bob", 1000.0, 500.0);
		acc3.saque(200.0);
		System.out.println(acc3.getBalance());
	}

}
