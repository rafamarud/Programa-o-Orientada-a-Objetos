package pkg2;

public class Cachorro implements Animal {
	public String nome;
	public String raca;
	public int idade;
	public boolean vacina;
	
	public Cachorro(String nome, String raca, int idade) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		
	}

	public void emitirSom() {
		System.out.println("AUAUAU");
	}

	@Override
	public void exibirInfo() {
		System.out.println("Nome: "+nome);
		System.out.println("Raca: "+raca);
		System.out.println("Idade: "+idade);
		
		
	}

	@Override
	public boolean verificarVacina() {
		System.out.println("Verificando vacinação do cachorro...");
		return false;
	}
	
}
