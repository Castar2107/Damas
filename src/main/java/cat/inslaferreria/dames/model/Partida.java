package cat.inslaferreria.dames.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "partides")
public class Partida {
	@Indexed(unique = true)
	Reserva partida;
	int resultat; // 1 0 2 (Com a La Travessa/La Quiniela), 0 = taules/empat
	
	public Partida() {}
	
	public Partida(Reserva partida, int resultat) {
		this.partida = partida;
		this.resultat = resultat;
	}

	public Reserva getPartida() {
		return partida;
	}

	public void setPartida(Reserva partida) {
		this.partida = partida;
	}

	public int getResultat() {
		return resultat;
	}

	public void setResultat(int resultat) {
		this.resultat = resultat;
	}
	
}
