package com.edu.boletin1;

public class Ejercicio5 {

	public static void main(String[] args) {
		System.out.println(zonaHoraria(17));

	}
	public static String zonaHoraria(int horaInicial) {
			
		String mensaje="";
		if (horaInicial>=6 && horaInicial<=12) {
			mensaje="Buenos dias";
		}else if(horaInicial>=13 && horaInicial<=20){
			mensaje="Buenas tardes";
		}else if(horaInicial>24){
			mensaje="Error";
		}else if(horaInicial>=21 || horaInicial<=5){
			mensaje="Buenas noches";
		}
		
		
		return mensaje;
	
		}

}
