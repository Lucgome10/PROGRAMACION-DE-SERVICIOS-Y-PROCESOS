package ud1.activ5;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Actividad6 {

	public static void main(String[] args) throws IOException {
		
		if (args.length==0) {
			System.out.println("Amigo, no has introducido ningún argumento");
			
		} else {		
			ProcessBuilder pb = new ProcessBuilder(args[0]);
			Process p = pb.start();

			try {
				p.waitFor(3000, TimeUnit.MILLISECONDS);
				p.destroy();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
