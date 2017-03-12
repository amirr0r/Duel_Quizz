
public class Question {
//	private String theme;
	private String contenu;
	public Question(String content) {
//		this.theme = theme;
		this.contenu = content;
	}
//	public String getTheme() {
//		return theme;
//	}
	public String toString() {
		return "□ "+ this.contenu + " ?\n\n";
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
}
