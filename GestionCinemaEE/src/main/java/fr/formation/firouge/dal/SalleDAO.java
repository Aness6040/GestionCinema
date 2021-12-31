package fr.formation.firouge.dal;

import java.util.ArrayList;
import java.util.List;

import fr.formation.filrouge.bo.Salle;



public class SalleDAO {

private static List<Salle> salles = new ArrayList<>();
	
	public static void insert(Salle salle) {
		salles.add(salle);
	}
	
	public static List<Salle> getAll(){
		return salles;
	}
	
}
