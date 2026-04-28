package pkg1;

public class Animal {
	
	protected String nome;
	protected String idade;
	protected String som;
	
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
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	
	public void exibeMsg() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
	}
	
	

}
