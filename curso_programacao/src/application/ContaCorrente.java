package application;

import java.util.Locale;
import java.util.Scanner;
import exercicios81.ContaBancaria;

public class ContaCorrente {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	ContaBancaria conta1 = new ContaBancaria();
	
	int numeroConta = 10;
	String titular = scan.nextLine();
	double saldo = scan.nextDouble();
    
	conta1.setnumeroConta(numeroConta);
	
	conta1.settitular(titular);
	conta1.setsaldo(saldo);
	
	System.out.println(conta1.getnumeroConta());
	System.out.println(conta1.gettitular());
	System.out.println(conta1.getsaldo());
	

	scan.close();

	}

}