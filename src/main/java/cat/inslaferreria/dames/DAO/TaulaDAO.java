package cat.inslaferreria.dames.DAO;

public class TaulaDAO {
	 void create(Taula t);
	 Taula findById(String id);
	    List<Taula> findAll();
	    void update(Taula t);
	    void delete(String id);
}
