package application;

import java.util.Locale;
import java.util.Scanner;
import entidades.Triangle;
public class Programa_Sem_Orientacao_Objeto {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
	Triangle x, y;
	// estanciar (criar objeto).
	x = new Triangle();
	y = new Triangle();
	
	System.out.println("Enter the measure of triangle x: ");
	x.a = sc.nextDouble();
	x.b = sc.nextDouble();
	x.c = sc.nextDouble();
	System.out.println("Enter the measures of triangle y: ");
	y.a = sc.nextDouble();
	y.b = sc.nextDouble();
	y.c = sc.nextDouble();
	
	
	// x.area faz a chamada do metodo triangle.
	double areaX = x.area();
	double areaY = y.area();
	
	System.out.printf("Triangle x para area : %.4f%n", areaX);
	
	
	System.out.printf("Triangle y para area : %.4f%n", areaY);
	if (areaX > areaY) {
		System.out.println("A areaX � maior");
	}
	else {
		System.out.println("A areaY � maior");
	}
	sc.close(); 
	}

}
