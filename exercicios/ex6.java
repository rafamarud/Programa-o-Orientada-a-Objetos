/*6 - Ajuste o exercício 5 de maneira que mostre os valores informados em ordem crescente.*/
package pkg;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
			int[] sequenciaMaior;
			
			sequenciaMaior = new int[3];
			
			System.out.println("Informe 3 numeros inteiros diferentes de si");
			Scanner teclado = new Scanner(System.in);
			System.out.println("1. ");
			sequenciaMaior[0] = teclado.nextInt();
			System.out.println("2. ");
			sequenciaMaior[1] = teclado.nextInt();
			System.out.println("3. ");
			sequenciaMaior[2] = teclado.nextInt();
		
			for(int i = 0; i < sequenciaMaior.length; i++) {
				for(int j = 0; j < sequenciaMaior.length -1; j++) {
					if(sequenciaMaior[j] > sequenciaMaior[j+1]) {
						int temp = sequenciaMaior[j];
						sequenciaMaior[j] = sequenciaMaior[j+1];
						sequenciaMaior[j+1] = temp;
					}
					
				}
			}

	}
}
