package pkg4;

public class Casa {
	public int tamanho;
	public int numeroquartos;
	
	public Casa(int tamanho, int numeroquartos) {
		this.tamanho = tamanho;
		this.numeroquartos = numeroquartos;
	}
	
	public void calcularPreco(){
			int valor = this.tamanho * this.numeroquartos* 100000;
			System.out.println("Valor da casa: " +valor);
	}
}
