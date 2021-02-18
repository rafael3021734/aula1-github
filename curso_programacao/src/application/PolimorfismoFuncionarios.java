package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.PolimorfismoFuncionario;
import entidades.PolimorfismoTerceiro;

public class PolimorfismoFuncionarios {

	public static void main(String[] args) {
	      
		Scanner sc = new Scanner(System.in);
		List<PolimorfismoFuncionario> list = new ArrayList<>(); // Declara list do tipo funcionario nome list.
		
		System.out.print("Entre com o numero de funcionários: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Funcionário" + i + "dado: ");
			System.out.println("É Terceiro (S/N)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine(); // recebe variavel nome digitada atraves da captura sc.
			System.out.print("horas trabalhadas");
			int hora = sc.nextInt();
			System.out.print(" Valor por Hora: ");
			double valorHora = sc.nextDouble();
			
		    if (ch =='s') {
		    	System.out.print(" Valor adicional:");
		    	double adicional = sc.nextDouble();
		    	PolimorfismoFuncionario func = new PolimorfismoTerceiro(nome, hora, valorHora, adicional); //Estanciei o meu funcionario.
		    	list.add(func);
		    }
		    else {
		    	PolimorfismoFuncionario func = new PolimorfismoFuncionario(nome, hora, valorHora);
		    	list.add(func);
		    }
		}
        
		System.out.println();
		System.out.println("pagamento: ");
		for (PolimorfismoFuncionario func: list) {
			System.out.println( func.getNome() + "- $" + String.format("%.2f", func.pagamento()));
		}
		sc.close(); 
	}

}
