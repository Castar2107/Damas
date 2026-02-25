package cat.inslaferreria.dames.DAO;

import cat.inslaferreria.dames.model.Partida;

public class PartidaDAO {
	 void create (Partida p);
	    Partida findById(int id);
	    List<Partida> findAll();
	    void update(Partida p);
	    void delete(String id);
}
