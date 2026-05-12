package exercícios;

import java.util.ArrayList;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
			
		Pessoa pessoa1 = new Pessoa("Joao", 30);
		Pessoa pessoa2 = new Pessoa("Maria", 25);
		Pessoa pessoa3 = new Pessoa("Pedro", 40);
		
		listaPessoas.add(pessoa1);
		listaPessoas.add(pessoa2);
		listaPessoas.add(pessoa3);
		
		exibirPessoas(listaPessoas);
	}
	
	
	public static void exibirPessoas(List<Pessoa> lista) {
		for(Pessoa p : lista) {
			System.out.println("Nome: "+p.getNome());
			System.out.println("Nome: "+p.getIdade());
		}
	}
}
