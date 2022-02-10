package com.edu.boletin1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
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

	}

}
