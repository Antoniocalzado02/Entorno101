package com.edu.boletin1;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int contador=0;
		int acumulador=0;
		int numero1;
		
		
		while(contador<15) {
			System.out.println("Dime un numero");
			numero1=Integer.valueOf(scanner.next());
			acumulador=acumulador+numero1;
			contador+=1;
		}
		System.out.println(acumulador);

	}

}
