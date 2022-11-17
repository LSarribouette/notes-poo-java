package fr.lsarribouette.associonsnous;

public class Universite {
	
	// attributs d'instance
	private String nom;
	private String ville;
	private int nbEleves;
	
	// constructeurs
	public Universite(String nom, String ville) {
		this.nom=nom;
		this.ville=ville;
	}
	
	// assesseurs et mutateurs
	// choix :	get nbEleves, nom, ville
	//			set nbEleves
	public int getNbEleves() {
		return nbEleves;
	}
	public String getNom() {
		return nom;
	}
	public String getVille() {
		return ville;
	}
	public void setNbEleves(int nbEleves) {
		this.nbEleves = nbEleves;
	}
	
	// toString
	// TODO supprimer avant mise en production
	@Override
	public String toString() {
		return "Universite [nom=" + nom + ", ville=" + ville + ", nbEleves=" + nbEleves + "]";
	}
}
