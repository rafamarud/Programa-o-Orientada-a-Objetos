package pkg;

public class principal {

	public static void main(String[] args) {
		carro c = new carro();
		c.nome = "Fusca";
		c.exibeMsg();
		
		onibus o = new onibus();
		o.nome = "Marcopolo";
		o.setModelo("OM-1519");
		o.exibeMsg();
		
	}

}
