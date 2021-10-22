package ud1.activ5;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* ENUNCIADO:
Elabora un programa en java que reciba como argumento el nombre de una aplicación (o ejecutable)
que se desee ejecutar. El programa debe validar que se haya pasado un argumento.
*/

public class Actividad6 {

	public static void main(String[] args) throws IOException {
		
		//Comprobar si no se ha pasado ningún argumento.
		if (args.length==0) {
			System.out.println("Amigo, no has introducido ningún argumento");
			
		} else {	
			//Inicio de un proceso con el primer argumento que se haya pasado.
			ProcessBuilder pb = new ProcessBuilder(args[0]);
			Process p = pb.start();

			try {
				//Espera de 3 segundos (3000 milisegundos) antes de destruir el proceso.
				p.waitFor(3000, TimeUnit.MILLISECONDS);
				p.destroy();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
