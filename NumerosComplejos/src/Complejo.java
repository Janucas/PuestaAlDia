
public class Complejo {
	
	//Declaramos los atributos
	private double parteReal;
	private double parteImaginaria;
	
	//Declaramos el constructor principal
	public Complejo(double parteReal, double parteImaginaria) {
		super();
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}

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
	
	public Complejo sumaComplejos(Complejo numero2) {
		double resultadoParteReal;
		double resultadoParteImaginaria;
		resultadoParteReal=this.parteReal+numero2.getParteReal();
		resultadoParteImaginaria=this.parteImaginaria+numero2.getParteImaginaria();
		Complejo n3=new Complejo(resultadoParteReal, resultadoParteImaginaria);
		return n3;
		
		public Complejo restaComplejos(Complejo numero2) {
			double resultadoParteReal;
			double resultadoParteImaginaria;
			resultadoParteReal=this.parteReal-numero2.getParteReal();
			}
	}
	
	
}
