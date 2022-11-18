package fr.lsarribouette.associonsnous;

public class Etudiant {
	
	// attributs d'instance
	private String prenom;
	private int age;
	private String niveauEtudes;
	
	private Universite univ; // attribut objet
	private PosteDeTravail posteAssigne; // attribut objet
	
	// constructeurs
	public Etudiant(String prenom, Universite univ) {
		this.prenom=prenom;
		this.univ=univ; // implementation normale
		this.posteAssigne = new PosteDeTravail(this); // je lui dis "je suis ton étudiant"
		// this appelle l'instance Etudiant en cours de création
		// la je go postedetravail : j'enregistre le poste avec this
		// j'ajoute le setPoste dans mon étudiant
	}
	
	// assesseurs et mutateurs
	// choix : 	get prenom, age, niveauEtudes, univ
	//			set age, niveauEtudes, univ
	public String getPrenom() {
		return prenom;
	}
	public int getAge() {
		return age;
	}
	public String getNiveauEtudes() {
		return niveauEtudes;
	}
	public Universite getUniv() {
		return univ;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setNiveauEtudes(String niveauEtudes) {
		this.niveauEtudes = niveauEtudes;
	}
	public void setUniv(Universite univ) {
		this.univ = univ;
	}
	public void setPoste(PosteDeTravail posteAssigne) {
		this.posteAssigne=posteAssigne;
	}

	// toString
	// TODO supprimer avant mise en production
	@Override
	public String toString() {
		return "Etudiant [prenom=" + prenom + ", age=" + age + ", niveauEtudes=" + niveauEtudes + ", univ=" + univ
				+ "]";
	}
}
