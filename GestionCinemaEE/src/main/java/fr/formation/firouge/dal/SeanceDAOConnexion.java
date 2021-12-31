package fr.formation.firouge.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;

import fr.formation.filrouge.bo.Film;
import fr.formation.filrouge.bo.Salle;
import fr.formation.filrouge.bo.Seance;

public class SeanceDAOConnexion {
	
	public List<Seance> getAllSeances() throws NumberFormatException, ParseException, SQLException{
		
		List<Seance> seances = new ArrayList<Seance>();
		try 
		{
			Class.forName("com.myqsl.jdbc.Driver");
		} catch (ClassNotFoundException e)
		{
			
		}
			 Connection connexion = null;
			 Statement statement = null;
			 ResultSet resultat = null;
		 try {
			 connexion = DriverManager.getConnection("jdbc:mysql://localhost/cinema123?user=root&password=root");
			 statement = connexion.createStatement();
			 resultat = statement.executeQuery("SELECT * From seance JOIN film ON film.idFilm=seance.idFilm JOIN salle ON salle.idSalle=seance.idSalle");
			 
			 while(resultat.next()) {
				 			
				 Film film= new Film(resultat.getString("titreFilm"),resultat.getString("typeFilm"),resultat.getString("realisateur"));
				 Salle salle= new Salle(resultat.getString("nomSalle"),resultat.getString("typeSalle"),Integer.parseInt(resultat.getString("capacite")));
				 Seance seance = new Seance(new SimpleDateFormat("dd/MM/yyyy").parse(resultat.getString("dateSeance")),
						 (Time) new SimpleDateFormat("hh:mm:ss").parse("heureDebutSeance"),
						 (Time) new SimpleDateFormat("hh:mm:ss").parse("heureFinSeance"),
						 Double.parseDouble(resultat.getString("prix")),
						 film,salle);
				 seances.add(seance);
			 }
		 } catch (SQLException e)
		 {
			 
		 }
		finally {
			if (resultat !=null) resultat.close();
			if (statement !=null) statement.close();
			if (connexion !=null) connexion.close();
		}
		return seances;
		
	}
	
	

}
