package nuevoAvion;

import java.util.Scanner;

public class Aeropuerto {

	public static void main(String[] args) {


		Avion jumbo = crearAvionConMenu();

		//capacidad 120
		
		//jumbo.asignarVuelo(100, 10000); 	// nvuelos = 1, kmTotales = 10000
		//jumbo.asignarVuelo(10, 5000);		// nvuelos = 2, kmTotales = 15000
		//jumbo.asignarVuelo(150, 6000);		// nvuelos = 2, kmTotales = 15000
		//jumbo.asignarVuelo(110, 6000);		// nvuelos = 3, kmTotales = 21000
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona opción:");
		System.out.println("a. Asignar vuelo");
		System.out.println("b. Obtener el número de vuelos");
		System.out.println("c. Obtener el total de kilómetros volados");
		System.out.println("d. Obtener la media de kilómetros por vuelo");
		System.out.println("e. Cambio de compañia");
		System.out.println("f. Mostrar informacion del avion");
		System.out.println("g. Salir");
		
		String opcion = sc.nextLine();


		while (!opcion.equalsIgnoreCase("g")) {
			
		
		if(opcion.equalsIgnoreCase("a")) {
			System.out.println("Dime cuantos viajeros va a transportar");
			int viajeros=Integer.valueOf(sc.nextLine());
			System.out.println("Dime los kilometros que va a recorrer");
			int km=Integer.valueOf(sc.nextLine());
			if(jumbo.asignarVuelo(viajeros, km)) {
				System.out.println("El vuelo ha sido asignado correctamente");
			}else {
				System.out.println("No se ha podido asignar el vuelo");
			}
			
		}else if(opcion.equalsIgnoreCase("b")) {
			System.out.println(jumbo.getNumVuelos());
			
		}else if(opcion.equalsIgnoreCase("c")) {
			System.out.println(jumbo.getKmVolados());
			
		}else if(opcion.equalsIgnoreCase("d")) {
			System.out.println(jumbo.getMediaKms());
		}else if(opcion.equalsIgnoreCase("e")) {
			System.out.println("Dime la nueva compañia");
			String compania=String.valueOf(sc.nextLine());
			jumbo.setCompania(compania);
		}else if(opcion.equalsIgnoreCase("f")) {
			System.out.println(jumbo.getInformacionAvion());
		}
		System.out.println("Selecciona opción:");
		System.out.println("a. Asignar vuelo");
		System.out.println("b. Obtener el número de vuelos");
		System.out.println("c. Obtener el total de kilómetros volados");
		System.out.println("d. Obtener la media de kilómetros por vuelo");
		System.out.println("e. Cambio de compañia");
		System.out.println("f. Mostrar informacion del avion");
		System.out.println("g. Salir");
		opcion = sc.nextLine();
	}
		
		//System.out.println(jumbo);
		
		
	}
	
	public static Avion crearAvionConMenu() {
		System.out.println("MENÚ CREACIÓN DE AVIÓN: \n"
					+ "1. Crear avión sólo con el identificador.\n"
					+ "2. Crear avión con el identificador y la compañía.\n"
				+ "###############################");
		
		int capacidad=0;
		Avion avionCreado = null;
				
		Scanner sc = new Scanner(System.in);
		int op = Integer.valueOf(sc.nextLine());
		
		if(op==1) {
			System.out.println("Introduzca el identificador del avión: ");
			String identificador = sc.nextLine();
			System.out.println("Introduzca la capacidad del avión: ");
			capacidad = Integer.valueOf(sc.nextLine());
			
			avionCreado = new Avion(identificador, capacidad);
			
		}else if(op==2) {
			System.out.println("Introduzca el identificador del avión: ");
			String identificador = sc.nextLine();
			System.out.println("Introduzca el nombre de la compañía: ");
			String compania = sc.nextLine();
			System.out.println("Introduzca la capacidad del avión: ");
			capacidad = Integer.valueOf(sc.nextLine());
			
			avionCreado = new Avion(identificador, compania, capacidad);
			

			
		}else {
			System.out.println("La opción seleccionada no es correcta");
		}
		capacidad = 3;
		
		return avionCreado;
	}

}
