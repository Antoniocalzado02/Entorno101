package nuevoAvion;

public class Rectangulo {
	private double longitud=1;
	private double ancho=1;
	
	public Rectangulo() {}
	
	public Rectangulo(double ancho,double longitud) {
		setAncho(ancho);
		setLongitud(longitud);;
	}


	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		if (longitud>0 && longitud<=20) {
			this.longitud = longitud;
		}
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		if (ancho>0 && ancho<=20) {
			this.ancho = ancho;

		}
		
	}
	
	public double calcularPerimetro() {
		
		double totalPerimetro=(longitud*2)+(ancho*2);
		
		return totalPerimetro;
		
	}
	
	public double calcularArea() {
		
		double totalArea=(longitud*ancho);
		
		return totalArea;
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("El ancho del rectangulo es: ");
		sb.append(getAncho());
		sb.append("\n");
		sb.append("La longitud del rectangulo es: ");
		sb.append(getLongitud());
		sb.append("\n");
		sb.append("Su area es: ");
		sb.append(calcularArea());
		sb.append("\n");
		sb.append("Su perimetro es: ");
		sb.append(calcularPerimetro());
		sb.append("\n");
		return sb.toString();
	}


}
