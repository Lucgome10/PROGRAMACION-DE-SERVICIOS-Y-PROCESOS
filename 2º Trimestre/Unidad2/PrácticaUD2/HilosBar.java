package practica_ud2_hilosBar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Semaphore;


public class HilosBar {
	
	private static ArrayList<Cliente> clientes = new ArrayList<>();
	private static ArrayList<String> nombres = new ArrayList<String>(Arrays.asList("Manuel", "Sofía", "Ignacio", "Bárbara", "Luis", "Carmina", 
			"Adefesio", "Sandalio", "Josefina", "Angelines", "José Félix", "Juncal", "Federico", "Silvia", "Estefanía", "Flor", "Juan",
			"Guillermo", "Sara", "Javier", "Diego", "Pablo", "Rodrigo", "Adrián", "Carlos", "Lucas"));
	

	public static void main(String[] args) {
		Random random = new Random();
		int numClientes = random.nextInt(4) + 8;
		System.out.println("Número de clientes en el bar esta noche: " + numClientes);
		Semaphore semaphore = new Semaphore(5);
		System.out.println("En el bar hay un espacio inicial de: " + semaphore.availablePermits() + " clientes simultáneos.");


		// Generar un cliente nuevo(hilo) con un nombre diferente.
		boolean nombreExistente = false;
		for (int i = 0; i < numClientes; i++) {
			// Darle al cliente un nombre de la lista nombres que no haya sido utilizado todavía.
			String nombreCliente;
			do {
				int numNombre = random.nextInt(12);
				nombreCliente = nombres.get(numNombre);
				//System.out.println("El nombre cliente aleatorio es: " + nombreCliente);
				if (!clientes.isEmpty()) {
					for (Cliente c : clientes) {
						if (c.getNombre().equalsIgnoreCase(nombreCliente)) {
							//System.out.println("Ya hay un cliente con el nombre " + nombreCliente);
							//System.out.println("Hay insertados " + clientes.size() + " clientes.");
							nombreExistente = true;
						} else {
							//System.out.println("El nombre " + nombreCliente + " no existe aún.") ;
							nombreExistente = false;
						}
					}
				}
			} while (nombreExistente);
			//System.out.println("Añadiendo cliente con el nombre: " + nombreCliente);
			clientes.add(new Cliente(semaphore, nombreCliente));
		}
		System.out.println("*Todos los clientes generados correctamente, hay " + clientes.size() + "*");

		for (int i = 0; i < clientes.size(); i++) {
			clientes.get(i).start();
			
			/*
			try {
				clientes.get(i).join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			*/
		}
	}

}


class Cliente extends Thread {
	private Semaphore semaphore;
	private String nombre;
	private int porcentaje;
	
	public Cliente (Semaphore semaphore, String nombre) {
		this.semaphore = semaphore;
		this.nombre = nombre;
		porcentaje = 0;
	}

	@Override
	public void run() {
		try {
			System.out.println("El cliente " + nombre + " está esperando para entrar.");
			semaphore.acquire();
			System.out.println("El cliente " + nombre + " ha conseguido entrar al bar.");
			
			for (int i = 0; i < 5; i++) {
				porcentaje += 20;
				System.out.println(nombre + " bebiendo... " + porcentaje + "%");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nombre + " ha terminado y sale del bar.");
		semaphore.release();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
	
}
