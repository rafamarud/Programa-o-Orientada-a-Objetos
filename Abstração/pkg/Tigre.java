package pkg;

public class Tigre extends Animal {

	
	
	public Tigre(String especie, int idade) {
		super(especie, idade);
		
	}

	public void emiteSom() {
		System.out.println("GROOOOW");
		
	}

	@Override
	public void exibirDados() {
		System.out.println("Especie: "+especie);
		System.out.println("Idade: "+idade);
		
	}

	
	
		
	}

