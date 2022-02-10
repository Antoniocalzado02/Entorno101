package profeb.clases.utils;

public class persona {
	
	//1 atributos
	//2 constructores
	// 3 metodos
	// 4 getter y setter
	private String apellidos="apellidos por defecto";
	private int edad;
	private double altura;
	private String nombre="nombre por defecto";
	
	
	//metodo para modificar los private
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	//atributos --> caracteristicas
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setEdad(int edad) {
		if (edad>0 && edad<150) {
			this.edad=edad;
			
		}
	}
	
	//metodos --> comportamientos
	
	
	//constructor
	public persona() {
		apellidos="apellidos vacio";
		nombre="nombre vacio";
		edad=18;
		altura=1.70;
		
	}
	//para meter informacion a nuestro metodo
	public persona(String name, String surname, int age, double height ) {
		if(!name.isEmpty()) {
			this.nombre=name;

		}
		if(!apellidos.isEmpty()) {
			this.apellidos=surname;

		}
		if (age>0 && age<150) {
			this.edad=age;
		}
		if (height>0 && height<3) {
			this.altura=height;

		}
	}
	
	//metodo para saludar
	public void saludar() {
		System.out.println("Hola mi nombre es " + nombre);
	}
	
	
	
	

	public static void main(String[] args) {

	}

}
