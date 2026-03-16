package pkg;

import java.util.Scanner;

public class Matriz {

public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		for(int i = 0 ;i < matriz.length; i++ ) {
			for(int j = 0; j < matriz[i].length; j++) {
			System.out.println("Digite o elemento ["+i+"]["+j+"]\n");
			matriz[i][j] = teclado.nextInt();
			}
		}
		for(int i = 0 ;i < matriz.length; i++ ) {
			for(int j = 0; j < matriz[i].length; j++) {
			System.out.print("\t "+matriz[i][j]);
		
			}
			System.out.print("\n");
		}
	}
}
