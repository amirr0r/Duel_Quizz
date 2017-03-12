import java.util.ArrayList;
import java.util.Scanner;

public class Partie {
	private static Scanner sc;
	private ArrayList<Question> questionnaire;
	private ArrayList<Joueur> players;
	public Partie() {
		this.questionnaire = new ArrayList<Question>();
		this.players = new ArrayList<Joueur>();
	}
	public ArrayList<Question> getQuestionnaire() {
		return questionnaire;
	}
	public ArrayList<Joueur> getPlayers() {
		return players;
	}
	public void ajouterJoueur(Joueur player) {
		this.players.add(player);
	}
	public void ajouterQuestion(Question question) {
		this.questionnaire.add(question);
	}
	public void affiche40ln() {
		int i= 40;
		while(i != 0) {
			System.out.println();
			i--;
		}
	}
	public void lancerPartie() {
		if (this.players.size() == 0)
			throw new Error("Aucun joueur n'est inscrit");
		Question q1;
		Question q2;
		Question q3;

		int choix;
		int reponse1;
		int reponse2;
		int reponse3;
		int [] answers = new int[3];
		sc = new Scanner(System.in);
		System.out.println("Bonjour "+this.players.get(0).getNom()+", veuillez choisir un thème :\n"
				+ "0.Sortir\n"
				+ "1.Sport\n"
				+ "2.Mangas, Bande dessinées\n"
				+ "3.Cinéma, séries\n"
				+ "4.Informatique\n"
				+ "Tapez le numéro correspondant au thème : ");
		choix = Integer.parseInt(sc.nextLine());
		while (choix < 0 || choix > 4) {
			System.out.println("Erreur ! Choisissez une option du menu : ");
			choix = Integer.parseInt(sc.nextLine());
		}
		switch (choix) {
			case 0 :
				break;
			case 1 : // Sports
				affiche40ln();
				q1 = new Question("Quelle est l'équipe qui a remporté la finale des playoffs de 2013(NBA)");
				q2 = new Question("Qui détient le record mondiale en nage libre sur 100m (Bassin 50m)");
				q3 = new Question("Quel athlète est le vainqueur de 4 médailles d'or ( 100m, 200 m, 4x 100m et saut en longueur ) aux jeux Olympiques de Berlin en 1936");
				ajouterQuestion(q1);
				ajouterQuestion(q2);
				ajouterQuestion(q3);
				System.out.println(q1.toString()
						+ "\t1 - Chicago Bulls\n"
						+ "\t2 - Los Angeles Lakers\n"
						+ "\t3 - Miami Heat\n\n"
						+ "Tapez le numéro correspondant à la réponse : ");
				answers[0] = 3;
				reponse1 = Integer.parseInt(sc.nextLine());
				goodanswer(reponse1, answers[0], this.players.get(0));
				System.out.println(q2.toString()
						+ "\t1 - David Douillet\n"
						+ "\t2 - César Cielo\n"
						+ "\t3 - Laure Manaudou\n\n"
						+ "Tapez le numéro correspondant à la réponse : ");
				answers[1] = 2;
				reponse2 = Integer.parseInt(sc.nextLine());
				goodanswer(reponse2, answers[1], this.players.get(0));
				System.out.println(q2.toString()
						+ "\t1 - Glenn Morris\n"
						+ "\t2 - Jesse Owens\n"
						+ "\t3 - John Woodruff\n\n"
						+ "Tapez le numéro correspondant à la réponse : ");
				answers[2] = 2;
				reponse3 = Integer.parseInt(sc.nextLine());
				goodanswer(reponse3, answers[2], this.players.get(0));
				break;
			case 2 :
				break;
			case 3 :
				break;
			case 4 :
				break;
		}
		System.out.println("Bye !");
		sc.close();
	}
	public void goodanswer(int reponse, int answer, Joueur j) {
		while (reponse < 1 || reponse > 3) {
			System.out.println("Erreur ! Choisissez une réponse du menu : ");
			reponse = Integer.parseInt(sc.nextLine());
		}
		if (reponse == answer) {
			System.out.println("Bravo ! Bonne réponse");
			j.pointsGagnés();
		} else
			System.out.println("Faux ! La bonne réponse était la "+answer);
	}
}
