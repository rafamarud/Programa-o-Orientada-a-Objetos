package pkg;

public class Retangulo {

	public Float largura;
	public Float altura;
	
	public Retangulo(Float largura, Float altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	float calcularArea() {
		return largura * altura; 
	}
	float calcularPerimetro() {
		return (largura * 2) + (altura *2);
	}
	
	float calcularDiagonal() {
		return (float) Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
		
	}
	
	boolean ehQuadrado() {
		return altura == largura;
	}
	
	public static void main (String[]args) {
		
		
		Retangulo r1 = new Retangulo(15f, 10f);
		
		
	System.out.println("Area: "+r1.calcularArea());
	
	System.out.println("Perimetro: "+r1.calcularPerimetro());
	
	System.out.println("Area: "+r1.calcularDiagonal());
	
	System.out.println("Quadrado?: "+r1.ehQuadrado());
	
}
	
	
}
