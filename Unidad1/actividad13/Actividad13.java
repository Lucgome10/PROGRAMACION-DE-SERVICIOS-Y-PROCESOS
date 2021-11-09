package actividad13;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

// programa que lea de forma indefinida cadenas por consola (entrada estándar) hasta que
// se introduzca la cadena “ADIOS”.

public class Actividad13 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String adios = "";
		
		//System.out.println("ACT: Bienvenido a la Actividad 13"); 
		
		while (!adios.equals("ADIOS")) {
			try {
				//System.out.println("ACT: Introduce una cadena:");
				adios = br.readLine();
				System.out.println("ACT: Cadena introducida: " + adios);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("ACT: Cadena introducida: " + adios + " finalizando ACT13");
		br.close();

			
	}

	
	
}
