package pkg;

public class Cachorro extends Animal {
	
	public String raça;
	
	public Cachorro(String especie, int idade, String raça) {
		super(especie, idade);
		this.raça = raça;
	}

	public void emiteSom() {
		System.out.println("AUAUAU");
	}

	@Override
	public void exibirDados() {
		System.out.println("Especie: "+especie);
		System.out.println("Idade: "+idade);
		System.out.println("Raça: "+raça);
		
	}

	public void cuidarPatio() {
		System.out.println("Cuidando do patio...");
		
	}

	
		
}
	
	

