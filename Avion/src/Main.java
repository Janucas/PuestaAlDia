import java.util.Scanner;

public class Main {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion1;
		char opcion2;

		Avion a1 = null;

		do {
			// Indicamos al usuario que indique una opcion en el primer menu
			System.out.println("Elije una opcion");
			System.out.println(menu1());
			opcion1 = Integer.parseInt(teclado.nextLine());
			
			if (opcion1 == 1) {
				
				System.out.println("Introduce el identificador");
				String identif = teclado.nextLine();
				a1 = new Avion(identif,200);
			}else {
				System.out.println("Introduce el identificador");
				String identif = teclado.nextLine();
				System.out.println("Introduce la compañia");
				String compannia=teclado.nextLine();
				a1= new Avion(identif,200,compannia);
				
				}
			
		} while (opcion1 != 1 && opcion1 != 2);

		// Indicamos al usuario que indique una opcion en el segundo menu
		System.out.println("Elije una opcion");
		System.out.println(menu2());
		opcion2 = teclado.nextLine().charAt(0);
		System.out.println(a1);
		while (opcion2 != 'g') {
			switch (opcion2) {

			case 'a': {
				int capacidad;
				double km;
				System.out.println("Introduce la capacidad");
				capacidad = Integer.parseInt(teclado.nextLine());

				System.out.println("Introduce el numero de kilometros");
				km = Integer.parseInt(teclado.nextLine());

				System.out.println(a1.asignarVuelo(capacidad, km));
				break;
			}
			case 'b': {
				System.out.println(a1.getNumVuelos());
				break;
			}
			case 'c': {
				System.out.println(a1.getTotalKm());
				break;
			}
			case 'd': {
				System.out.println(a1.getMediaKm());
				break;
			}
			case 'e': {
				String compannia;
				System.out.println("Que compañia ha comprado el avion");
				compannia = teclado.nextLine();
				a1.setCompannia(compannia);
				System.out.println(a1);
				break;
			}
			case 'f': {
				System.out.println(a1.toString());
				break;
			}
			case 'g': {
				System.out.println("Salir");
			}

			}
			System.out.println(a1);
			System.out.println("Elije una opcion");
			System.out.println(menu2());
			opcion2 = teclado.nextLine().charAt(0);

		}

	}

	private static String menu1() {
		return "1.Crear avion solo con el identificador \n" + "2.Crear avion con el identificador y la compañia";
	}

	private static String menu2() {
		return "a.Asignar vuelo \n" + "b.Obtener el numero de vuelos \n" + "c.Obtener numero de kilometros \n"
				+ "d.Obtener la media de km por vuelo \n" + "e.Cambio de compañia \n"
				+ "f.Mostrar informacion del avion \n" + "G.Salir";
	}

}
