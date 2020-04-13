package estancias;

public class Product2 {

	public String nome;
	public double preco;
	public int quantidade;
	
	public double valorTotalEstoque() {
		return preco * quantidade;
	}
	public void addproduct(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removeproduct(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return nome + ", $ "
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ "units, Total: $"
				+ String.format("%.2f", valorTotalEstoque());
		
	}
}

