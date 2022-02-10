package com.edu.mpf;

import java.util.Scanner;

public class EjerciciosJava {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Dime tu edad");
		int edad=scanner.nextInt();
		if(edad>18) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad");
		}
		
		System.out.println("DIme tu edad de nuevo");
		int edad2=scanner.nextInt();
		if (edad2<18) {
			System.out.println("Eres un niño");
		}else if(edad2>18 && edad2<65){
			System.out.println("Eres un adulto");
		}else if(edad2>65) {
			System.out.println("Tienes mas años que el piruli");
		}
		
		
		System.out.println("Dime un año");
		int year=scanner.nextInt();
		
		while(year>0) {
			System.out.println("Dime un mes");
			int month=scanner.nextInt();
		
			switch (month) {
			case 1,3,5,7,8,10,12:
				System.out.println("El mes tiene 31 dias");
				break;
			
			case 2:
				
				if(year%4==0 && (year%100!=0 || year%400==0)) {
					System.out.println("El mes tiene 29 dias");
				}else{
					System.out.println("El mes tiene 28 dias");
				}
				break;
				
			case 4,6,9,11:
				System.out.println("El mes tiene 30 dias");
				break;
			
	
			default:
				System.out.println("El mes introducido no es valido");
				break;
				
		
				
			}
			System.out.println("Dime un año");
			year=scanner.nextInt();
			}

	}

}
