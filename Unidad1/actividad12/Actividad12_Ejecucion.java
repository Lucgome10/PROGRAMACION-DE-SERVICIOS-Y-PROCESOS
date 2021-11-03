package actividad12;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Actividad12_Ejecucion {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {

		File directorio = new File("./bin");
		ProcessBuilder pb = new ProcessBuilder("java", "actividad12.Actividad12");
		pb.directory(directorio);
		Process p = pb.start();
		int codigoSalida;
		
		OutputStream os = p.getOutputStream();
		
		os.write((scanner.nextLine() + "\n").getBytes());
		os.write((scanner.nextLine() + "\n").getBytes());
		os.close();
				
		InputStream is = p.getInputStream();
		int c;
		while ((c = is.read()) != -1) {
			System.out.print((char) c);
		}
		is.close();
		
		try {
			codigoSalida = p.waitFor();
			System.out.println("\nCódigo de salida: " + codigoSalida);
		} catch (Exception e) {
			System.out.println("Hay una excepción.");
		}
		
	}

}
