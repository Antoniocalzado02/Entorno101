package maquina.Cafe;

public class MaquinaCafe {
	
	private Integer depositoCafe=50;
	private Integer depositoLeche=50;
	private Integer depositoVasos=80;
	private double monedero=50.0;
	
	
	public MaquinaCafe() {
		
	}
	
	public void llenarDeposito() {
		this.depositoCafe=50;
		this.depositoLeche=50;
		this.depositoVasos=80;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Integer getCafe() {
		return depositoCafe;
	}
	public Integer getLeche() {
		return depositoLeche;
	}
	public Integer getVasos() {
		return depositoVasos;
	}
	public double getMonedero() {
		return monedero;
	}
	public void setCafe(Integer cafe) {
		this.depositoCafe = cafe;
	}
	public void setLeche(Integer leche) {
		this.depositoLeche = leche;
	}
	public void setVasos(Integer vasos) {
		this.depositoVasos = vasos;
	}
	public void setMonedero(double monedero) {
		this.monedero = monedero;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	} 
	
	

}
