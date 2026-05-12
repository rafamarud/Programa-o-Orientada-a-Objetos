package pkg3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		
	
		System.out.println("Digite sua mensagem: ");
		String mensagem = teclado.nextLine();
		
		System.out.println("Quantas vezes voce deseja ver a mensagem?: ");
		int i = teclado.nextInt();
		
		p.falar(mensagem);
		
		System.out.println("\n");
		
		p.falar(mensagem, i);
		

	}

}
