import java.util.Collections;

public class Joueur {
	private String nom;
	private int points;
	
	public Joueur(String nom) {
		this.nom = nom;
		this.points = 0;
	}

	public String getNom() {
		return nom;
	}

	public int getPoints() {
		return points;
	}
	public void pointsGagnés() {
		this.points++;
	}
	public void lancerDuel(Partie p, Joueur j) {
		p.ajouterJoueur(j);
		p.ajouterJoueur(this);
		Collections.shuffle(p.getPlayers()); // Le shuffle ne met pas toujours la liste en désordre
		System.out.println("L'un des 2 joueurs a été tiré au sort et va devoir choisir le thème");
		int choix = p.choixTheme(p.getPlayers().get(0));
		p.lancerPartie(p.getPlayers().get(0), choix);
		p.affiche40ln();
		p.lancerPartie(p.getPlayers().get(1), choix);
		p.affiche40ln();
		System.out.println("Attention roulement de tambours...........tatatatatatata\n");
		p.vainqueurs();
		if(this.getPoints()>j.getPoints())
			System.out.println(this.getNom()+" a gagné ! Bravo");
		else if(this.getPoints()<j.getPoints())
			System.out.println(j.getNom()+" a gagné ! Bravo");
		else
			System.out.println("MATCH NUL !!!!!!!!");
	}
}
