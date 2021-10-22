package actividad11;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Actividad11 {

	public static void main(String[] args) throws IOException {
		
		
		//File directorio = new File("./bin");
		ProcessBuilder pb = new ProcessBuilder("java", "actividad10.Actividad10");
		//pb.directory(directorio);
		
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
			System.out.println("El código de salida es: " + codigoSalida);
		} catch (Exception e) {
			System.out.println("Hay una excepción.");
		}

	}

}
