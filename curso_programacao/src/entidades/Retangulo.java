package entidades;

import entidades.enums.Color;

public class Retangulo extends Forma {
	//Como esta classe retangulo não é uma classe abstrata então deve sobscresver o metodo abstrato da super classe (area).
	
	private Double base;
	private Double altura;
	
	public Retangulo() {
		super();
	}

	public Retangulo(Color color, Double base, Double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override 
	public double area() {
		return base * altura;
		
	}

	
}
