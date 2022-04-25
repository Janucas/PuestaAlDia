import java.util.Objects;

public class RectanguloCodigo {
	private double longitud = 1;
	private double ancho = 1;

	// Creamos el constructor principal
	public RectanguloCodigo(int longitud, int ancho) {
		super();
		this.longitud = longitud;
		this.ancho = ancho;

	}
	public RectanguloCodigo() {
		
	}
	// Creamos los metodos getter y setter

	public double getLongitud() {
		return longitud;
	}

	public String setLongitud(double longitud) {
		String mensaje = "";
		if (longitud <= 0 || longitud > 20) {
			mensaje = "Valor no valido";
		} else {
			this.longitud = longitud;
		}
		return mensaje;
	}

	public double getAncho() {
		return ancho;
	}

	public String setAncho(double ancho) {
		String mensaje = "";
		if (longitud <= 0 || longitud > 20) {
			mensaje = "Valor no valido";
		} else {
			this.ancho = ancho;
		}
		return mensaje;
	}

	public double perimetro() {
		double resultado = (this.ancho * 2) + (this.longitud * 2);
		return resultado;
	}

	public double area() {
		double resultado = this.ancho * this.longitud;
		return resultado;
	}
	
	

	@Override
	public String toString() {
		return "RectanguloCodigo [longitud=" + longitud + ", ancho=" + ancho + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ancho, longitud);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RectanguloCodigo other = (RectanguloCodigo) obj;
		return Double.doubleToLongBits(ancho) == Double.doubleToLongBits(other.ancho)
				&& Double.doubleToLongBits(longitud) == Double.doubleToLongBits(other.longitud);
	}
	
	

}
