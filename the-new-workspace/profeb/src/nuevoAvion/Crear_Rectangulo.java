package nuevoAvion;

import java.util.Scanner;

public class Crear_Rectangulo {

		
		Scanner sc= new Scanner(System.in);

		public static void main(String[] args) {
			Rectangulo nuevoRectangulo1= calcularRectangulo();

			System.out.println(nuevoRectangulo1);
			
		}
		
		public static Rectangulo calcularRectangulo() {
			Scanner sc = new Scanner(System.in);
			Rectangulo rectanguloNuevo =null;
			
			System.out.println("Dime la longitud");
			double longitud=Double.valueOf(sc.nextLine());
			
			System.out.println("Dime el ancho");
			double ancho=Double.valueOf(sc.nextLine());
			
			rectanguloNuevo= new Rectangulo(ancho,longitud);
			
			sc.close();
			
			return rectanguloNuevo;
		}
	}

	
