package pkg2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		Cachorro c = new Cachorro("Rodolfo", "Salsicha", 2);
		
		c.emitirSom();
		c.exibirInfo();
		System.out.println("Chamando verificacao cahorro: "+c.verificarVacina());
		
		System.out.println("");
		
		Gato g = new Gato();
		g.emitirSom();
		g.exibirInfo();
		System.out.println("Chamando verificacao gato: "+g.verificarVacina());
	}

}
