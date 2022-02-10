package com.edu.boletin1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		System.out.println(CalcularNotas(6,9,6));


	}
	
	
	public static String CalcularNotas (double partePractica, double notaProblemas, double parteTeorica) {
		
		double notaFinal=0;
		double partePracticaTotal=((partePractica*10))/100;
		double notaProblemasTotal=((notaProblemas*40)/100);
		double parteTeoricaTotal=((parteTeorica*50)/100);
		
		notaFinal=((partePracticaTotal+notaProblemasTotal+parteTeoricaTotal));
		
		String mensaje="";
		if (partePractica<5 || notaProblemas<5 || parteTeorica<5) {
			System.out.println("Este alumno no puede aprobar porque tiene una parte suspensa");
		}else{
			if (notaFinal>=5 && notaFinal<5.99) {
				mensaje="Tu nota es un suficiente "+notaFinal;
			}else if (notaFinal>=6 && notaFinal<6.99){
				mensaje="Tu nota es un bien "+notaFinal;
			}else if(notaFinal>=7 && notaFinal<8.99){
				mensaje="Tu nota es un notable "+notaFinal;
			}else{
				mensaje="Tu nota es un sobresaliente "+notaFinal;
			}
		}
		
		return mensaje;
	}

}
