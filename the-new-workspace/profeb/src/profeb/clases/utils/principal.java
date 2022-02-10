package profeb.clases.utils;

public class principal {

	public static void main(String[] args) {
		
		persona antonio= new persona("Antonio","Calzado", 40, 1.7);
		
		
		//antonio.altura=2;
		//antonio.edad=50;
		//antonio.nombre="Antonio";
		
		antonio.setAltura(1.8);
		antonio.setEdad(30);
		antonio.setNombre("Antonio");
		
		System.out.println(antonio);
		
		persona maria= new persona();
		
		maria.setAltura(1.8);
		maria.setEdad(30);
		maria.setNombre("Maria");
		
		System.out.println(maria);
		System.out.println(antonio.getEdad());
		System.out.println(antonio.getNombre());
		
		antonio.saludar();


	}

}
