package cat.inslaferreria.dames.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cat.inslaferreria.dames.model.Partida;

@Repository
public interface PartidaRepository extends MongoRepository <Partida, String>{

}
