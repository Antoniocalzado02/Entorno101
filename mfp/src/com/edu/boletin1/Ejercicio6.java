package com.edu.boletin1;

public class Ejercicio6 {

	public static void main(String[] args) {
		System.out.println(sistemaTemperaturas(6,27));

	}
	public static String sistemaTemperaturas(int mesIndicado,int diaMes) {
			
		String mensaje="";
		if ((mesIndicado==4) || (mesIndicado==5) || (mesIndicado==3 && diaMes>20) || (mesIndicado==6 && diaMes<=21)) {
			mensaje="Es primavera";
		}else if((mesIndicado==7) || (mesIndicado==8) || (mesIndicado==6 && diaMes>21) || (mesIndicado==9 && diaMes<=23)) {
			mensaje="Es verano";
		}else if((mesIndicado==10) || (mesIndicado==11) || (mesIndicado==9 && diaMes>23) || (mesIndicado==12 && diaMes<=21)) {
			mensaje="Es otoño";
		}else if((mesIndicado==1) || (mesIndicado==2) || (mesIndicado==12 && diaMes>21) || (mesIndicado==3 && diaMes<=20)) {
			mensaje="Es invierno";
		}
		
		return mensaje;
	}

}
