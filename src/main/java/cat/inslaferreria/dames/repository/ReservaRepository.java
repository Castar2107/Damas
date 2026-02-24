package cat.inslaferreria.dames.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cat.inslaferreria.dames.model.Reserva;

@Repository
public interface ReservaRepository extends MongoRepository<Reserva, String> {

}
