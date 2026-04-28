package pkg2;

public class Principal {
	public static void main (String[]args) {
		Pessoa p = new Pessoa("Rafael", "41");
		System.out.println("Dados pessoa fisica: ");
		p.exibirDados();
		
		System.out.println("\n");
		
		PessoaJuridica pj= new PessoaJuridica("Rafael", "20", "1011", "21314", "21314");
		System.out.println("Dados pessoa juridica: ");
		pj.exibirDados();
		
		System.out.println("\n");
		
		PessoaJuridica pj1= new PessoaJuridica("Joao", "60", "2222", "3333", "4444");
		System.out.println("Dados pessoa juridica 2: ");
		pj1.exibirDados();
	}
	
}
