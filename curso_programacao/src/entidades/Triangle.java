package entidades;

public class Triangle {

	//Declara��o atributos da classe.
	public double a;
	public double b;
	public double c;
// esta fun��o publica retorna uma dado double e que nao recebe nao recebe parametros dentro parenteses.
	
	public double area() {
		double p = (a + b + c)/ 2.0;
		return  Math.sqrt(p * (p - a)*(p - b)* (p - c));
	}
}

