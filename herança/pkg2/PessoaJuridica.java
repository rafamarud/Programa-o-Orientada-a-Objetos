package pkg2;

public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	private String socio;
	private String dtAbertura;
	
	public PessoaJuridica(String nome, String idade, String cnpj, String socio, String dtAbertura) {
		super(nome, idade);
		this.cnpj = cnpj;
		this.socio = socio;
		this.dtAbertura = dtAbertura;
	}
	
	public void exibirDados() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("CNPJ: "+this.cnpj);
		System.out.println("Socio: "+this.socio);
		System.out.println("dtAbertura: "+this.dtAbertura);
	}
	
}
