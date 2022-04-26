import java.util.Objects;

public class Avion {
	
	//Declaracion de atributos
	private String idAvion;
	private int capacidad;
	private int numVuelos=0;
	private double kmVolados=0;
	private String compannia;
	
	//Creacion de los constructores principales
	public Avion(String idAvion, int capacidad) {
		super();
		this.idAvion = idAvion;
		this.capacidad = capacidad;
	}

	public Avion(String idAvion, int capacidad, String compannia) {
		super();
		this.idAvion = idAvion;
		this.capacidad = capacidad;
		this.compannia = compannia;
	}
	
	
	//Declaracion de metodos getter y setter
	public String getCompannia() {
		return compannia;
	}

	public void setCompannia(String compannia) {
		this.compannia = compannia;
	}

	public String getIdAvion() {
		return idAvion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getNumVuelos() {
		return numVuelos;
	}

	public double getTotalKm() {
		return kmVolados;
	}
	
	//Metodo get extra que no corresponde con ningun atributo
	public double getMediaKm() {
		double resultado;
		resultado=this.kmVolados/this.numVuelos;
		return resultado;
	}
	
	//Declaracion del resto de metodos
	public boolean asignarVuelo(int capacidad, double km) {
		boolean asignar=false;
		if (capacidad>this.capacidad ||capacidad<0 || km<0) {
			asignar=false;
		}else {
			asignar=true;
			if (asignar==true) {
				this.kmVolados+=km;
				this.numVuelos+=1;
			}
		}
		return asignar;
		

		//Declaracion HashCode, Equals y toString
	}

	@Override
	public int hashCode() {
		return Objects.hash(capacidad, compannia, idAvion, kmVolados, numVuelos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avion other = (Avion) obj;
		return capacidad == other.capacidad && Objects.equals(compannia, other.compannia)
				&& Objects.equals(idAvion, other.idAvion)
				&& Double.doubleToLongBits(kmVolados) == Double.doubleToLongBits(other.kmVolados)
				&& numVuelos == other.numVuelos;
	}

	@Override
	public String toString() {
		return "Avion [idAvion=" + idAvion + ", capacidad=" + capacidad + ", numVuelos=" + numVuelos + ", kmVolados="
				+ kmVolados + ", compannia=" + compannia + "]";
	}
	
	
	
	
	
	
	

}
