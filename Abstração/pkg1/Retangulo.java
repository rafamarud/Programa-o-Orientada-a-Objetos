package pkg1;

public class Retangulo extends Forma {
	public double largura;
	public double altura;
	public Retangulo(double altura, double largura) {
		super();
		this.altura = altura;
		this.largura = largura;
	}
	@Override
	public double area() {
		return largura * altura;
		
	}
	@Override
	public double perimetro() {
		return 2 * (largura + altura);
		
	}
	
}
