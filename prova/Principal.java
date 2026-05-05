package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Menu\n");
		
		System.out.println("1: Criar aluno");
		System.out.println("2: Exibir informaçoes");
		System.out.println("3: Atribuir nota");
		System.out.println("4: Obter nota");
		System.out.println("5: Atribuir nome");
		System.out.println("6: Obter nome");
		System.out.println("7: Verificar aprovacao");
		System.out.println("0: Sair");
		
		System.out.println("Digite a opcao desejada: ");
		int tipo = teclado.nextInt();
		
		
		
		if(tipo == 1) {
			do {
			System.out.println("Insira o nome do aluno: ");
			String nome = teclado.nextLine();
			teclado.nextLine();
			
			System.out.println("Insira a nota do aluno: ");
			double nota = teclado.nextDouble();
			teclado.nextLine();
			
			Aluno a1 = new Aluno(nome, nota);
			
			
			System.out.println("Digite a opcao desejada: ");
			 tipo = teclado.nextInt();
			
			if(tipo == 2) {
				a1.exibirInformacoes();
				System.out.println("Digite a opcao desejada: ");
				 tipo = teclado.nextInt();
			}
			
			if(tipo == 3) {
				System.out.println("Digite uma nova nota: ");
				nota = teclado.nextDouble();
				a1.setNota(nota);
				System.out.println("Digite a opcao desejada: ");
				 tipo = teclado.nextInt();
			}
		
			if(tipo == 4) {
				a1.getNota();
				System.out.println("Nota: "+a1.getNota());
				teclado.nextLine();
				System.out.println("Digite a opcao desejada: ");
				 tipo = teclado.nextInt();
			}
			
			if(tipo == 5) {
				System.out.println("Digite um novo nome: ");
				nome = teclado.nextLine();	
				a1.setNome(nome);
				teclado.nextLine();
				System.out.println("Digite a opcao desejada: ");
				 tipo = teclado.nextInt();
				 teclado.nextLine();
			}
			
			if(tipo == 6) {
				a1.getNome();
				System.out.println("Nome: "+a1.getNome());
				System.out.println("Digite a opcao desejada: ");
				 tipo = teclado.nextInt();
			}
			
			if(tipo == 7) {
				a1.aprovado(nota);
				System.out.println("Digite a opcao desejada: ");
				 tipo = teclado.nextInt();
			}
			
			
			}while (tipo != 0);
		}else {
			System.out.println("Nenhum aluno cadastrado.");
		}
	}
}



