package pkg3;

public class Desenho2d extends Desenho {
	protected int largura;
	protected int altura;
	public Desenho2d(int largura, int altura, String nomeAutor) {
		super(nomeAutor);
		this.largura = largura;
		this.altura = altura;
	}

}
