package pkg;

public abstract class Animal {
	protected String especie;
	protected int idade;
	
	
	public Animal(String especie, int idade) {
		super();
		this.especie = especie;
		this.idade = idade;
	}



	public abstract void emiteSom();
	


	public abstract void exibirDados();
	
	
	
	
		
}
