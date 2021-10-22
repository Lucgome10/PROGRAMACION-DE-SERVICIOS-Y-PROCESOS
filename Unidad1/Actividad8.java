package ud1.activ8;

/*
Crea un programa que reciba desde los argumentos del método main() 1 número e imprima por
consola el cubo de ese número. Utiliza el código 1 (System.exit(1)) cuando el programa finalice de
forma correcta y el código -1 cuando la finalización no sea correcta.
*/

public class Actividad8 {

	public static void main(String[] args) {
		
		
		try {
			//Es necesario convertir el argumento a int porque se recoge como String.
            		int numero = Integer.parseInt(args[0]);			
			System.out.println("El cubo es: " + (numero  *numero * numero));
			System.exit(1);
		} catch (Exception e) {
			System.exit(-1);
		}
		
	}

}
