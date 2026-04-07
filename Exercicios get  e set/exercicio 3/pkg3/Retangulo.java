package pkg3;

public class Retangulo {
	private double altura;
	private double largura;
	
	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public double getAltura() {
		return altura;
	}
	public double getLargura() {
		return largura;
	}
	
	public void setAltura() {
		this.altura = altura;
	}
	
	public void setLargura() {
		this.largura = largura;
	}
	
	public double calcularArea() {
		double area = this.altura * this.largura;
		return area;
	} 

}
