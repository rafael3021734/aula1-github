package estancias;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Color;

public class ExercMetodoAbstrato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Forma> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de forma: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Forma " + i + "dado: ");
			System.out.print("Retangulo ou circulo (R/C)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (Black/ Blue/ Red: ");
			Color color = Color.valueOf(sc.next()); // Converter que usuario digita para color .valueof.
					
			if (ch == 'r') {
				System.out.print("Base: ");
				double Base = sc.nextDouble();
				System.out.print("altura: ");
				double altura = sc.nextDouble();
				list.add(new Retangulo(color, Base, altura));
			}
			else {
				System.out.print(" Raio: ");
				double raio = sc.nextDouble();
			    list.add(new Circulo(color, raio));
			}
		}
		System.out.println();
		System.out.println("Forma Areas: ");
		for (Forma Forma: list) {
			System.out.println(String.format("%.2f", Forma.area()));
			
		}
		
		sc.close();
		

	}

}
