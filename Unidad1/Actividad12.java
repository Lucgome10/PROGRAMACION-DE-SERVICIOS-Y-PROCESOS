package actividad12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Actividad12 {

	// Programa que lee dos n�meros desde la entrada est�ndar y muestra
	// por consola la suma de ambos.
	public static void main(String[] args) {
		
		System.out.println("Bienvenido a la Actividad 12");
				
		try {
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			 System.out.println("Introduce el primer n�mero:"); 
			 int a = Integer.parseInt(br.readLine()); 
		     System.out.println("Introduce el segundo n�mero:"); 
		     int b = Integer.parseInt(br.readLine()); 
		     System.out.printf("La suma de los dos n�meros es: " + (a+b)); 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
