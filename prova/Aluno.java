package pkg;

public class Aluno {
	private String nome;
	private double nota;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public void aprovado(double nota) {
		if(this.nota >= 7) {
			 System.out.println("Aprovado!!");
		}else {
			 System.out.println("Reprovado!!");
		}
	}
	
	public void exibirInformacoes(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Nota: "+this.nota);
		
	}
	
	
	
}



