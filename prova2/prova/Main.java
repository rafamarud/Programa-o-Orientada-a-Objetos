package Pratica;

import java.util.ArrayList;

public class Main {
	public static void main(String[]args) {
		
		ArrayList <Reserva> reserva = new ArrayList<>();
		
		
		Reserva r0 = new ReservaOnline("AAA", "1", 200,  "AAA", true);
		Reserva r1 = new ReservaOnline("BBB", "2", 250,  "BBB", true);
		Reserva r2 = new ReservaPresencial("CCC", "3", 200, true);
		Reserva r3 = new ReservaPresencial("DDD", "4", 100, true);
		
		reserva.add(r0);
		reserva.add(r1);
		reserva.add(r2);
		reserva.add(r3);
		
		
		
		for (Reserva  r  : reserva)
			r.realizarReserva();
		
		
		System.out.println("RESERVAS: ");
		for (Reserva  r  : reserva)
			r.exibirReserva();
		
		for (Reserva  r  : reserva)
			r.cancelarReserva();
	}
			
			
		
}

