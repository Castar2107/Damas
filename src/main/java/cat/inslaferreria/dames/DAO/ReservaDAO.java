package cat.inslaferreria.dames.DAO;

public class ReservaDAO {
    void create(Reserva r);
    Reserva findById(String id);
    List<Reserva> findAll();
    void update(Reserva r);
    void delete(String id);

}
