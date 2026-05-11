package pkg1;

public class Triangulo extends FormaGeometrica {
	public double base;
	public double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
		public void calcularArea() {
			double area = (base*altura)/2;
			System.out.println("Area do triangulo: " + area);
		}
	}
	
