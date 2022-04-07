import java.util.Scanner;

public class RectanguloMain {
	public static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		double longitud, ancho;
		
		System.out.println("Introduce la longitud del rectangulo");
		longitud=Double.parseDouble(teclado.nextLine());
		System.out.println("Introduce la anchura del rectangulo");
		ancho=Double.parseDouble(teclado.nextLine());
		
		RectanguloCodigo rectangulo=new RectanguloCodigo();

		rectangulo.setAncho(ancho);
		rectangulo.setLongitud(longitud);
		System.out.println("El area del rectangulo es: "+rectangulo.area());
		System.out.println("El perimetro del rectangulo es: "+rectangulo.perimetro());


	}
}
