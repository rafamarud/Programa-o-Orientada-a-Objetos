package pkg6;

public class Produto {
	protected double preco;
	protected double desconto;
	
	public Produto(double preco, double desconto) {
			this.desconto = desconto;
			this.preco = preco;
	}
		
	public void desconto(double desconto) {
		double precoFinal = this.preco - desconto;
		System.out.println("Desconto aplicado ao produto: "+desconto);
		System.out.println("Valor Final do produto: "+precoFinal);
	}
}
