package cat.inslaferreria.dames.service;

public class SociService {

	    private SociService departamentDAO;
	    public SociService () {
	        this.departamentDAO  = DAOFactory.getInstance().getDepartamentDAO();
	    }

	    public void crearNou(Soci d) {
	        if (p.getNom()==null || p.getNom().length()==0) {
	            throw new SociService("Nom no vàlid");
	        }
	        SociDAO.create(d);
	    }
	 public void canviarNom( int id, String nouNom) {
	       //...
	    }

	//...
	}
}
