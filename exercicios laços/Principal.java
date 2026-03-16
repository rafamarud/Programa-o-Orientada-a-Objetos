package pkg;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um inteiro: \n");
		int n = teclado.nextInt();
		System.out.println("Int digitado: "+n);
		System.out.println("Digite um double: \n");
		double n1 = teclado.nextDouble();
		System.out.println("Double digitado: "+n1);
		System.out.println("Digite uma palavra para ler com nextline: \n");
		teclado.nextLine();
		String palavra = teclado.nextLine();
		System.out.println("Palavra digitado: "+palavra);
		System.out.println("Digite uma palavra para ler com next: \n");
		palavra = teclado.next();
		System.out.println("Palavra digitado com .next: "+palavra);
		teclado.close();
		
		for (int i = 0; i<10; i++) {
			//o i só existe aqui dentro
			System.out.println("i vale: "+i);	
		}
		int i = 0;
		while(i<10) {
			System.out.println("i vale com while: "+i);
			i++;
		}
		i = 0;
		do {
			System.out.println("I vale com do while: "+i);
			i++;
		}while(i<10);
	}
	

}
