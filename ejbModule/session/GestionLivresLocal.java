package session;

import java.util.List;

import javax.ejb.Local;

import entite.Auteur;
import entite.Livre;

@Local
public interface GestionLivresLocal {
	
	void ajouterLivre(Livre livre);

	List<Livre> listerTousLesLivres();
	
	Livre CreerLivre(String intitule);
	
	public Auteur CreerAuteur(String id,String nom);
}
