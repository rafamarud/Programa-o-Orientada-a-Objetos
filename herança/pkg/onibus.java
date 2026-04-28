package pkg;

public class onibus extends carro {
	
	private String modelo;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
		
	}
	
	@Override
	public void exibeMsg() {
		System.out.println("Estou na classe onibus");
		System.out.println("Modelo: "+this.modelo);
	}

}
