
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
}
