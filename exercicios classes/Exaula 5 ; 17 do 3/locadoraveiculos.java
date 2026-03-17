package Exaula5;

import java.util.Scanner;

public class locadoraveiculos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		carro d = new carro();
		
		System.out.println("Digite a marca do carro: ");
		d.marca = teclado.nextLine();
		
		System.out.println("Digite o modelo do carro ");
		d.modelo = teclado.nextLine();
		
		d.dados(d.marca, d.modelo);
		
		String[] dadosDoCarro = d.retornaCarro();
		
		
		System.out.println("\n");
		
		
		moto m1 = new moto();
		
		System.out.println("Digite a marca da moto 1: ");
		m1.marca = teclado.nextLine();
		
		System.out.println("Digite o modelo da moto 1: ");
		m1.modelo = teclado.nextLine();
		
		System.out.println("Digite a cilindrada da moto 1: ");
		m1.cilindrada = teclado.nextLine();
		
		m1.atribuirValores(m1.marca, m1.modelo, m1.cilindrada);
		
		String[] dadosm1 = m1.retornarValores();
		
		
		
		System.out.println("\n");
		
		
		
		moto m2 = new moto();
		
		System.out.println("Digite a marca da moto 2: ");
		m2.marca = teclado.nextLine();
		
		System.out.println("Digite o modelo da moto 2: ");
		m2.modelo = teclado.nextLine();
		
		System.out.println("Digite a cilindrada da moto 2: ");
		m2.cilindrada = teclado.nextLine();
		
		m2.atribuirValores(m2.marca, m2.modelo, m2.cilindrada);
		
		String[] dadosm2 = m2.retornarValores();
		
		
		System.out.println("Dados do carro: ");
   
        System.out.println("Marca: " +d.retornaCarro());
        System.out.println("Modelo: " + dadosDoCarro[1]);
	
        System.out.println("------------------");
		
		System.out.println("Dados moto 1: ");
		
		System.out.println("Marca: " + dadosm1[0]);
		System.out.println("Modelo: " + dadosm1[1]);
		System.out.println("Cilindrada: " + dadosm1[2]);	
		
		
		System.out.println("------------------");
		
		System.out.println("Dados moto 2: ");
		
		System.out.println("Marca: " + dadosm2[0]);
		System.out.println("Modelo: " + dadosm2[1]);
		System.out.println("Cilindrada: " + dadosm2[2]);	
		

	}

	
		
	

}
