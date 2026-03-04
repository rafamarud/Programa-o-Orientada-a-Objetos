package pkg;

import java.util.Scanner;

public class Ex6laços {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma sequencia de numeros: \n");
		
		for(int i=0 ; i<50 ; i++) {
			int n = teclado.nextInt();
			if(n == 0) {
				System.out.println("Programa encerrado!!!");
				break;
			}
		}
		
	}
}
