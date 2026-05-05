package Ex3polimorfismo;

public class Pessoa {
	public String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public void dizerOla() {
		System.out.println("Olá, "+nome);
		
	}
	public void dizerOla(String nome) {
		System.out.println("Olá, "+nome);
	}
}
