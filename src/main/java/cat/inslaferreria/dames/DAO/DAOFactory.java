package cat.inslaferreria.dames.DAO;

public class DAOFactory {

    private static DAOFactory instance;

    private SociDAO sociDAO;
   // . . .
 
    private DAOFactory() {
    	sociDAO = new SociDAOImpl();
         // . . .
         }

    public static DAOFactory getInstance() {
        if (instance == null) {
//accés sincronitzat en cas de programació multifil
            synchronized (DAOFactory.class) {
                if (instance == null) {
                    instance = new DAOFactory();
                }
            }
        }
        return instance;
    }

    public SociDAO getSociDAO () { 
return sociDAO ; }
   // . . .

