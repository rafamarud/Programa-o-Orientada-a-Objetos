/*5 - Escreva um algoritmo que leia 3 valores pelo teclado e então informe qual o maior deles.*/

package pkg;

import java.util.Scanner; //import scanner

public class ex5 {
	
	public static void main(String[] args) {
	int num1, num2, num3;
	
	System.out.println("Informe 3 numeros inteiros diferentes de si");
	Scanner teclado = new Scanner(System.in);
	System.out.println("1. ");
	num1 = teclado.nextInt();
	System.out.println("2. ");
	num2 = teclado.nextInt();
	System.out.println("3. ");
	num3 = teclado.nextInt();
	
	if(num1 > num2 && num1 > num3) {
		System.out.println("O numero "+num1+" é o maior");
	}else if(num2 > num1 && num2 > num3) {
		System.out.println("O nummero "+num2+" é o maior");
	}else if(num3 > num1 && num3 > num2) {
		System.out.println("O numero "+num3+" é o maior");
	}else {
		System.out.println("Favor não digite numeros iguais");
	}

	}
}
