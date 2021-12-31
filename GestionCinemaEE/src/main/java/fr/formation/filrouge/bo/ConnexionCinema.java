package fr.formation.filrouge.bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class ConnexionCinema {
	
	public static void connect ()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
		}
			
			Connection connexion = null;
			Statement statement = null;
			ResultSet resultat = null;
			
			try {
				connexion = DriverManager.getConnection("\"jdbc:mysql://localhost/cinema123?user=root\"");
				statement = connexion.createStatement(); 
				resultat = statement.executeQuery("Select * from seance");
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	

}
