package application;
import java.util.Locale;
import java.util.Scanner;

import estancias.product;

public class Estoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		product product = new product();
		
		System.out.println("enter product data: ");
		System.out.print("name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data" + product);
		
		System.out.println();
		System.out.print(" Enter the number of product to be added in stock: ");
		int quantity = sc.nextInt();
		product.addproducts(quantity); // atualiza quantidade dentro do objeto product.
		
		System.out.println();
		System.out.println("update data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("update data: " + product);
		
		sc.close();
		
	}

}
