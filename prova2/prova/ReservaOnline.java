package Pratica;

public class ReservaOnline extends Reserva {
	
	private String cupomDesconto;
	
	public ReservaOnline(String nomeCliente, String numeroQuarto, float valorDiaria,String cupomDesconto, boolean statusReserva) {
		super(nomeCliente, numeroQuarto, valorDiaria, statusReserva);
		this.cupomDesconto = cupomDesconto;
	}
	
	
public String getCupomDesconto() {
		return cupomDesconto;
	}


	public void setCupomDesconto(String cupomDesconto) {
		this.cupomDesconto = cupomDesconto;
	}


@Override
public void realizarReserva() {
	System.out.println("Realizar realizada: ");
	System.out.println("Nome: "+this.nomeCliente);
	System.out.println("Cupom de desconto: "+this.cupomDesconto);
	System.out.println("Status da reserva: "+statusReserva);
	System.out.println("\n");
}

public void cancelarReserva() {
	System.out.println("RESERVA ONLINE: ");
	System.out.println("O cancelamento só pode ocorrer até 24h antes da hospedagem!");
	System.out.println("Nome: "+this.nomeCliente);
	System.out.println("N. do quarto: "+numeroQuarto);
	System.out.println("Valor da diaria: "+valorDiaria);
	System.out.println("Cupom de desconto: "+this.cupomDesconto);
	System.out.println("Status da reserva: "+(statusReserva == false));
	System.out.println("\n");
}

public void exibirReserva() {
	System.out.println("RESERVA ONLINE: ");
	System.out.println("Nome: "+this.nomeCliente);
	System.out.println("N. do quarto: "+numeroQuarto);
	System.out.println("Valor da diaria: "+valorDiaria);
	System.out.println("Cupom de desconto: "+this.cupomDesconto);
	System.out.println("Status da reserva: "+statusReserva);
	System.out.println("\n");
}
	
}
