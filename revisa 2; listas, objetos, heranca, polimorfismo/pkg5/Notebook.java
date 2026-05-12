package pkg5;

public class Notebook extends Computador {

	public Notebook(String marca) {
		super(marca, "Portatil");
		
	
	}
	public void exibeMarca(String marca) {
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
	}
	
}
