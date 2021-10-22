package ud1.activ8;

public class Actividad8 {

	public static void main(String[] args) {
		
		try {
            int numero = Integer.parseInt(args[0]);			
			System.out.println("El cubo es: " + (numero  *numero * numero));
			System.exit(1);
		} catch (Exception e) {
			System.exit(-1);
		}
		
	}

}
