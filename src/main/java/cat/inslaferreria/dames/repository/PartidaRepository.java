package cat.inslaferreria.dames.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cat.inslaferreria.dames.model.Partida;
import cat.inslaferreria.dames.model.Reserva;
import cat.inslaferreria.dames.model.Soci;

@Repository
public interface PartidaRepository extends MongoRepository <Partida, String>{
	Optional<Partida> findByReserva (Reserva reserva);
	List<Partida> findByJugador1 (Soci jugador1); // A veure si sona la flauta...
	List<Partida> findByJugador1AndJugador2 (Soci jugador1, Soci jugador2); // Ídem
}
