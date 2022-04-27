package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner st = new Scanner(System.in);
	static Scanner ent = new Scanner(System.in);
	static ArrayList<Coches> coches = new ArrayList();

	public static void main(String[] args) {

		char añadir;
		
		do {
			leerDatos();
			System.out.println("¿Quiere añadir otro coche?");
			añadir = st.nextLine().toUpperCase().charAt(0);
		} while(añadir == 'S');
		
		System.out.println(coches);
		
		// filtrar por marca
		cochesMarca(coches);
		
		// filtrar por kms
		menosKm(coches);
		
		// mayor kms
		mayorKm(coches);
	}
	
	public static void leerDatos() {
		Coches aux;
		String matricula, marca, modelo;
		int km;
		
		System.out.println("Introduzca los datos del coche.");
		System.out.println("Matrícula:");
		matricula = st.nextLine();
		System.out.println("Marca:");
		marca= st.nextLine();
		System.out.println("Modelo:");
		modelo = st.nextLine();
		System.out.println("Kms:");
		km = ent.nextInt();
		
		aux = new Coches();
		
		aux.setKm(km);
		aux.setMarca(marca);
		aux.setMatricula(matricula);
		aux.setModelo(modelo);
		
		coches.add(aux);
	}
	
	public static void cochesMarca(ArrayList<Coches> coches) {
		String marca;
		
		System.out.println("¿Cuál es la marca de coches que quiere mostrar?");
		marca = st.nextLine();
		
		for (int i = 0; i < coches.size(); i++) {
			
			if(marca.equals(coches.get(i).getMarca())) {
				System.out.println(coches.get(i));
			}
		}
	}
	
	public static void menosKm(ArrayList<Coches> coches) {
		int km;
		
		System.out.println("Introduzca los kms para mostrar los coches con menos nº de kms que los introducidos");
		km = ent.nextInt();
		for (int i = 0; i < coches.size(); i++) {
			if(km > coches.get(i).getKm()) {
				System.out.println(coches.get(i));
			}
		}
	}
	
	public static void mayorKm(ArrayList<Coches> coches) {
		Coches mayor = coches.get(0);
		
		for (int i = 0; i < coches.size(); i++) {
			if(coches.get(i).getKm() > mayor.getKm()) {
				mayor = coches.get(i);
			}
		}
		System.out.println("El coche con mayor nº de kms recorridos es: " + mayor);
	}
	
	// no se
	public static void ordenarPorKms(ArrayList<Coches> coches) {
		Coches menor = coches.get(0);
		Coches siguiente;
		
		for (int i = 0; i < coches.size(); i++) {
			if(coches.get(i).getKm() < menor.getKm()) {
				menor = coches.get(i);
			}
		}
		
	}

}
