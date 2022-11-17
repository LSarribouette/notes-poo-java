package fr.lsarribouette.associonsnous;

public class TestAssociationUnidir {
	public static void main(String[] args) {
		// un eleve connait son universite, mais pas l'inverse
		
		Universite univBordeaux = new Universite("Universite de Bordeaux", "Bordeaux");
		
		Etudiant bob = new Etudiant("Bob",univBordeaux);
		
		System.out.println(univBordeaux); 	// Universite [nom=Universite de Bordeaux, ville=Bordeaux, 
											// nbEleves=0]
		System.out.println(bob);	// Etudiant [prenom=Bob, age=0, niveauEtudes=null, 
									// univ=Universite [nom=Universite de Bordeaux, ville=Bordeaux, nbEleves=0]]
	}	
}
