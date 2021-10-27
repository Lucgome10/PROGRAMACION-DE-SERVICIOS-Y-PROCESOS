package actividad15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Crea un programa que lea cadenas desde consola y visualice el n�mero de vocales y consonantes
// que tiene.

public class Actividad15 {

	public static void main(String[] args) {
		
		// Se utiliza la clase BufferedReader para lectura de consola.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cadena = null;
		
		// Se generan dos String para guardar las vocales y consonantes y poder comprobar 
		// si los caracteres analizados se encuentran inclu�dos en alguna de ellas.
		String vocales = "aeiouAEIOU";
		String consonantes = "bcdfghjklmn�pqrstvwxyzBCDFGHJKLMN�PQRSTVWXYZ";
		int numVocales = 0;
		int numConsonantes = 0;
		
		System.out.println("ACTIVIDAD 15: Introduce las cadenas que desees y pulsa INTRO");		
		
		try {
			cadena = br.readLine(); // Lectura de frase desde consola.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		char[] cad = cadena.toCharArray(); // Conversi�n de la cadena a array de chars para poder iterar por ellos.
				
		// Si el �ndice es mayor que 0 significa que s� se encuentra en la String.
		for (char c : cad) {
			if (vocales.indexOf(c) >= 0) { 
				numVocales++;
			} else if (consonantes.indexOf(c) >= 0) {
				numConsonantes++;
			}
		}
		
		System.out.println("La cadena era: " + cadena);
		System.out.println("Vocales: " + numVocales);
		System.out.println("Consonantes: " + numConsonantes);
		
	}

}
