import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		String nome = "maria";
		int idade = 31;
		double renda = 4000.0;
		int y= 32;
		double x= 10.35784;
		// TODO Auto-generated method stub
		System.out.println(y);
		System.out.printf("%.2f%n", x);
		System.out.println("Ola mundo");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		//concatenação
		
		System.out.println("resultado= " + x + " METROS");
		System.out.printf("resultado = %.2f metros%n",  x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
