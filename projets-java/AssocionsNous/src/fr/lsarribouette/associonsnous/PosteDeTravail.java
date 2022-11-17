package fr.lsarribouette.associonsnous;

public class PosteDeTravail {
	
	// attributs d'instance
	private int numPoste;
	private String refOrdinateur = "OptiPlex"; // valeur par defaut
	private boolean fonctionne = true; // valeur par defaut
	
	private Etudiant etudiantAssigne; // attribut objet
	
	// attributs de classe
	private static int nbPostes = 0;
	
	// constructeurs
	public PosteDeTravail(Etudiant etudiantAssigne) {
		this.numPoste=numPoste;
		this.etudiantAssigne=etudiantAssigne; 
		etudiantAssigne.setPoste(this); // je lui reponds "je suis ton poste"		
	}
}
