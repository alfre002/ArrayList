package ejercicio4;

public class Coches {

	// atributos
	private String matricula;
	private String marca;
	private String modelo;
	private int km;

	// constructor
	public Coches(String matricula, String marca, String modelo, int km) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
	}

	public Coches() {
	}

	// getters y setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "Matrícula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nKms: " + km + "\n\n";
	}
}
