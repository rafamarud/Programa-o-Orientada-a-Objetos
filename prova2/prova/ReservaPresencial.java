package Pratica;

public class ReservaPresencial extends Reserva {

	public ReservaPresencial(String nomeCliente, String numeroQuarto, float valorDiaria, boolean statusReserva) {
		super(nomeCliente, numeroQuarto, valorDiaria, statusReserva);
		
	}
	
	public void realizarReserva() {
		System.out.println("Reserva realizada!");
		System.out.println("Nome: "+nomeCliente);
		System.out.println("N. do quarto: "+numeroQuarto);
		System.out.println("Valor da diaria: "+valorDiaria);
		System.out.println("Status da reserva: "+statusReserva);
		System.out.println("\n");
	}
	

	public void cancelarReserva() {
		System.out.println("RESERVA PRESENCIAL: ");
		System.out.println("O cancelamento pode ser realizado diretamente na recepção");
		System.out.println("Nome: "+nomeCliente);
		System.out.println("N. do quarto: "+numeroQuarto);
		System.out.println("Valor da diaria: "+valorDiaria);
		System.out.println("Status da reserva: "+(statusReserva == false));
		System.out.println("\n");
	}
	
	public void exibirReserva() {
		System.out.println("RESERVA PRESENCIAL: ");
		System.out.println("Nome: "+this.nomeCliente);
		System.out.println("N. do quarto: "+numeroQuarto);
		System.out.println("Valor da diaria: "+valorDiaria);
		System.out.println("Status da reserva: "+statusReserva);
		System.out.println("\n");
	}
}
