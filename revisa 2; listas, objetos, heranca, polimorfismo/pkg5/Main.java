package pkg5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Marca do netbook: ");
		String marcanet = teclado.nextLine();
		Netbook net = new Netbook(marcanet);
		
		net.exibeMarca(marcanet);
		
		System.out.println("Marco do netbook: ");
		String marcanot = teclado.nextLine();
		Notebook not = new Notebook(marcanot);
		
		not.exibeMarca(marcanot);
		
		teclado.close();

	}

}
