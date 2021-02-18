package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Alunos;
import Entidades.Disciplinas;

public class AplicacaoSuap {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		List<Alunos> list_alunos = new ArrayList<>(); // Declara list do tipo funcionario nome list.
		List<Disciplinas> list_disciplina = new ArrayList<>(); // Declara list do tipo funcionario nome list.
		
		System.out.print("Entre com o numero de Alunos: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println(" Nome do aluno: ");
			sc.nextLine();
			String nome = sc.nextLine(); // recebe variavel nome digitada atraves da captura sc.
			System.out.println(" Prontuario do aluno: ");
			sc.nextLine();
			String prontuario = sc.nextLine(); // recebe variavel nome digitada atraves da captura sc.
			System.out.print("Idade do aluno");
			int idade = sc.nextInt();
			Alunos aluno= new Alunos(nome, prontuario, idade); //Estanciei o meu aluno.
	    	list_alunos.add(aluno);
			System.out.print(" matricula na disciplina: ");
			String Nome_disciplina = sc.nextLine();
			String Prontuario = sc.nextLine();
		}
		for (Alunos aluno: list_alunos) {
			System.out.println( aluno.getNome() + aluno.getProntuario() + aluno.getIdade());
		}
		sc.close(); 
			
	}
	
}
