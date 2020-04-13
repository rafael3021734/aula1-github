package application;

import java.util.Locale;
import java.util.Scanner;
import estancias.Product2;
public class ProdutosEstoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner b = new Scanner(System.in);
		
		Product2 produto1 = new Product2();
		 System.out.println("Enter product data");
		 System.out.print("nome: ");
		 produto1.nome = b.nextLine();
		
		 System.out.print("Qual o preço: ");
		 produto1.preco = b.nextDouble();
		 
		 System.out.print("Quantidade no estoque: ");
		 produto1.quantidade = b.nextInt();
		 
		 System.out.println();
		 System.out.println("Dados do produto: " + produto1);
		
		 System.out.println();
		 System.out.print("Entre o numero de produtos para ser adicionado" );
		 int quantidade = b.nextInt();
		 produto1.addproduct(quantidade);
		 
		 System.out.println();
		 System.out.print("update dados" + produto1);
		 
		 System.out.println();
		 System.out.print("Entre com o numero de produtos para remover");
		 quantidade = b.nextInt();
		 produto1.removeproduct(quantidade);
		 
		 System.out.println("update dados " + produto1);
		 
		 b.close();
		 
		 
		 
		

	}

}
