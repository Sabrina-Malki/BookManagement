package service;

import java.util.List;
import java.util.Set;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import entite.Auteur;
import entite.Livre;
import session.GestionLivresLocal;

@Stateless
@WebService
public class GestionLivresWS {
@EJB
private GestionLivresLocal gestion;

@WebMethod
public void ajouterLivre(@WebParam(name="intitule")String intitule,@WebParam(name="auteurs") List<Auteur> auteurs){
Livre livre=new Livre(intitule,auteurs) ;
gestion.ajouterLivre(livre);
};

@WebMethod
public List<Livre> listerTousLesLivres(){
return gestion.listerTousLesLivres();
};

}
