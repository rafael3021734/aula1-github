package estancias;

public class Exercicio3_nota {
	
	public String aluno;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double primeiroTrimestre() {
		return nota1 + nota2 + nota3;	
	}
	public double media(){
		if(primeiroTrimestre() >= 60) {
			return 60 - primeiroTrimestre();
		}
		else {
			return 0.0;
		}
		
	}
}
