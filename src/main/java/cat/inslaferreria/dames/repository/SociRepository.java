package cat.inslaferreria.dames.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cat.inslaferreria.dames.model.Soci;

@Repository
public interface SociRepository extends MongoRepository<Soci, String>{
	Optional<Soci> findByEmail(String email);
}
