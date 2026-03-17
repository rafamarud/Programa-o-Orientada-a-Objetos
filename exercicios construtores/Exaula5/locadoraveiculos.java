package Exaula5;

import java.util.Scanner;

public class locadoraveiculos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		carro c = new carro("Vw","Gol");
		
		carro c4 = new carro("Ford");
		
		System.out.println("Marca do carro: "+c.marca);
		System.out.println("Modelo do carro: "+c.modelo);
		
		System.out.println("\n");
		
		String marca,modelo;
		System.out.println("Digite a marca do carro: ");
		marca=teclado.nextLine();
		
		System.out.println("Digite o modelo do carro: ");
		modelo=teclado.nextLine();
		
		System.out.println("Marca do carro 4: "+c4.marca);
		
		
		
		carro c2 = new carro(marca,modelo);
		
		
		
		System.out.println("Marca do carro 2: "+c2.marca);
		System.out.println("Modelo do carro 2: "+c2.modelo);
		
		System.out.println("\n");
		
		
		System.out.println("Digite a marca e modelo do carro: ");
		carro c3 = new carro(teclado.nextLine(),teclado.nextLine());
		System.out.println("Marca do carro 3: "+c3.marca);
		System.out.println("Modelo do carro 3: "+c3.modelo);
		
		System.out.println("\n");
		
		
		
		
	
	}
}
