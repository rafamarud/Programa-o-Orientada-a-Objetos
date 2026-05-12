package aula12do5;

public class Principalpessoa {
	public static void main(String[]args) {
		Endereco end = new Endereco("Rua Andradas", 1614);
		//Pessoa2 p = new Pessoa2("UFN", 75, end);
		Pessoa2 p = new Pessoa2("UFN", 75, new Endereco("Rua Andradas", 1614));
		System.out.println("Nome: "+p.getNome());
		System.out.println("Idade: "+p.getIdade());
		System.out.println("Endereco: "+p.getEndereco());
		System.out.println("Endereco: "+p.getEndereco().toString());
		System.out.println("Rua: "+p.getEndereco().getRua());
		System.out.println("Numero: "+p.getEndereco().getNumero());
	}
}
