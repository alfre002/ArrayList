package ejercicio5;

public class Persona {

	// atributos
	private String dni;
	private String nombre;
	private String apellidos;
	private char sexo;
	private int edad;
	private double peso;

	// constructor con parametros
	public Persona(String dni, String nombre, String apellidos, char sexo, int edad, double peso) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
	}

	// constructor sin parametros
	public Persona() {
	}

	// getters y setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "DNI: " + dni + "\nNombre: " + nombre + "\nApellidos: " + apellidos + "\nSexo: " + sexo + "\nEdad: "
				+ edad + "\nPeso: " + peso + "\n\n";
	}
	
	

}
