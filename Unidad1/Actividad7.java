
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
Elabora un programa en java que permita abrir cualquier aplicación y que pasados 5 segundos la
cierre y el programa finalice.
*/

public class Act6 {

	public static void main(String[] args) throws IOException {
		
		// Primero se comprueba si hay argumentos.
		if (args.length==0) {
			System.out.println("Amigo, no has introducido ningún argumento");
		} else {
			//Se inicia el proceso.
			System.out.println("Se ha detectado el argumeto " + args[0]);
			ProcessBuilder pb = new ProcessBuilder(args[0]);
			System.out.println("Vamos a abrir el programa " + args[0]);
			Process p = pb.start();

			try {
				//Se espera el plazo de 3 segundos y se destruye el proceso.
				p.waitFor(3000, TimeUnit.MILLISECONDS);
				p.destroy();
				System.out.println("Destruyendo " + args[0] + " tras 3000ms");

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
