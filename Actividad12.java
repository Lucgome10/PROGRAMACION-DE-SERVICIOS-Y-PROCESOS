package actividad12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Actividad12 {

	// Programa que lee dos números desde la entrada estándar y muestra
	// por consola la suma de ambos.
	public static void main(String[] args) {
		
		System.out.println("Bienvenido a la Actividad 12");
				
		try {
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			 System.out.println("Introduce el primer número:"); 
			 int a = Integer.parseInt(br.readLine()); 
		     System.out.println("Introduce el segundo número:"); 
		     int b = Integer.parseInt(br.readLine()); 
		     System.out.printf("La suma de los dos números es: " + (a+b)); 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
