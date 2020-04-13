package application;

import java.util.Locale;
import java.util.Scanner;
import estancias.Rectangle;

public class CalcRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle retangulo1 = new Rectangle();
		
		System.out.println("Enter rectangle width and height");
		retangulo1.width = sc.nextDouble();
		retangulo1.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", retangulo1.area());
		System.out.printf("perimetro = %.2f%n", retangulo1.perimetro());
		System.out.printf("Diagonal = %.2f%n", retangulo1.diagonal());
		
		
		
		
	}

}
