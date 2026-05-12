package ex1;

public class Retangulo extends Figura {
	private Double altura;
	private Double largura;
	
	public Retangulo(String cor, String preenchido, Double altura, Double largura) {
		super(cor, preenchido);
		this.altura = altura;
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}
	
	public void calcularArea() {
		double area = this.altura*this.largura;
		
		System.out.println("Area: "+area);
	}
	
	
}
