package Exaula5;

public class moto {
	
	public String marca;
	public String modelo;
	public String cilindrada;
	
	public void atribuirValores(String mar, String model, String cilin) {
		this.marca = mar;
		this.modelo = model;
		this.cilindrada = cilin;
	}
	
	public String[] retornarValores(){

		
		return new String[] {marca , modelo, cilindrada};
		
	}
}
