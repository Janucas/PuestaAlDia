import java.util.Scanner;

public class DecimalBinario {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String numero;
		System.out.println("Introduzca un numero que quieras pasar a binario");
		numero = teclado.nextLine();
		System.out.println(decimalABinario(numero));
	}
	
	//Metodo
	public static String decimalABinario(String numero) {
		String binario = "";
		int decimal = Integer.parseInt(numero);
		int digito;
		int DIVISOR = 2;
		for (int i = decimal, j = 0; i > 0; i /= DIVISOR, j++) {
			digito = i % DIVISOR;
			binario = (int) Math.pow(digito, j) + binario;
		}
		return binario;
	}
	
	
	

}
