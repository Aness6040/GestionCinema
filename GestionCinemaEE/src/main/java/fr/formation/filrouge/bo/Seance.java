package fr.formation.filrouge.bo;

import java.sql.Time;
import java.util.Date;

public class Seance {
	
	private Date dateSeance;
	private Time heureDebutSeance;
	private Time heureFinSeance;
	private double prix;
	private Film film;
	private Salle salle;
	
	public Seance(Date dateSeance, Time heureDebutSeance, Time heureFinSeance, double prix, Film film, Salle salle) {
		super();
		this.dateSeance = dateSeance;
		this.heureDebutSeance = heureDebutSeance;
		this.heureFinSeance = heureFinSeance;
		this.prix = prix;
		this.film = film;
		this.salle = salle;
	}

	public Date getDateSeance() {
		return dateSeance;
	}

	public void setDateSeance(Date dateSeance) {
		this.dateSeance = dateSeance;
	}

	public Time getHeureDebutSeance() {
		return heureDebutSeance;
	}

	public void setHeureDebutSeance(Time heureDebutSeance) {
		this.heureDebutSeance = heureDebutSeance;
	}

	public Time getHeureFinSeance() {
		return heureFinSeance;
	}

	public void setHeureFinSeance(Time heureFinSeance) {
		this.heureFinSeance = heureFinSeance;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	@Override
	public String toString() {
		return "Seance [dateSeance=" + dateSeance + ", heureDebutSeance=" + heureDebutSeance + ", heureFinSeance="
				+ heureFinSeance + ", prix=" + prix + ", film=" + film + ", salle=" + salle + "]";
	}
	
	
	
	

}
