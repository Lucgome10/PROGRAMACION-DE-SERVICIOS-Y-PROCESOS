package actividad12;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

//Programa que ejecuta el anterior.

public class Actividad12_Ejecucion {


	public static void main(String[] args) throws IOException {

		ProcessBuilder pb = new ProcessBuilder("java", "actividad12.Actividad12");	
		Process p = pb.start();
		
	}

}
