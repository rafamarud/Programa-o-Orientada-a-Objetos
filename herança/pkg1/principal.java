package pkg1;

public class principal {
	public static void main (String[]args) {
		Cachorro c = new Cachorro();
		c.nome = "AA";
		c.idade = "2";
		c.som = "AUAUAU";
		
		c.exibeMsg();
		c.latir();
	}
}
