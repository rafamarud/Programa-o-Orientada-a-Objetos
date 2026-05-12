package pkg6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do desconto: ");
		double desconto = teclado.nextDouble();
		
		ProdutoDesconto p = new ProdutoDesconto(desconto);
		
		p.desconto(desconto);
		
		teclado.close();
	}

}
