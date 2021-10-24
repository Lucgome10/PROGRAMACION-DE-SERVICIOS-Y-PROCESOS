package actividad16;

import java.io.File;
import java.io.IOException;

// Crea un programa que ejecute el elaborado en la actividad 15 pero que lea las cadenas desde un
// fichero y la salida se envíe a otro fichero.

public class Actividad16 {

	public static void main(String[] args) {

		// Se procede a ejecutar el programa Actividad15.
		File directorio = new File("./bin");
		ProcessBuilder pb = new ProcessBuilder("java", "actividad15/Actividad15");
		pb.directory(directorio);		
		
		// Ruta relativa de los ficheros donde voy a redirigir la entrada y salida.
		File fEntrada = new File("src\\actividad16\\entrada.bat");
		File fSalida = new File("src\\actividad16\\salida.txt");
				
		try {
			fSalida.createNewFile(); // Genero el fichero de salida. El de entrada ya lo he generado desde fuera del programa.
			pb.redirectOutput(fSalida); // Redirigiendo la salida.
			pb.redirectInput(fEntrada); // Redirigiendo la entrada.
			pb.start();
		} catch (IOException e1) {
			e1.printStackTrace();
		}	
		
	}

}
