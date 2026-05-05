package Ex3polimorfismo;

import java.util.Scanner;

public class Principal {
	
	public static void main (String[]args) {
	Scanner teclado = new Scanner(System.in);
	
	Calculadora c = new Calculadora();
	
	int resultado = c.somar(4, 3);
	System.out.println("Resultado(2 parametros): "+resultado);
	
	resultado = c.somar(4,  7, 9);
	System.out.println("Resultado(3 parametros): "+resultado);
	
	double resultado2 = c.somar(3.5, 7);
	System.out.println("Resultado(2 parametros;double): "+resultado2);
	
	int resultado3 = c.mult(5, 8);
	System.out.println("Mult(2 parametros;int): "+resultado3);
	
	double resultado4 = c.mult(3.5, 2.5);
	System.out.println("Mult(2 parametros;double): "+resultado4);
	
	Pessoa p = new Pessoa("Rafael");
	
	p.dizerOla();
	
	System.out.println("Digite seu nome: ");
	String nome = teclado.nextLine();
	
	p.dizerOla(nome);
	
	}
}
