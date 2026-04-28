package pkg2;

public class Pessoa {
	protected String nome;
	protected String idade;
	
	public Pessoa(String nome, String idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public void exibirDados() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
	}
	
	
}
