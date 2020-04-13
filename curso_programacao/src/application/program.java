package application;

import java.util.Scanner;

import estancias.teste1;

public class program {

	public static void main(String[] args) {
		 Scanner f = new Scanner(System.in);
		 
		 teste1 programa = new teste1("RAFAEL", "231000122895", 20);
		 teste1 programa2 = new teste1("LEANDRO", "3244566593", 17);
		 teste1 programa3 = new teste1("LEANDRO", "3244566593", 17);
		 teste1 programa4 = new teste1();
		 
		

				 
		 System.out.println("Nome: "+ programa.getNome() + "||cpf: " + programa.cpf + "|| Idade: " + programa.idade);
		 System.out.println("Nome: "+ programa2.getNome() + "||cpf: " + programa2.cpf + "|| Idade: " + programa2.idade);
		 
		 

	}

}
