package com.edu.boletin1;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int numero1;
		int contador=0;
		while(contador<5) {
			System.out.println("Dime un numero");
			numero1=Integer.valueOf(scanner.next());
			contador+=1;
			if (numero1%3==0) {
				System.out.println("El "+numero1+" es multiplo de 3");
			}else {
				System.out.println("El numero no es multiplo de 3");
			}
		}

	}

}
