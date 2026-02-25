package cat.inslaferreria.dames.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "taules")
public class Taula {
	@Id
	String id;
	@Indexed(unique = true)
	int numero;
	boolean disponible;
}
