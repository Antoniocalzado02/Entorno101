package com.edu.boletin1;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int numero1=1;
		int cuadrado;
		
		System.out.println("Dime un numero");
		numero1=Integer.valueOf(scanner.next());
		
		while(numero1>0) {
			
			cuadrado=numero1*numero1;
			System.out.println("EL cuadrado del numero es "+cuadrado);
			System.out.println("Dime un numero");
			numero1=Integer.valueOf(scanner.next());
			
		}
		if (numero1<=0){
			System.out.println("El numero no es valido");
		}

	}

}
