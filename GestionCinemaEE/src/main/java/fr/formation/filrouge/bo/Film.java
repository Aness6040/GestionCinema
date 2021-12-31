package fr.formation.filrouge.bo;

public class Film {
	
	private String titre;
	private String typeFilm;
	private String realisateur;
	
	public Film(String titre, String typeFilm, String realisateur) {
		super();
		this.titre = titre;
		this.typeFilm = typeFilm;
		this.realisateur = realisateur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getTypeFilm() {
		return typeFilm;
	}

	public void setTypeFilm(String typeFilm) {
		this.typeFilm = typeFilm;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	@Override
	public String toString() {
		return "Film [titre=" + titre + ", typeFilm=" + typeFilm + ", realisateur=" + realisateur + "]";
	}
	
	

}
