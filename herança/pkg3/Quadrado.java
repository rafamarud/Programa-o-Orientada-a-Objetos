package pkg3;

public class Quadrado extends Desenho2d {
	protected String desc;

	public Quadrado(int largura, int altura, String desc, String nomeAutor) {
		super(largura, altura, nomeAutor);
		this.desc = desc;
	}
	
	public void exibirDados() {
		System.out.println("Largura: "+this.largura);
		System.out.println("Altura: "+this.altura);
		System.out.println("Descricao: "+this.desc);
		System.out.println("Autor: "+this.nomeAutor);
	}
}
