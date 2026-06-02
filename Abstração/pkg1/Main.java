package pkg1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Circulo: ");
		Circulo c = new Circulo(3.4);
		System.out.printf("Area: %.2f%n", c.area());
		System.out.printf("Perimetro: %.2f%n", c.perimetro());
		
		System.out.println("");
		
		System.out.println("Retangulo: ");
		Retangulo r = new Retangulo(5, 10);
		System.out.println("Area: "+r.area());
		System.out.println("Perimetro: "+r.perimetro());

	}

}
