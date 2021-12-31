package fr.formation.firouge.bll;

import java.util.List;

import fr.formation.filrouge.bo.Film;
import fr.formation.filrouge.bo.Salle;
import fr.formation.filrouge.bo.Seance;
import fr.formation.firouge.dal.FilmDAO;
import fr.formation.firouge.dal.SalleDAO;
import fr.formation.firouge.dal.SeanceDAO;



public class Manager {
	
	//---------------Gestion Film --------------------------
	public static void insert(Film film) throws CinemaException {
		
		if (film.getTitre() != "") 
		{	
			FilmDAO.insert(film);
		}
		else throw new CinemaException("Titre manquant");
	}
	public static List<Film> getAllFilms(Film film) {
		return FilmDAO.getAll();
			
		}
	//-----------------Gestion des Salles--------------------
	
		public static void insert(Salle salle) throws CinemaException {
			
			if (salle.getNomSalle() == "") 
				
				{ throw new CinemaException("Nom de la salle manquant");
				
				}
			else if ((salle.getCapacite()<= 0)) 
			{	
				throw new CinemaException("Capacité de salle doit etre >= 0");
				
			}
		   else SalleDAO.insert(salle);
		}
		
		public static List<Salle> getAllSalles(Salle salle) {
			return SalleDAO.getAll();
				
			}
		//-----------------Gestion des Seances--------------------
		public static void insert(Seance seance)throws CinemaException {
			
			if (seance.getSalle() == null )
			{
				throw new CinemaException("Salle manquante");
			} 
			else if (seance.getFilm()==null)
			{
				throw new CinemaException("Film manquant");
			}
			else if (seance.getHeureFinSeance().before(seance.getHeureDebutSeance()))
			{
				throw new CinemaException("l'heure de début du film ne doit pas etre superieur à l'heure de fin");
              }
			SeanceDAO.insert(seance);
		}
		
		public static List<Seance> getAllSeances(Seance seance) {
			return SeanceDAO.getAll();
				
			}
		
}
