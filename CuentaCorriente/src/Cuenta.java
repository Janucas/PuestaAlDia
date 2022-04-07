
public class Cuenta {
	String numeroCuenta;
	double saldo;
	int numeroIngreso, numeroRetirada;
	
	//Generamos el constructor de la clase

	public Cuenta(String numeroCuenta, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		if (saldo<0) {
		this.saldo = 0;
		}else {
			this.saldo=saldo;
		}
		this.numeroIngreso = 0;
		this.numeroRetirada = 0;
	}
	
	//Generamos los metodos getter y setter

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public int getNumeroIngreso() {
		return numeroIngreso;
	}

	public int getNumeroRetirada() {
		return numeroRetirada;
	}
	
	//Creamos los metodos adicionales
	public boolean retirar(double cantidad) {
		boolean resultado;
		if (cantidad<0 || cantidad>this.saldo) {
			resultado=false;
		}else {
			resultado=true;
			this.saldo-=cantidad;
			this.numeroRetirada+=1;
		}
		return resultado;
	}
	
	public boolean ingresar(double cantidad) {
		boolean resultado;
		if (cantidad<0) {
			resultado=false;
		}else {
			resultado=true;
			this.saldo+=cantidad;
			this.numeroIngreso+=1;
		}
		return resultado;
	}
	
	
	
	
	
	

}
