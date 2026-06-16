package pkg2;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		List<Aluno> listaAlunos = new ArrayList<>();
		
	int opcao = 0;
	
	while (opcao != 3) {
	
	System.out.println("=== MENU INTERATIVO ===");
	
	System.out.println("1. Registrar aluno");
	System.out.println("2. Mostrar alunos");
	System.out.println("1. Encerrar programa");
	
	System.out.println("Escolha uma opcao(1 a 3): ");
	
	
	
	opcao = teclado.nextInt();
	switch(opcao) {
		case 1:
			System.out.println("Nome: ");
			String nome = teclado.nextLine();
			
			teclado.nextLine();
			
			System.out.println("Idade: ");
			int idade = teclado.nextInt();
			
			teclado.nextLine();
			
			Aluno novoAluno = new Aluno(nome, idade);
	        listaAlunos.add(novoAluno);
	        System.out.println("Aluno registrado com sucesso!");
	        break;
	        
		case 2:
			System.out.println("\n=== LISTA DE ALUNOS ===");
            if (listaAlunos.isEmpty()) {
                System.out.println("Nenhum aluno cadastrado ainda.");
            } else {
                
            	for(Aluno a : listaAlunos) {
        			System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade());
        		}
            }
            break;
            
            
		case 3:
			System.out.println("Encerrando o programa...");
			break;
			
			
			
		}
	}
		
	}	

}

