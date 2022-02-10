package javaObjects.feb.ejercicio;

public class Avion {
	private String idAvion;
	private final Integer capacidad;
	private Integer numVuelos=0;
	private Double kmVolados=0.0;
	private String compannia;
	
	//constructores

	public Avion(String idAvion, int capacidad) {
		this.idAvion = idAvion;
		this.capacidad = capacidad;
		
	}
	
	public Avion(int capacidad,String idAvion, String compannia) {
		this.capacidad=capacidad;
		this.idAvion = idAvion;
		this.compannia = compannia;
	}
	
	//metodos
	
	public boolean asignarVuelo(int capacidad,double kilometros) {
		boolean posibleAsignarVuelo = false;
		
		if (capacidad<= this.capacidad) {
			this.kmVolados+=kilometros;
			this.numVuelos++;
		}
		return posibleAsignarVuelo;
	}
	
	public int getNumeroVuelos() {
		
		return numVuelos;
	}
	
	public double getTotalKm() {
		
		return kmVolados;
	}
	
	public double getMediaKm() {
		
		double resultado=kmVolados/numVuelos;
		
		
		return resultado;
	}

	//getter and setter
	
	public String getIdAvion() {
		return idAvion;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	

	public Integer getNumVuelos() {
		return numVuelos;
	}

	

	public Double getKmVolados() {
		return kmVolados;
	}

	

	public String getCompannia() {
		return compannia;
	}

	public void setCompannia(String compannia) {
		this.compannia = compannia;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
