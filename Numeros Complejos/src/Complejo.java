import java.util.Objects;

public class Complejo {
	private double parteReal;
	private double parteImaginaria;

	public Complejo(double parteReal, double parteImaginaria) {

		// Declaracion del constructor principal
		super();
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}

	// Declaracion de los metodos get y set

	public double getParteReal() {
		return parteReal;
	}

	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}

	public double getParteImaginaria() {
		return parteImaginaria;
	}

	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}

	// Declaracion del resto de metodos
	public Complejo sumaComplejos(Complejo numero) {
		double resultadoParteReal;
		double resultadoParteImaginaria;
		resultadoParteReal = this.parteReal + numero.getParteReal();
		resultadoParteImaginaria = this.parteImaginaria + numero.getParteImaginaria();
		Complejo n = new Complejo(resultadoParteReal, resultadoParteImaginaria);
		return n;
	}

	public Complejo restaComplejos(Complejo numero) {
		double resultadoParteReal;
		double resultadoParteImaginaria;
		resultadoParteReal = this.parteReal - numero.getParteReal();
		resultadoParteImaginaria = this.parteImaginaria - numero.getParteImaginaria();
		Complejo n = new Complejo(resultadoParteReal, resultadoParteImaginaria);
		return n;
	}

	@Override
	public String toString() {
		return "Complejo [parteReal=" + parteReal + ", parteImaginaria=" + parteImaginaria + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(parteImaginaria, parteReal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		return Double.doubleToLongBits(parteImaginaria) == Double.doubleToLongBits(other.parteImaginaria)
				&& Double.doubleToLongBits(parteReal) == Double.doubleToLongBits(other.parteReal);
	}

}
