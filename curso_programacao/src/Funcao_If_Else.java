import java.util.Scanner;
public class Funcao_If_Else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preco = sc.nextDouble();
	double desconto;
	if(preco>20.0) {
		desconto = preco * 0.1;
	}
	else {
		desconto = preco * 0.05;
	}
    System.out.printf("O desconto e: %.2f%n", desconto);
    
	}

}
