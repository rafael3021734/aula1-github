package estancias;

public class Exercicio2_Salario {
	public String nome;
	public double glossSalary;
	public double tax;
	
	public double netSalary() {
		return glossSalary - tax;
	}
	public void increaseSalary(double percentage) {
		glossSalary  += glossSalary * percentage/100;
		
	}
	public String toString() {
		return nome + ", $" + String.format("%.2f", netSalary());
	}
}

