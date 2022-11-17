package fr.lsarribouette.pleindechats;

public class Chat {
	// attributs d'instance
	private String prenom;
	private String couleur;
	private double poids;
	private int age;
	
	// attributs de classe
	private static int nbChats = 0;
	
	// constantes de classe
	private static final int nbPattes = 4;
	
	// constructeurs
	public Chat(String prenom, String couleur) {
		this.prenom = prenom;
		this.couleur = couleur;
		
		nbChats++; // incrémente le compteur d'instances
	}
	
	public Chat(String prenom, String couleur, double poids, int age) {
		this(prenom,couleur);
		this.poids = poids;
		this.age = age;
		
		nbChats++; // incrémente le compteur d'instances
	}
	
	// methodes d'instance
	public void dormir() {
		System.out.println(this.prenom + " dort encore...");
	}
	
	public void miauler() {
		System.out.println(this.prenom + " a dit miaou.");
	}
	
	// methodes de classe
	public static void compterMesChats() {
		System.out.println("J'ai " + nbChats + " chats.");
	}
	
	// assesseurs et mutateurs
	// choix : 	je veux pouvoir recuperer tous les attributs existant
	//			par contre, je ne veux pouvoir modifier que le poids et l'age 
	public String getPrenom() {
		return prenom;
	}
	public String getCouleur() {
		return couleur;
	}
	public double getPoids() {
		return poids;
	}
	public int getAge() {
		return age;
	}
	public static int getNbChats() {
		return nbChats;
	}
	public static int getNbpattes() {
		return nbPattes;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// toString
	// TODO supprimer avant mise en production
	@Override
	public String toString() {
		return "Chat [prenom=" + prenom + ", couleur=" + couleur + ", poids=" + poids + ", age=" + age + "]";
	}
}
