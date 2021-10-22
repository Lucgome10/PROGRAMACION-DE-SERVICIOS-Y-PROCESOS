package actividad10;

public class Actividad10 {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido al programa");
		String arg1;
		int num = -1;
	
		if (args.length > 0) {
			arg1 = args[0];
			System.out.println("Se han detectado argumentos.");
			
			try {
				num = Integer.parseInt(arg1);
			} catch (NumberFormatException e) {
				System.exit(2);
			}
			
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
