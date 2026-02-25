package cat.inslaferreria.dames.model;

import java.util.Date;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "reserves")
public class Reserva {
	@Id
	String id;
	Soci jugador1;
	Soci jugador2;
	Taula taula;
	Date dataReserva;
	
	public Reserva() {}
	
	public Reserva(Soci jugador1, Soci jugador2, Taula taula, Date dataReserva) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.taula = taula;
		this.dataReserva = dataReserva;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Soci getJugador1() {
		return jugador1;
	}

	public void setJugador1(Soci jugador1) {
		this.jugador1 = jugador1;
	}

	public Soci getJugador2() {
		return jugador2;
	}

	public void setJugador2(Soci jugador2) {
		this.jugador2 = jugador2;
	}

	public Taula getTaula() {
		return taula;
	}

	public void setTaula(Taula taula) {
		this.taula = taula;
	}

	public Date getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}
	
}
