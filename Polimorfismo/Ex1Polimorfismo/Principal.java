package Ex1Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Animal: ");
		Animal a = new Animal();
		a.fazerSom();
		System.out.println("Cachorro: ");
		Cachorro c = new Cachorro();
		c.fazerSom();
		
		a = new Cachorro();
		a.fazerSom();
		
		Passarinho p = new Passarinho();
		p.fazerSom();
		
		Peixe p1 = new Peixe();
		p1.fazerSom();
		
	}

}
