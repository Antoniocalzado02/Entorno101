package Persona;

public class GestionFamiliaApp {

	public static void main(String[] args) {
		Persona antonio=new Persona("Calzado","Sanchez","Antonio","XXX233");
		Persona juan=new Persona("Calzado","Sanchez","Juan","XXX233");
		
		System.out.println(antonio.esHermano(juan));

	}

}
