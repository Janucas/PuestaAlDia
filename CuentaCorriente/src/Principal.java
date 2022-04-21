import java.util.Scanner;

public class Principal {
	
	public static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		
		//Objeto
		Cuenta c1=new Cuenta("111111", 500);

		char opcion;
		double cantidad=0;
		
		String menu=menu();
		System.out.println("Bienvenido al Janujero");
		System.out.println(menu());
		System.out.println("Elija una opcion");
		opcion=teclado.nextLine().charAt(0);
		
		while (opcion != 4) {
			switch(opcion) {
			case '1':{
				System.out.println("Introduce una cantidad");
				cantidad=Double.parseDouble(teclado.nextLine());
				if (c1.retirar(cantidad)==true) {
					System.out.println("Su dinero ha sido retirado con exito");
				}else {
					System.out.println("No hemos podido realizar su operacion");
				}
			}
			break;
			case '2':{
				System.out.println("Introduce una cantidad");
				cantidad=Double.parseDouble(teclado.nextLine());
				if (c1.ingresar(cantidad)==true) {
					System.out.println("Su dinero ha sido retirado con exito");
				}else {
					System.out.println("No hemos podido realizar su operacion");
				}
			}
			break;
			case '3':{
				System.out.println("El saldo total de tu cuenta es: "+ c1.getSaldo()+"El numero total de ingresos es: "
						+ c1.getNumeroIngreso() +"El numero total de retiradas es: " + c1.getNumeroRetirada());
			}
			break;
			case '4':{
				System.out.println(c1.getSaldo());
			}
			break;
			default:
				System.out.println("Error");
			}
			System.out.println(menu());
			System.out.println("Elija una opcion");
			opcion=teclado.nextLine().charAt(0);
		}
		
	}
	
	public static String menu() {
		return "1-.Retirar dinero\n"+"2-.Ingresar dinero\n"+"3-.Consultar saldo y operaciones\n"+"4-.Salir\n";
	}

}
