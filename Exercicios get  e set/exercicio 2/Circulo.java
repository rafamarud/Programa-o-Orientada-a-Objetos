package pkg2;

public class Circulo {
	
	private double raio;
	
	public Circulo (double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
}
	
	public double calcularArea() {
		double area = 3.14 * (this.raio * this.raio);
		return area;
	}
	
	
}
