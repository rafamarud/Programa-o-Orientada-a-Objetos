package pkg;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	
		
		System.out.println("Digite um ponto (x,y): ");
		int ponto1, ponto2;
		ponto1 = teclado.nextInt();
		ponto2 = teclado.nextInt();
		
		
		if(ponto1 > 0 && ponto2 > 0) {
			System.out.println("O ponto se econtra no primeiro quadrante.");
		}else if(ponto1 < 0 && ponto2 > 0) {
			System.out.println("O ponto se econtra no segundo quadrante.");
		}else if(ponto1 < 0 && ponto2 < 0) {
			System.out.println("O ponto se econtra no terceiro quadrante.");
		}else {
			System.out.println("O ponto se econtra no quarto quadrante.");
		}
		
		

	}

}
