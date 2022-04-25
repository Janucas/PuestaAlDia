import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int opc = 0;
		String menu = menu();

		while (opc != 3) {
			System.out.println(menu());
			System.out.println("Introduce una opcion");
			opc = Integer.parseInt(teclado.nextLine());
			switch (opc) {
			case 1: {
				double parteReal = 0, parteImaginaria = 0;
				//Creacion del primer numero
				System.out.println("Introduce la parte real de tu numero");
				parteReal = Double.parseDouble(teclado.nextLine());
				
				System.out.println("Introduce la parte imaginaria de tu numero");
				parteImaginaria = Double.parseDouble(teclado.nextLine());
				
				Complejo n1=new Complejo(parteReal, parteImaginaria);

				
				//Creacion del segundo numero
				System.out.println("Introduce la parte real de tu numero");
				parteReal = Double.parseDouble(teclado.nextLine());
				
				System.out.println("Introduce la parte imaginaria de tu numero");
				parteImaginaria = Double.parseDouble(teclado.nextLine());
				
				Complejo n2=new Complejo(parteReal, parteImaginaria);

				
				System.out.println(n1.sumaComplejos(n2));
				break;
			}
			case 2: {
				double parteReal = 0, parteImaginaria = 0;
				//Creacion del primer numero
				System.out.println("Introduce la parte real de tu numero");
				parteReal = Double.parseDouble(teclado.nextLine());
				
				System.out.println("Introduce la parte imaginaria de tu numero");
				parteImaginaria = Double.parseDouble(teclado.nextLine());
				
				Complejo n1=new Complejo(parteReal, parteImaginaria);

				
				//Creacion del segundo numero
				System.out.println("Introduce la parte real de tu numero");
				parteReal = Double.parseDouble(teclado.nextLine());
				
				System.out.println("Introduce la parte imaginaria de tu numero");
				parteImaginaria = Double.parseDouble(teclado.nextLine());
				
				Complejo n2=new Complejo(parteReal, parteImaginaria);
				
				System.out.println(n1.restaComplejos(n2));
				break;
				
			}
			default:
				System.out.println("Error");
			}
			System.out.println(menu());
			System.out.println("Introduce una opcion");
			opc=Integer.parseInt(teclado.nextLine());
		}

	}

	public static String menu() {
		return "1. Sumar complejos\n" + "2.Restar complejos\n" + "3.Salir";
	}
}
