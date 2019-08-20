package session;

import java.util.List;
import java.util.Set;

import javax.ejb.Remote;

import entite.*;

@Remote
public interface GestionLivresRemote{

	void ajouterLivre(Livre livre);

	List<Livre> listerTousLesLivres();
	
	Livre CreerLivre(String intitule);

}
