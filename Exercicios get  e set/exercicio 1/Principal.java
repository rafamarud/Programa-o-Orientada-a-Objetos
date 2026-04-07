package pkg1;

import java.util.Scanner;


public class Principal {
	
	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	ContaBancaria c = new ContaBancaria(5000,200);
	
	System.out.println("Saldo: "+c.getSaldo());
	System.out.println("Limite: "+c.getLimite());
	
	System.out.println("Digite um valor para sacar: ");
	double saque = teclado.nextDouble();
	c.saque(saque);
	
	System.out.println("Saldo atual: "+c.getSaldo());
	}

}
