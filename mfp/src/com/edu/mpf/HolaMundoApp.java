/*Paquete donde esta ubicado*/

package com.edu.mpf;

/*Importacion de librerias*/

import java.util.Scanner;


/*Nombre de la clase*/
public class HolaMundoApp {

	/*Punto de entrada siempre obligatorio*/
	public static void main(String[] args) {
		/*Operadores*/
		
		/* && --> esto es el and
		 || --> esto es el or */
		
		/*Varibles*/
		
		int entero=1_000_000;
		
		long entero1=1_000_000_000;
		
		char c='C';
		
		int numero=c;
		
		boolean variableBooleana=false;
		
		System.out.println(entero);
		System.out.println(entero1);
		
		System.out.println(c);
		System.out.println(numero);
		
		System.out.println(variableBooleana);
		
		int valor=9;
		
		System.out.println(valor);
		
		valor++;
		
		System.out.println(valor);
		
		/*Constantes*/
		
		final float PI=3.1415f;
		
		/*Declarar el scanner*/
		Scanner scanner=new Scanner(System.in);
		
		/*Declarar la varible antes y pedirle el campo para despues mostrarlo*/
		String name;
		System.out.println("Como te llamas");
		
		
		name =scanner.next();
		
		System.out.println(name);
		
		/*Añadirle un valor a la varible directamente, con el nextInt*/
		System.out.println("Dime un numero");
		int edad=scanner.nextInt();
		
		System.out.println(edad);
		
		
		
		/*Añadir un valor al campo pero antes declaramos el tipo y despues le asignamos el valor*/
		
		System.out.println("Dime otro numero");
		int edad2;
		edad2= Integer.valueOf(scanner.next());
		
		System.out.println(edad2);
		
		/*Añadir un valor float*/
		
		System.out.println("Dime un numero con decimales");
		float numeroDecimales=scanner.nextFloat();
		
		System.out.println(numeroDecimales);
		
			
		/*Declarar condiciones*/
		System.out.println("Dime tu edad por tercera vez");
		int edad3=scanner.nextInt();
		
		if(edad3>18) {
			System.out.println("Eres mayor de edad");
		}
		
		/*Declarar condicionales con if y else*/
		
		System.out.println("Dime que dia es");
		int dia=scanner.nextInt();
		
		if(dia==1) {
			System.out.println("Es lunes");
		}else if(dia==2){
			System.out.println("Es martes");
		}else if(dia==3) {
			System.out.println("Es miercoles");
		}else if(dia==4) {
			System.out.println("Es jueves");
		}else if(dia==5) {
			System.out.println("Es viernes");
		}else if(dia==6) {
			System.out.println("Es sabado");
		}else if(dia==7) {
			System.out.println("Es domingo");
		}else {
			System.out.println("El numero del dia no es correcto");
		}
		
		/*Caso del switch*/
		
		System.out.println("Dime otro dia de la semana");
		int dia2=scanner.nextInt();
		
		switch (dia2) {
			case 1:{
				System.out.println("Es lunes");
				break;
			}case 2:{
				System.out.println("Es martes");
				break;
			}case 3:{
				System.out.println("Es miercoles");
				break;
			}case 4:{
				System.out.println("Es jueves");
				break;
			}case 5:{
				System.out.println("Es viernes");
				break;
			}case 6:{
				System.out.println("Es sabado");
				break;
			}case 7:{
				System.out.println("Es domingo");
				break;
			}default:
				System.out.println("El numero del dia no es correcto");
				break;
			}
		
		
		/*Bucles*/
		

		
		/*String*/
		
		String cadenaTexto="Nueva cadena de texto";
		
		/*Esta vacia*/
		
		cadenaTexto.isEmpty();
		
		/*Longitud de la cadena*/
		
		cadenaTexto.length();
		
		/*Posicion de un caracter*/
		
		cadenaTexto.indexOf('c');
		cadenaTexto.indexOf("ra", 2);
		
		/*Para comprobar si empieza por lo que pedimos*/
		boolean contiene = cadenaTexto.startsWith("ahora");
		
		/*Para comprobar si esta en la cadena*/
		
		contiene=cadenaTexto.contains("ahora");
		
		/*Para comprobar si termina con lo que pedimos*/
		
		contiene=cadenaTexto.endsWith("ahora");
		
		/*Para eliminar los espacios al final y al principio*/
		
		cadenaTexto=cadenaTexto.trim();
		
		
		
		
		
		
		
		
		
		
		

	}

}
