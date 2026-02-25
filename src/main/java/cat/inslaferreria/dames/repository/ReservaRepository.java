package cat.inslaferreria.dames.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cat.inslaferreria.dames.model.Reserva;
import cat.inslaferreria.dames.model.Taula;

@Repository
public interface ReservaRepository extends MongoRepository<Reserva, String> {
	Optional<Reserva> findReservaByTaulaAndDataReserva(Taula taula, Date dataReserva);
}
