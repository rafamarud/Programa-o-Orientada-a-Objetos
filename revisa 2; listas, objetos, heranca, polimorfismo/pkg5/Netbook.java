package pkg5;

public class Netbook extends Computador {

	public Netbook(String marca) {
		super(marca, "Portatil");
		
	}
	
	public void exibeMarca(String marca) {
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
	}
	

}
