import java.util.Scanner;
public class Exercicio_Condicional1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	
	if( N < 0) {
		System.out.printf("É negativo");
	}
	else {
		System.out.printf("É positivo");
	}
	sc.close();
	}

}
