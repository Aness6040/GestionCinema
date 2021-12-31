package fr.formation.filrouge.bo;

public class Salle {
	
	private String nomSalle;
	private String typeSalle;
	private int capacite;
	
	public Salle(String nomSalle, String typeSalle, int capacite) {
		super();
		this.nomSalle = nomSalle;
		this.typeSalle = typeSalle;
		this.capacite = capacite;
	}

	public String getNomSalle() {
		return nomSalle;
	}

	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}

	public String getTypeSalle() {
		return typeSalle;
	}

	public void setTypeSalle(String typeSalle) {
		this.typeSalle = typeSalle;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	@Override
	public String toString() {
		return "Salle [nomSalle=" + nomSalle + ", typeSalle=" + typeSalle + ", capacite=" + capacite + "]";
	}
	
	
	

}
