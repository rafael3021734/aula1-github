package application;

import java.util.Locale;
import java.util.Scanner;
import estancias.Exercicio3_nota;

public class ProgramaNotas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Exercicio3_nota estudante = new Exercicio3_nota();
		System.out.print("Digite o nome do aluno e suas respectivas notas");
		
		
		estudante.aluno = sc.nextLine();
		estudante.nota1 = sc.nextDouble();
		estudante.nota2 = sc.nextDouble();
		estudante.nota3 = sc.nextDouble();
		
		System.out.printf(" Nota Final : %.2f%n", estudante.primeiroTrimestre());
		
		if (estudante.media() < 60.0) {
			System.out.println("Failed");
			System.out.printf("missing %.2f points%n", estudante.media());
		}
		else {
			System.out.println("Pass");
		}
		sc.close();
		
		

	}

}
