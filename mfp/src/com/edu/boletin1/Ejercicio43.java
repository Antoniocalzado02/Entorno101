package com.edu.boletin1;

import java.util.Scanner;

public class Ejercicio43 {

	public static void main(String[] args) {

		System.out.println(cadenaCodificar("Cadena"));
		System.out.println(cadenaCodificar("Cadenas"));
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(cadenaCodificar(sc.nextLine()));
		
	}
	
	public static String cadenaCodificar(String cadOConvert) {
		
		String cadenaCodificarVacia="";
		int i;
		
		for (i=1; i<cadOConvert.length(); i+=2 ) {
			cadenaCodificarVacia=cadenaCodificarVacia+cadOConvert.charAt(i)+cadOConvert.charAt(i-1);
			
		}
		if (cadOConvert.length()%2!=0) {
			cadenaCodificarVacia+=cadOConvert.substring(cadOConvert.length()-1,cadOConvert.length());
			
		}
		
		
		
		return cadenaCodificarVacia;

	}

}
