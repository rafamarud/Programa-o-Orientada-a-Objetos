package pkg;

import java.util.Scanner;

public class Ex5laços {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero: \n");
		int n = teclado.nextInt();
		
		int fatorial = 1;
		
		for(int i = 1 ; i<=n ; i++) {
			
			fatorial *= i;
		}
		
		System.out.println("Fatorial: "+fatorial);
		
	}
}
