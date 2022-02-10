package com.edu.mpf;

import java.util.Scanner;

public class BoletinJava {

	public static void main(String[] args) {
		/*Ejercicio1*/
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Dime un numero");
		int numero1=Integer.valueOf(scanner.next());
		
		System.out.println("Dime otro numero para ver si es multiplo del primero");
		int numero2=Integer.valueOf(scanner.next());
		
		if(numero2%numero1==0){
			System.out.println("El numero " + numero1 + " es multiplo del siguiente numero " + numero2);
		}else {
			System.out.println("Este numero " + numero1 + " no es multiplo del numero" + numero2);
		}
		
		/*Ejercicio2*/
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
