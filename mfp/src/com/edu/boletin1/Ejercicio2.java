package com.edu.boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Dime un dia de la semana");
		int diaSemana=scanner.nextInt();
		
		switch (diaSemana) {
		case 1: {
			System.out.println("Es lunes y a primera hora has tenido sistemas");
			break;
		}
		case 2: {
			System.out.println("Es martes y a primera hora has tenido programacion");
		}
		case 3: {
			System.out.println("Es miercoles y a primera hora has tenido base de datos");
			break;
		}
		case 4: {
			System.out.println("Es jueves y a primera hora has tenido base de datos");
			break;
		}
		case 5: {
			System.out.println("Es viernes y a primera hora has tenido base de datos");
			break;
		}
		default:
			System.out.println("Es domingo o sabado y no hay nada");
			break;
		}


	}

}
