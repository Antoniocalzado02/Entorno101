package javaObjects.feb.ejercicio;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//Avion av1= new Avion("ryanair034", 90);
		//Avion av2= new Avion(90,"ryanair034","ryanair");
		Avion nuevoAvion=crearAvionConMenu();
		System.out.println("Dime el identificador");
		int numeroViajes =Integer.valueOf(sc.nextLine());
		
		System.out.println("Dime el identificador");
		int kilometros =Integer.valueOf(sc.nextLine());
		
		nuevoAvion.asignarVuelo(numeroViajes, kilometros);

	}
	
	public static Avion crearAvionConMenu() {
		System.out.println("Menu creacion de avion: /n"
				+"Opcion 1 /n"
				+ "Opcion 2");
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Dime la opcion");
		
		int op=Integer.valueOf(sc.nextLine());
		String compannia;
		int capacidad=0;
		Avion avionCreado=null;
		
		System.out.println();
		avionCreado.asignarVuelo(Integer.valueOf(sc.nextLine()), Integer.valueOf(sc.nextLine()));
		
		
		if (op==1) {
			System.out.println("Dime el identificador");
			String identificador =(sc.nextLine());
			System.out.println("Dime la capacidad");
			capacidad=Integer.valueOf(sc.nextLine());
			
			avionCreado= new Avion(identificador,capacidad);
		}else if(op==2) {
			System.out.println("Dime el identificador");
			String identificador =String.valueOf(sc.nextLine());
			System.out.println("Dime la capacidad");
			capacidad=Integer.valueOf(sc.nextLine());
			System.out.println("Dime la compañia");
			compannia=String.valueOf(sc.nextLine());
			
			avionCreado= new Avion(capacidad,identificador,compannia);
		}else {
			System.out.println("El mensaje introducido no es correcto");
		}
		capacidad=3;
		
		return avionCreado;
	}

}
