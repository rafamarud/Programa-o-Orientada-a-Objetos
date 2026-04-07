package pkg3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a largura do retangulo: ");
		double largura = teclado.nextDouble();
		System.out.println("Digite a altura do retangulo: ");
		double altura = teclado.nextDouble();
		Retangulo r = new Retangulo(altura, largura);
		
		System.out.println("Area do retangulo = "+r.calcularArea());

	}

}
