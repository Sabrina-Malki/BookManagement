package entite;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;

@Entity
public class Livre implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String intitule;
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	private List<Auteur> auteurs;


	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Livre(String intitule, List<Auteur> auteurs) {
		super();
		this.intitule = intitule;
		this.auteurs = auteurs;
	}
	
	public Livre(String intitule) {
		super();
		this.intitule = intitule;
	}
	
	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
    @XmlTransient
	public List<Auteur> getAuteurs() {
		return auteurs;
	}

	public void setAuteurs(List<Auteur> auteurs) {
		this.auteurs = auteurs;
	}

	public int getId() {
		return id;
	}

}
