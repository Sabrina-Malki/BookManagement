package entite;

import java.util.*;

import javax.persistence.*;

@Entity
public class Auteur {
	
	@Id
	private String id;
	private String nom;
    @ManyToMany(mappedBy = "auteurs")
	private Set<Livre> livres;

	public Auteur() {
		super();
	}
	
	public Auteur(String id,String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Livre> getLivres() {
		return livres;
	}

	public void setLivres(Set<Livre> livres) {
		this.livres = livres;
	}

	public String getId() {
		return id;
	}

}
