package pkg;

import java.util.Scanner;

public class Ex8laços {
	
public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome de uma cidade: ");
		
		for(int i = 0 ; i<50 ; i++) {
		    String palavra = teclado.nextLine();
			if(palavra.equals("Sao Paulo")) {
				System.out.println("Programa encerrado!!!");
				break;
			}
		}
	}

}
