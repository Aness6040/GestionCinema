package fr.formation.firouge.dal;

import java.util.ArrayList;
import java.util.List;

import fr.formation.filrouge.bo.Film;



public class FilmDAO {
	
private static List<Film> films = new ArrayList<>();
	
	public static void insert(Film film) {
		films.add(film);
	}
	
	public static List<Film> getAll(){
		return films;
	}
	

}
