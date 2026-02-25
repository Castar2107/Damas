package cat.inslaferreria.dames.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cat.inslaferreria.dames.model.Partida;
import cat.inslaferreria.dames.model.Reserva;

@Repository
public interface PartidaRepository extends MongoRepository <Partida, String>{
	Optional<Partida> findByReserva (Reserva reserva);
}
