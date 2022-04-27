package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {
	
	static Scanner ent = new Scanner(System.in);

	public static void main(String[] args) {

		// crear arraylist
		ArrayList<Integer> numeros = new ArrayList();
		
		// leer valores
		leerValores(numeros);
		
		int suma = calcularSuma(numeros);
		
		double media = calcularMedia(numeros, suma);
		
		mostrarResultados(numeros, suma, media);
		
	}
	
	public static ArrayList<Integer> leerValores(ArrayList<Integer> numeros){
		
		System.out.println("Introduzca números enteros para introducir en el ArrayList,"
				+ " se dejará de introducir valores cuando se encuentre el -99");
		int valores;
		
		do {
			valores = ent.nextInt();
			if(valores != -99) {
			numeros.add(valores);
			}
			
		} while(valores != -99);
		
		return numeros;
	}
	
	public static int calcularSuma(ArrayList<Integer> numeros) {
				
		int suma = 0;
		
		Iterator<Integer> it = numeros.iterator();
		while(it.hasNext()) {
			suma += it.next();
		}
		
		return suma;
		
	}
	
	public static double calcularMedia(ArrayList<Integer> numeros, int suma) {
		
		return suma / numeros.size();
		
	}
	
	public static void mostrarResultados(ArrayList<Integer> numeros, int suma, double media) {
		
		// muestra todos los valores
		System.out.println("Los valores del ArrayList son: " + numeros);
		
		// muestra suma
		System.out.println("La suma de los números introducidos es: " + suma);
		
		// muestra media
		System.out.println("La media de los números introducidos es: " + calcularMedia(numeros,suma));
		
	}

}
