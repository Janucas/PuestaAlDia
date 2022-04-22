
public class Cafe {

	// Declaramos las variables
	private int cafe;
	private int leche;
	private int vasos;
	private double saldo;
	private static final int TOTALCAFE = 50;
	private static final int TOTALECHE = 50;
	private static final int TOTALVASOS = 80;
	private static final int PRECIOCAFE = 1;
	private static final double PRECIOLECHE = 0.8;
	private static final double PRECIOCAFECONLECHE = 1.5;

	// Declaramos el constructor principal

	public Cafe(double saldo) {
		super();
		this.setSaldo(saldo);
		this.cafe = Cafe.TOTALCAFE;
		this.leche = Cafe.TOTALECHE;
		this.vasos = Cafe.TOTALVASOS;
	}

	// Declaramos los metodos setter y getter

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	public int getCafe() {
		return cafe;
	}

	public int getLeche() {
		return leche;
	}

	public int getVasos() {
		return vasos;
	}

	// Declaramos el resto de metodos

	public void llenarVasos() {
		this.cafe = this.TOTALCAFE;
		this.leche = this.TOTALECHE;
		this.vasos = this.TOTALVASOS;
	}

	public String servirCafeSolo(double cantidad) throws MaquinaException {
		String mensaje;
		double vuelta;
		if (cantidad<=0) {
			throw new MaquinaException ("Error");
		}
		if (cantidad - this.PRECIOCAFE > this.saldo) {
			mensaje = "No dispone de saldo suficiente";
		} else if (this.vasos <= 0 || this.cafe <= 0) {
			mensaje = "No quedan existencias";
		} else if (cantidad < this.PRECIOCAFE) {
			mensaje = "Introduzca la cantidad correcta que se le pide";
		} else {
			this.cafe--;
			this.vasos--;
			this.saldo += this.PRECIOCAFE;
			vuelta = cantidad - this.PRECIOCAFE;
			mensaje = "Aqui tiene su cafe, gracias por su visita.\n" + "Su vuelta es de: " + vuelta;
		}
		return mensaje;
	}

	public String servirLecheSola(double cantidad) {
		String mensaje;
		double vuelta;
		if (cantidad - this.PRECIOLECHE > this.saldo) {
			mensaje = "No dispone de saldo suficiente";
		} else if (this.vasos <= 0 || this.leche <= 0) {
			mensaje = "No quedan existencias";
		} else if (cantidad < this.PRECIOCAFE) {
			mensaje = "Introduzca la cantidad correcta que se le pide";
		} else {
			this.leche--;
			this.vasos--;
			this.saldo += this.PRECIOLECHE;
			vuelta = cantidad - this.PRECIOLECHE;
			mensaje = "Aqui tiene su leche, gracias por su visita.\n" + "Su vuelta es de: " + vuelta;
		}
		return mensaje;
	}

	public String servirCafeConLeche(double cantidad) {
		String mensaje;
		double vuelta;
		if (cantidad - this.PRECIOCAFECONLECHE > this.saldo) {
			mensaje = "No dispone de saldo suficiente";
		} else if (this.vasos <= 0 || this.leche <= 0 || this.cafe < 0) {
			mensaje = "No quedan existencias";
		} else if (cantidad < this.PRECIOCAFECONLECHE) {
			mensaje = "Introduzca la cantidad correcta que se le pide";
		} else {
			this.leche--;
			this.cafe--;
			this.vasos--;
			this.saldo += this.PRECIOCAFECONLECHE;
			vuelta = cantidad - this.PRECIOCAFECONLECHE;
			mensaje = "Aqui tiene su cafe con leche, gracias por su visita.\n" + "Su vuelta es de: " + vuelta;
		}
		return mensaje;
	}

	
	@Override
	public String toString() {
		return "Cafe [cafe=" + cafe + ", leche=" + leche + ", vasos=" + vasos + ", saldo=" + saldo + "]";
	}

	
}
