package pkg;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Pessoa p = new Pessoa();
		//p.nome = "Ricardo";
		//p.idade = 40;
		Pessoa p = new Pessoa("Ricardo", 40);
		//String nome;
		//nome = p.getNome();
		//System.out.println("Nome: "+nome);
		
		//int idade;
		//idade = p.getIdade();
		//System.out.println("Idade: "+idade);
		
		System.out.println("Nome: "+p.getNome());
		System.out.println("Idade: "+p.getIdade());
		
		String nome;
		System.out.println("Digite o novo nome: ");
		nome = teclado.nextLine();
		p.setNome(nome);
		
		int idade;
		System.out.println("Digite a nova idade: ");
		idade = teclado.nextInt();
		p.setIdade(idade);
		
		System.out.println("Novo nome: "+p.getNome());
		System.out.println("Nova idade: "+p.getIdade());
		
	}

}
