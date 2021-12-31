package fr.formation.firouge.dal;

import java.util.ArrayList;
import java.util.List;

import fr.formation.filrouge.bo.Seance;


public class SeanceDAO {
	
private static List<Seance> seances = new ArrayList<>();
	
	public static void insert(Seance seance) {
		seances.add(seance);
	}
	
	public static List<Seance> getAll(){
		return seances;
	}
	

}
