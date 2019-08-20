package session;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import entite.Auteur;
import entite.Livre;


@Stateless
public class GestionLivres implements GestionLivresLocal {

	@PersistenceContext(unitName="MonEntiteEJB3")
	private EntityManager em;

	public GestionLivres(){
	}

	@Override
	public void ajouterLivre(Livre livre) {
		em.persist(livre);
	}

	@Override
	public List<Livre> listerTousLesLivres() {
		return em.createQuery("select l from Livre l").getResultList();
	}
	
	@Override
	public Livre CreerLivre(String intitule) {
		Livre l = new Livre(intitule);
		return l;
	}
	
	@Override
	public Auteur CreerAuteur(String id,String nom)
	{
		Auteur a = new Auteur(id,nom);
		return a;
	}
	
}
