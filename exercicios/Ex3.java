package pkg;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);	
		
		System.out.println("Primeiro valor= ");
		float n1;
		n1 = teclado.nextFloat();
		
		System.out.println("Segundo valor= ");
		float n2;
		n2 = teclado.nextFloat();
		
		System.out.println("Terceiro valor= ");
		float n3;
		n3 = teclado.nextFloat();
		
		System.out.println("Quarto valor= ");
		float n4;
		n4 = teclado.nextFloat();
		
		float mult;
		mult = n1 * n2 * n3* n4;
		
		float media;
		media = mult/4;
		
		System.out.println("Media dos 4 valores = "+media);
		

	}

}

