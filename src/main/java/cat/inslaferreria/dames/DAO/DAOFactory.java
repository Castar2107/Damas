package cat.inslaferreria.dames.DAO;

public class DAOFactory {
	   if (instance == null) {
		
		             synchronized (DAOFactory.class) {
		                 if (instance == null) {
		                     instance = new DAOFactory();
		                 }
		             }
		         }
		         return instance;
		     }
public SociDAO getSociDAO () { 
	return SociDAO ; }
}
