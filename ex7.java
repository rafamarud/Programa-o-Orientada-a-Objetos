/*7 - Escreva um algoritmo que leia dois valores pelo teclado e informe se os mesmos são múltiplos um do outro ou não.*/

package pkg;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe dois numeros ");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println(num1+" e "+num2+" são multiplos");
		}else {
			System.out.println("Nao são multiplos");
		}
		
	}
}
