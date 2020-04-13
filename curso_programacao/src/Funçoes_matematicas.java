
public class Funçoes_matematicas {

	public static void main(String[] args) {
	double x = 3.0;
	double y = 4.0;
	double z = -5.0;
	double A, B, C, D, E, F, G, H;
	
	A = Math.sqrt(x);
	B = Math.sqrt(y);
	C = Math.sqrt(25);
	
	System.out.println(" Raiz quadrada de "+ x +"="+ A);
	System.out.println(" Raiz quadrada de "+ y +"="+ B);
	System.out.println(" Raiz quadrada de 25 ="+ C);
	
	D = Math.pow(x,y);
	E = Math.pow(y, 2.0);
	F = Math.pow(5.0, 2.0);
	
	System.out.println( x + " elevado a " + y +"="+ D);
	System.out.println( y + " elevado ao quadrado " + "="+ E);
	System.out.println( "5 elevado a quadrado" + "="+ F);
	
	G = Math.abs(y);
	H = Math.abs(z);
	
	System.out.println(" Valor absoluto de " + y +"=" + G);
	System.out.println("Valor absoluto de " + z + "=" + H);
	}

}
