package fr.lsarribouette.pleindechats;

public class TestChat {
	public static void main(String[] args) {
		//Chat monChat1 = new Chat(); // constructeur public, substitue par les constructeurs definis dans la classe
		Chat monChat2 = new Chat("Fripouille","roux");
		Chat monChat3 = new Chat("Biscote", "gris", 4.5, 7);
		
		//System.out.println(monChat1); // Chat [prenom=null, couleur=null, poids=0.0, age=0]
		System.out.println(monChat2); // Chat [prenom=Fripouille, couleur=roux, poids=0.0, age=0]
		System.out.println(monChat3); // Chat [prenom=Biscote, couleur=gris, poids=4.5, age=7]
		
		monChat2.dormir(); // Fripouille dort encore...
		monChat2.miauler(); // Fripouille a dit miaou.
		monChat3.dormir(); // Biscote dort encore...
		
		Chat.compterMesChats(); // J'ai 3 chats.
		
		System.out.println(monChat3.getCouleur()); // gris
		
		// Je complete les informations sur Fripouille
		monChat2.setPoids(3);
		monChat2.setAge(2);
		
		System.out.println(monChat2); // Chat [prenom=Fripouille, couleur=roux, poids=3.0, age=2]
		System.out.println(monChat2.toString()); // Chat [prenom=Fripouille, couleur=roux, poids=3.0, age=2]
		
	}
}
