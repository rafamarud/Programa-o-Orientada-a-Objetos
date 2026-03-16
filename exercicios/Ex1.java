package pkg;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		float n1;
		n1 = teclado.nextFloat();
		
		System.out.println("Digite outro numero: ");
		float n2;
		n2 = teclado.nextFloat();
		
		float soma;
		soma = n1 + n2;
		
		float sub;
		sub = n1 - n2;
		
		float mult;
		mult = n1 * n2;
		
		float div;
		div = n1/n2 ;
		
		System.out.println("Soma= "+soma);
		System.out.println("Subtração= "+sub);
		System.out.println("Multiplicação= "+mult);
		System.out.println("Divisão= "+div);
				

	}

}
