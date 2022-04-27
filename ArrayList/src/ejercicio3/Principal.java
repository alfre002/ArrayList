package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	static Scanner st = new Scanner(System.in);

	public static void main(String[] args) {

		// crear arraylist
		ArrayList<String> cadenas = new ArrayList();
		
		leerArray(cadenas);
		
		System.out.println("La cadena más larga es: " + cadenaMasLarga(cadenas));

	}

	public static void leerArray(ArrayList<String> cadenas) {

		System.out.println("Introduzca cadenas de caracteres, se dejará de introducir cadenas cuando se lea la "
				+ "palabra <fin>");

		String cadena;
		boolean seguir = true;
		
		cadena = st.nextLine();
		
		do {

			cadena = st.nextLine();
			
			if(cadena.toUpperCase().equals("FIN")) {
				seguir = false;
			} else {
				cadenas.add(cadena);
			}

		} while (seguir);
	}
	
	public static String cadenaMasLarga(ArrayList<String> cadenas) {
		
		String resultado = cadenas.get(0);
		
		for (String x : cadenas) {
			if(x.length() > resultado.length()) {
				resultado = x;
			}
		}
		return resultado;
	}

}
