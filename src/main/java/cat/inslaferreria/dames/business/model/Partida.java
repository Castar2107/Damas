package cat.inslaferreria.dames.business.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "partides")
public class Partida {
	@Indexed(unique = true)
	Reserva partida;
	int resultat; // 1 0 2 (Com a La Travessa), 0 = taules/empat
}
