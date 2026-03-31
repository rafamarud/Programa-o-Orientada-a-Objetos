package pkg;


public class Produto {
	
	public String nome;
	public Float preco;
	public Float quantidade;
	
	public Produto(String nomeProd,Float precoProd, Float quantidadeProd) {
		this.nome = nomeProd;
		this.preco = precoProd;
		this.quantidade= quantidadeProd;
	}
	public float calcularValorTotalEstoque() {
		return quantidade * preco;
	}
	
	public boolean temEstoque() {
		return quantidade > 0;
	}
	
	public void adicionarEstoque(int quantidadeAdicionar) {
        if (quantidadeAdicionar > 0) {
            this.quantidade += quantidadeAdicionar;
            System.out.println("Estoque atualizado: " + this.quantidade);
        }
    }
	
	public void venderEstoque(int quantidadeVender) {
		if (quantidadeVender > 0 && this.quantidade >= quantidadeVender) {
			this.quantidade -= quantidadeVender;
			 System.out.println("Estoque atualizado: " + this.quantidade);
		}else {
			System.out.println("Estoque insuficiente!");
		}
	}
	
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("XXX", 200f, 0f);
		
		System.out.println("Produto: " + p1.nome);
        System.out.println("Valor total em estoque: " + p1.calcularValorTotalEstoque());
        
        p1.adicionarEstoque(13);
        p1.venderEstoque(3);
        
        System.out.println("Quantidade final: " + p1.quantidade);
    }
}
		
	

	
	
