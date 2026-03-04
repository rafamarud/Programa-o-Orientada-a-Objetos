package pkg;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros em sequencia: ");
		int n1;
		int n2;
		int n3;
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		n3 = teclado.nextInt();
		
		
		if(n1>n2 && n1>n3) {
			System.out.println("O primeiro numero é o maor: "+n1);
		}else if(n2>n1 && n2>n3) {
			System.out.println("O segundou numero é o maior: "+n2);
		}else if(n3>n1 && n3>n2) {
			System.out.println("O terceiro numero é o maior: "+n3);
		}
		
	 }
	}
	
	
	
		
	
	
   
