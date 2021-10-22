package actividad10;

/*
	Crea un programa en java que admita argumentos en el método main() y que el código de salida del
	programa sea:
		a. 1 en caso de que no haya argumentos.
		b. 2 en caso de que el argumento sea una cadena.
		c. 3 en caso de que se reciba un número entero entre 1 y 9 (ambos incluidos).
		d. 0 en cualquier otro caso.
*/

public class Actividad10 {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido al programa");
		String arg1;
		int num = -1;
		
		// Primero comprueba si hay al menos un argumento para exit(1) en caso de que no los haya.
		if (args.length > 0) {
			arg1 = args[0];
			System.out.println("Se han detectado argumentos.");
			
			try {
				num = Integer.parseInt(arg1);
				
			//Si hay una NumberFormatException es porque el argumento no es un número, por lo que exit(2)
			} catch (NumberFormatException e) { 
				System.exit(2);
			}
			
			//Si no se ha producido excepción, es un número. Ahora se comprueba si está entre los valores 1 y 9 incluídos.
			if ((num != -1) && num>0 && num<10) {
				System.exit(3);
			} else {
				System.exit(0);
			}
			
		} else {
			System.exit(1);
		}
		

		
		

	}

}
