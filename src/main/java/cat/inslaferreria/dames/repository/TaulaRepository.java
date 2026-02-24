package cat.inslaferreria.dames.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cat.inslaferreria.dames.model.Taula;

@Repository
public interface TaulaRepository extends MongoRepository<Taula, String> {

}
