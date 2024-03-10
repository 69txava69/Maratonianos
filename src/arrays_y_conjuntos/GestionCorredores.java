/**
 * 
 */
package arrays_y_conjuntos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/** 
 * Clase para crear una lista con el objeto corredor y tener los metodos que nos ayuden a poder dar lo que nos pide 
 * el menu de la clase principal
 */
public class GestionCorredores {
	static ArrayList<Corredor> corredores = new ArrayList<>();

	/**
	 * Primer método que nos permite instanciar un corredor o más y después añadirlo a una lista
	 */
	public static ArrayList<Corredor> crearListaCorredores() {
		Scanner teclado = new Scanner(System.in);
		int j = 1;
		while (j == 1) {
			System.out.println("\n¿Qué desea hacer?\n\n" + "1: Ingresar corredor\n\n" + "Otro nº: Salir\n\n"
					+ "----------------------------");
			int opcion = teclado.nextInt();
			j=opcion;
			if (opcion == 1) {

				System.out.println("Nombre: ");
				String nombre = teclado.next();
				System.out.println("Dorsal: ");
				int dorsal = teclado.nextInt();
				System.out.println("Tiempo final: ");
				int tiempo = teclado.nextInt();

				corredores.add(new Corredor(nombre, dorsal, tiempo));

			} // fin del if

		} // fin del while
		return corredores;
	}// fin del metodo

	//////////////// lista de menor a mayor tiempo ////////////////////
	
	/**
	 * método que ordena la lista de menor a mayor y saca por pantalla 
	 * los primeros 10 corredores.La lista tiene que tener al menos 10 corredores para que no de error
	 */
	public static void menorAmayor() {
		Collections.sort(corredores, Comparator.comparingInt(c -> c.getTiempo()));   //c.->c.getTiempo es una expresión lambda que nos ayuda a realizar expresiones más legibles
		for (Corredor corredor : corredores.subList(0,10)) {
			System.out.println(corredor+"\n");
		}
	}

	///////////////// 
	//lista de los 3 primeros de menor a mayor tiempo
	///////////////// ///////////////
	
	/**
	 * método que ordena la lista de menor a mayor y saca por pantalla 
	 * los primeros 3 corredores.La lista tiene que tener al menos 3 corredores para que no de error
	 */
	public static void tresMenorAmayor() {
		Collections.sort(corredores, Comparator.comparingInt(c -> c.getTiempo()));

		for (Corredor corredor : corredores.subList(0, 3)) {
			System.out.println(corredor + "\n");
		}
	}
/**
 * método que ordena la lista de mayor a menor tiempo y saca por pantalla 
	 * los primeros 10 corredores.La lista tiene que tener al menos 10 corredores para que no de error
 */
	public static void alReves() {
		Collections.reverse(corredores);
		for (Corredor corredor : corredores.subList(0, 10)) {
			System.out.println(corredor + "\n");
		}
	}

	//////////////////
	//lista de los 3 primeros de mayor a menor tiempo
	////////////////// //////////////////

	/**
	 * método que ordena la lista de mayor a menor y saca por pantalla 
	 * los primeros 3 corredores.La lista tiene que tener al menos 3 corredores para que no de error
	 */
	public static void tresMayorAMenor() {
		Collections.reverse(corredores.subList(0, 3));
		for (Corredor corredor : corredores) {
			System.out.println(corredor + "\n");
		}

	}

}// fin de la clase
