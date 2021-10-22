package actividad9;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Actividad9 {

	
	// Crea un programa en java que ejecute el programa de la actividad 8. 
	// Haciendo uso del método adecuado, recoge el código de salida del programa que se ejecuta.
	
	public static void main(String[] args) throws IOException {
		
		File directorio = new File("./bin");
		ProcessBuilder pb = new ProcessBuilder("java", "ud1.activ8.Actividad8", "3");
		pb.directory(directorio);
		
		Process p = pb.start();
		
		InputStream is = p.getInputStream();
		int c;
		while ((c = is.read()) != -1) {
			System.out.print((char) c);
		}
		is.close();
		
		
		
		int codigoSalida;
		
		try {
			codigoSalida = p.waitFor();
			System.out.println(codigoSalida);
		} catch (Exception e) {
			System.out.println("Hay una excepción.");
		}
		
		

	}

}
