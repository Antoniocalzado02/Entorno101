package com.edu.boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println(obtenerTipoDeCaracter('A'));
		System.out.println(obtenerTipoDeCaracter('a'));
		System.out.println(obtenerTipoDeCaracter('7'));
		System.out.println(obtenerTipoDeCaracter(':'));
		System.out.println(obtenerTipoDeCaracter(' '));
		System.out.println(obtenerTipoDeCaracter('('));
		System.out.println(obtenerTipoDeCaracter('@'));
		

	}
	
	public static String obtenerTipoDeCaracter(char caracter) {
		
		String mensaje="";
		String puntos=(".,:;");
		String espacioBlanco=(" ");
		String parentesisLlaves=("()[]");
	
		
		if (Character.isUpperCase(caracter)) {
			mensaje="El caracter es mayuscula";	
		}else if(Character.isLowerCase(caracter)){
			mensaje="El caracter es minuscula";
		}else if(Character.isDigit(caracter)) {
			mensaje="El caracter es un digito";
		}else if(puntos.indexOf(caracter)!=-1) {
			mensaje="El caracter es un punto";
		}else if(caracter==' ') {
			mensaje="El caracter es un espacio";
		}else if(parentesisLlaves.indexOf(caracter)!=-1) {
			mensaje="El caracter es un parentesis o una llave";
		}else {
			mensaje="Es otro caracter";
		}
		
		
		
		
		
		
		
		
		
		return mensaje;
	}

}
