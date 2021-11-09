package actividad13;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;


/*
 * Programa que lea de forma indefinida cadenas por consola (entrada estándar) hasta que
 * se introduzca la cadena “ADIOS”.
 */
public class Actividad13_Ejecucion {
	
	// He tenido problemas con la sincronización de los flujos del programa de ejecución
	// y el programa. 
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.out.println("EJEC: Inicio de Actividad13_Ejecucion");
		
		File directorio = new File("./bin");
		ProcessBuilder pb = new ProcessBuilder("java", "actividad13.Actividad13");
		pb.directory(directorio);
		Process p = pb.start();
		int codigoSalida;
		String palabra = "";
		
		
		do {
			System.out.println("EJEC: Introduce una cadena.");
			palabra = scanner.nextLine() + "\n";
			OutputStream os = p.getOutputStream();
			os.write(palabra.getBytes());
			os.flush();	
		} while (!palabra.equals("ADIOS\n"));
			
		
		System.out.println("EJEC: Ejecutando InputStream");
		InputStream is = p.getInputStream();
		int c;
		while ((c = is.read()) != -1) {
			System.out.print((char) c);
		}
		is.close();
		
		
		try {
			codigoSalida = p.waitFor();
			System.out.println("Código de salida: " + codigoSalida);
		} catch (Exception e) {
			System.out.println("Hay una excepción.");
		}
		
		
	}
}
