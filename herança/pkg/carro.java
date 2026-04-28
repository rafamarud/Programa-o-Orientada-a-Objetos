package pkg;

public class carro {
	
	protected String nome;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void exibeMsg() {
		System.out.println("Estou na classe carro");
		System.out.println("Nome: "+this.nome);
		
	}

}
