import java.util.Scanner;

public class Ejercicio2 {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String texto, textoVocalesEnMayusculas;
		System.out.println("Introduce un texto: ");
		texto = teclado.nextLine();
		textoVocalesEnMayusculas = soloVocalesMayusculas(texto);
		System.out.println("La cadena con solo las vocales y en mayúsculas es " + textoVocalesEnMayusculas);
	}

	private static String soloVocalesMayusculas(String cadena) {
		StringBuilder builder = new StringBuilder();
		String vocales = "AEIOU";
		char caracter;
		int indice;
		String cadenaAux=cadena.toUpperCase();
		for (indice = 0; indice < cadena.length(); indice++) {
			caracter = cadenaAux.charAt(indice);
			if (vocales.indexOf(caracter) >=0) {
				builder.append(caracter);
			}
		}
		return builder.toString();

	}

}

/*
 *1
 *En la prueba 1 solo aparecen las vocales que se introducen en mayusculas
 *2
 *En esta prueba solo nos muestra la E mayuscula
 *
 *Este programa lo que hace es reconocer solo las letras que se introducen en mayuscula
*/