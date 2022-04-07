
public class RectanguloCodigo {
	double longitud = 1;
	double ancho = 1;

	// Creamos el constructor principal
	public RectanguloCodigo() {
		super();
		this.longitud = longitud;
		this.ancho = ancho;
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

}
