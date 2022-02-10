package com.edu.boletin1;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Dime el numero del que quieres empezar");
		int numero1=Integer.valueOf(scanner.next());
		
		if (numero1>=1) {
			int i=numero1+100;
			int contador=numero1;
			int acumulador=numero1;
			while (contador<i) {
				contador+=1;
				acumulador=acumulador+contador;
			}
			System.out.println(acumulador);
		}else if(numero1<=0){
			System.out.println("El numero no es valido");
		}
		

	}

}
