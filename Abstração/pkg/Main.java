package pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Cachorro c = new Cachorro("GGGGG", 1, "Salsicha");	
		c.emiteSom();
		c.exibirDados();
		c.cuidarPatio();
		
		System.out.println("");
	
		Tigre t = new Tigre("Sei la", 2);
		t.emiteSom();
		t.exibirDados();
		
		
		System.out.println("");
		
		Animal a;
		int op;
		
		while (true) {
			System.out.println("Digite");
			System.out.println("1 para instanciar um cachorrou ou");
			System.out.println("2 para instanciar um tigre");
			op = teclado.nextInt();
			
			if(op == 1) {
				Cachorro a1 = new Cachorro("AAAA", 10, "Labrador");
				a1.emiteSom();
				a1.exibirDados();
				a1.cuidarPatio();
				System.out.println("");
				
			}else if (op == 2 ){
				a = new Tigre("asdsdasad", 12);
				a.emiteSom();
				a.exibirDados();
				System.out.println("");
				
			}else {
				break;
			}
		}

	}

}
