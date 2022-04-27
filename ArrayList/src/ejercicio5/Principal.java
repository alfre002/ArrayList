package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	static ArrayList<Persona> personas = new ArrayList(); // arraylist
	static Scanner st = new Scanner(System.in);
	static Scanner ent = new Scanner(System.in);
	static Scanner dou = new Scanner(System.in);

	public static void main(String[] args) {

		char añadir;

		do {
			leerDatos();
			System.out.println("¿Quiere introducir otra persona?");
			añadir = st.nextLine().toUpperCase().charAt(0);
		} while (añadir == 'S');

		System.out.println(personas);

		// buscar por dni
		buscarDNI(personas);

		// eliminar persona
		eliminarPersona(personas);

		System.out.println("\nLista actualizada:");
		System.out.println(personas);
	}

	public static void leerDatos() {
		String dni, nombre, apellidos;
		char sexo;
		int edad;
		double peso;
		Persona aux;

		System.out.println("Introduzca los datos de la persona:");

		System.out.println("DNI:");
		dni = st.nextLine();
		System.out.println("Nombre:");
		nombre = st.nextLine();
		System.out.println("Apellidos:");
		apellidos = st.nextLine();
		System.out.println("Sexo:");
		sexo = st.nextLine().charAt(0);
		System.out.println("Edad:");
		edad = ent.nextInt();
		System.out.println("Peso:");
		peso = dou.nextDouble();

		aux = new Persona();

		aux.setApellidos(apellidos);
		aux.setDni(dni);
		aux.setEdad(edad);
		aux.setNombre(nombre);
		aux.setPeso(peso);
		aux.setSexo(sexo);

		personas.add(aux);
	}

	public static void buscarDNI(ArrayList<Persona> personas) {
		String dni;

		System.out.println("Introduzca el dni de la persona que quiere buscar");
		dni = st.nextLine();

		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i).getDni().equals(dni)) {
				System.out.println(personas.get(i));
			}
		}
	}

	public static void eliminarPersona(ArrayList<Persona> personas) {
		String dni;

		System.out.println("Introduzca el dni de la persona que quiere eliminar");
		dni = st.nextLine();

		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i).getDni().equals(dni)) {
				personas.remove(i);
				System.out.println("Persona eliminada con éxito de la lista");
			}
		}
	}
	
	public static void ordenarApellido(ArrayList<Persona> personas) {
		System.out.println("Lista de personas ordenada por apellidos.");
		
	}

}
