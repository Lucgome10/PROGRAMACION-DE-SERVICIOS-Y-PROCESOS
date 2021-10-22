package actividad11;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;


// Crea un programa en java que ejecute el desarrollado en la actividad 10 y que informe al usuario del
// código de salida generado.

public class Actividad11 {

	public static void main(String[] args) throws IOException {
		
		// Generando proceso. El programa se encuentra en el mismo proyecto, en el paquete actividad10
		ProcessBuilder pb = new ProcessBuilder("java", "actividad10.Actividad10");	
		Process p = pb.start();
		
		//Creando flujo de entrada.
		InputStream is = p.getInputStream();
		int c;
		//Mientras quede algo por leer, lo imprime por pantalla.
		while ((c = is.read()) != -1) {
			System.out.print((char) c);
		}
		is.close();
		
		
		
		int codigoSalida;
		
		try {
			//Recogida de valor de salida de Actividad10
			codigoSalida = p.waitFor();
			System.out.println("El código de salida es: " + codigoSalida);
		} catch (Exception e) {
			System.out.println("Hay una excepción.");
		}

	}

}
