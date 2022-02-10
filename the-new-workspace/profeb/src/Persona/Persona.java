package Persona;

public class Persona {
	
	private Integer edad;
	private String apellido1;
	private String nombre;
	private String dni;
	private double altura;
	private double peso;
	private String apellido2;
	
	private Persona progenitor1;
	private Persona progenitor2;
	
	public Persona() {
		
	}

	public Persona(String apellido1,String apellido2, String nombre, String dni) {
		super();
		
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nombre = nombre;
		this.dni = dni;
	}
	
	

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public Integer getEdad() {
		return edad;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public double getAltura() {
		return altura;
	}

	public double getPeso() {
		return peso;
	}

	public Persona getProgenitor1() {
		return progenitor1;
	}

	public Persona getProgenitor2() {
		return progenitor2;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setProgenitor1(Persona progenitor1) {
		this.progenitor1 = progenitor1;
	}

	public void setProgenitor2(Persona progenitor2) {
		this.progenitor2 = progenitor2;
	}

	@Override
	public boolean equals(Object personaDesconocida) {
		boolean sonLaMismaPersona= false;
		
		Persona convertida=(Persona) personaDesconocida;
		
		//sonLaMismaPersona=this.dni.equals(convertida.getDni())
				//&& this.nombre.equals(convertida.getNombre());
		
		sonLaMismaPersona=this.apellido1.equals(convertida.getApellido1());

		return sonLaMismaPersona;
	}
	
	public boolean esHermano(Persona personaNueva) {
		boolean sonHermanos=false;
		
		sonHermanos=this.apellido1.equals(personaNueva.getApellido1())
				&& this.apellido2.equals(personaNueva.getApellido2());
		
		
		return sonHermanos;
	}
	
	

}
