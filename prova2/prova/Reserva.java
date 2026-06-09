package Pratica;

public class Reserva {
	protected String nomeCliente;
	protected String numeroQuarto;
	protected float valorDiaria;
	protected boolean statusReserva;
	
	public Reserva(String nomeCliente, String numeroQuarto, float valorDiaria, boolean statusReserva) {
		super();
		this.nomeCliente = nomeCliente;
		this.numeroQuarto = numeroQuarto;
		this.valorDiaria = valorDiaria;
		this.statusReserva = statusReserva;

	}
	
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}



	public String getNumeroQuarto() {
		return numeroQuarto;
	}



	public void setNumeroQuarto(String numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}



	public float getValorDiaria() {
		return valorDiaria;
	}



	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}


	public void realizarReserva() {
		
	}
	

	public void cancelarReserva() {
		
	}



	public void realizarReserva(ReservaOnline reservaonline) {
	}
	
	public void realizarPresencial(ReservaPresencial resrvapresencial) {
		
		
	}
	
	public void exibirReserva() {
		System.out.println("Nome: "+this.nomeCliente);
		System.out.println("N. do quarto: "+numeroQuarto);
		System.out.println("Valor da diaria: "+valorDiaria);
		System.out.println("Status da reserva: "+statusReserva);
	}
		
	
	
	
}
