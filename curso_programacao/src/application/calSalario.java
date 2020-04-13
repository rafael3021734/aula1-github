package application;

import java.util.Locale;
import java.util.Scanner;
import estancias.Exercicio2_Salario;

public class calSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Exercicio2_Salario salario = new Exercicio2_Salario();
		System.out.print("Name: ");
		salario.nome = sc.nextLine();
		System.out.print("Gross salary:"); 
		salario.glossSalary = sc.nextDouble();
		System.out.print("Tax:");
		salario.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf(" Employee:"+ salario); 
		System.out.println();
		System.out.println("which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		salario.increaseSalary(percentage);
		System.out.println();
		System.out.println("Update data: " + salario);
		
		sc.close();
	}

}
