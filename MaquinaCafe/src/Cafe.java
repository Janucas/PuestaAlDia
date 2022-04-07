
public class Cafe {

	//Declaramos las variables
	int cafe;
	int leche;
	int vasos;
	double saldo;
	final int TOTALCAFE=50;
	final int TOTALECHE=50;
	final int TOTALVASOS=80;
	final int PRECIOCAFE=1;
	final double PRECIOLECHE=0.8;
	final double PRECIOCAFECONLECHE=1.5;
	
	//Declaramos el constructor principal

	public Cafe(double saldo) {
		super();
		if (this.saldo<0) {
			this.saldo = saldo;
		}
		this.cafe = this.TOTALCAFE;
		this.leche = this.TOTALECHE;
		this.vasos = this.TOTALVASOS;
	}
	
	//Declaramos los metodos setter y getter

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
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
	
	//Declaramos el resto de metodos
	
	public void llenarVasos() {
		this.cafe=this.TOTALCAFE;
		this.leche=this.TOTALECHE;
		this.vasos=this.TOTALVASOS;
	}
	
	public String servirCafeSolo(double cantidad) {
		String mensaje;
		double vuelta;
		if (cantidad<this.saldo-this.PRECIOCAFE) {
			mensaje="No dispone de saldo suficiente";
		}else if (this.vasos<=0 || this.cafe<=0){
			mensaje="No quedan existencias";
		}
		else {
			this.cafe--;
			this.vasos--;
			this.saldo+=this.PRECIOCAFE;
			vuelta=cantidad-this.PRECIOCAFE;
			mensaje="Aqui tiene su cafe, gracias por su visita.";
			mensaje="Su vuelta es de: "+vuelta;
		}
		return mensaje;
	}
	
	public String servirLecheSola(double cantidad) {
		String mensaje;
		double vuelta;
		if (cantidad<this.saldo-this.PRECIOLECHE) {
			mensaje="No dispone de saldo suficiente";
		}else if (this.vasos<=0 || this.leche<=0){
			mensaje="No quedan existencias";
		}
		else {
			this.leche--;
			this.vasos--;
			this.saldo+=this.PRECIOLECHE;
			vuelta=cantidad-this.PRECIOLECHE;
			mensaje="Aqui tiene su leche, gracias por su visita.";
			mensaje="Su vuelta es de: "+vuelta;
		}
		return mensaje;
	}
	
	public String servirCafeConLeche(double cantidad) {
		String mensaje;
		double vuelta;
		if (cantidad<this.saldo-this.PRECIOCAFECONLECHE) {
			mensaje="No dispone de saldo suficiente";
		}else if (this.vasos<=0 || this.leche<=0 || this.cafe<0){
			mensaje="No quedan existencias";
		}
		else {
			this.leche--;
			this.cafe--;
			this.vasos--;
			this.saldo+=this.PRECIOCAFECONLECHE;
			vuelta=cantidad-this.PRECIOCAFECONLECHE;
			mensaje="Aqui tiene su leche, gracias por su visita.";
			mensaje="Su vuelta es de: "+vuelta;
		}
		return mensaje;
	}
	
	
	
	
	
	
}
