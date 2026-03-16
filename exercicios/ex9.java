/*•9 - Altere o exercício 1 e faça um menu utilizando switch case*/

package pkg;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
	int num1, num2, op, numt;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Informe 2 numeros");
	num1 = teclado.nextInt();
	num2 = teclado.nextInt();
	
	System.out.println("Informe a operação desejada:");
	System.out.println("1. Somma");
	System.out.println("2. Subtração");
	System.out.println("3. Multiplicação");
	System.out.println("4. Divisão");
	op = teclado.nextInt();
	
	switch(op) {
	case 1:
		numt = num1 + num2;
		System.out.println(num1+" + "+num2+" = "+numt);
		break;
	case 2:
		numt = num1 - num2;
		System.out.println(num1+" - "+num2+" = "+numt);
		break;
	case 3:
		numt = num1 * num2;
		System.out.println(num1+" * "+num2+" = "+numt);
		break;
	case 4:
		numt = num1 / num2;
		System.out.println(num1+" / "+num2+" = "+numt);
		break;
	}

	}

}
