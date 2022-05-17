public class Punto {
	//Declaracion de los atributos
	private double x;
	private double y;

	//Declaracion de los constructores principales
	public Punto() {
		super();
	}

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//Declaracion de los metodos getter y setter
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y =y;
	}

	//Declaracion de toString
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

}