import java.util.Scanner;

public class Ejercicio1 {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Me falta la parte del array donde indico la cantidad de caracteres tanto de
		 * codigo como de categoria, creo q la condicion para que reconozco los
		 * caracteres se consigue con el codigo ascii
		 * 
		 * Me falta la condicion de q comience por c 
		 */

		String codigo;
		String categoria;

		System.out.println("Introduce el codigo del producto: ");
		codigo = teclado.nextLine();
		System.out.println("Introduce ela categoria del producto: ");
		categoria = teclado.nextLine();
		System.out.println(comprobarCodigo(codigo));
		System.out.println(comprobarCategoria(categoria));
	}
	/*
	 * Creamos el metodo con el cual vamos a cumplir los requisitos del codigo
	 * 
	 * Creamos un for para recorrer toda la cadena al cual le vamos a introducir los 
	 * condicionales para que revise el codigo ascii y determine si es caracter o no.
	 * 
	 * Con el otro condicional indicamos si la longitud de nuestra cadena es correcta
	 */
		
		public static String comprobarCodigo(String codigo) {
			int contador=0;
			String cadena;
			boolean comprobar=false;
			
			for (int i=0; i<= codigo.length()-1;i++) {
				int ascii=codigo.charAt(i);
				
				if (ascii >= 48 && ascii <= 57) {
					contador++;
				}
			}
	
			if (codigo.length() >=5 && codigo.length() <12 && contador >3) {
				comprobar=true;
			}
			
			if (comprobar=true) {
				cadena="Codigo correcto";
			}else {
				cadena="Codigo incorrecto";
			}
			return cadena;
		}
		/*
		 * Con este metodo vamos a cumplir los requisitos del codigo creando un bucle
		 * for que nos permita recorrer todo el array y usando el metodo indexOf vamos
		 * a comprobar si el caracter introducido por el usuario es mayor que -1, con este 
		 * condicional vamos a comprobar los requisitos de que empiece por c y el resto sean vocales
		 * 
		 * 
		 * Con el segundo condicional vamos a comprobar la longitud
		 */
			
			public static String comprobarCategoria(String categoria) {
				int contador = 0;
				String cadena;
				String vocales = "AEIOU";
				boolean comprobar = false;
				for (int i=0; i <= categoria.length()- 1;i++) {
					char caracter = categoria.charAt(i);
					if (vocales.indexOf(caracter) > -1 || (caracter == 'C' && i == 0)) {
						contador++;
					}
				}
				if (categoria.length() >= 2 && categoria.length() < 5 && contador == categoria.length()) {
					comprobar = true;
				}

				if (comprobar == true) {
					cadena = "Categoria correcta";
				} else {
					cadena = "Categoria no correcto";
				}
				return cadena;

			

	}
	
}