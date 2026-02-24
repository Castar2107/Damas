package cat.inslaferreria.dames.model;

import java.util.Date;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "socis")
public class Soci {
	@Id
	String id;
	String nom;
	@Indexed(unique = true)
	String email;
	Date dataAlta;
	int numPartides;
	int numVictories;
	int numDerrotes;
	int numTaules; // Empats
	
	public Soci() {}

	public Soci(String nom, String email) {
		this.nom = nom;
		this.email = email;
		
		// TODO Assignar data local a dataAlta
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataAlta() {
		return dataAlta;
	}

	// Necessari??
	public void setDataAlta(Date dataAlta) {
		this.dataAlta = dataAlta;
	}

	public int getNumPartides() {
		return numPartides;
	}

	public void setNumPartides(int numPartides) {
		this.numPartides = numPartides;
	}

	public int getNumVictories() {
		return numVictories;
	}

	public void setNumVictories(int numVictories) {
		this.numVictories = numVictories;
	}

	public int getNumDerrotes() {
		return numDerrotes;
	}

	public void setNumDerrotes(int numDerrotes) {
		this.numDerrotes = numDerrotes;
	}

	public int getNumTaules() {
		return numTaules;
	}

	public void setNumTaules(int numTaules) {
		this.numTaules = numTaules;
	}
	
}