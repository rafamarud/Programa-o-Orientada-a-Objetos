package pkg2;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
	
		System.out.println("Digite o raio do circulo(em cm): ");
		double raio = teclado.nextDouble();
		Circulo c = new Circulo(raio);
		
		
		System.out.println("Area do circulo: "+c.calcularArea());
		
		
		
	}

}
