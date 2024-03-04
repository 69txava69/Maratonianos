/**
 * 
 */
package arrays_y_conjuntos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class GestionCorredores {
	public static List<Corredor> crearListaCorredores() {
		List<Corredor> corredores = new ArrayList<>();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte corredor\n" + "----------------------------");
		for (int i = 0; 0 < 10; i++) {
			System.out.println("Nombre: ");
			String nombre = teclado.nextLine();
			System.out.println("Dorsal: ");
			int dorsal = teclado.nextInt();
			System.out.println("Tiempo final: ");
			int tiempo = teclado.nextInt();

			corredores.add(new Corredor(nombre, dorsal, tiempo));
			return corredores;
		}//fin del for
		
	}//fin del metodo
}//fin de la clase
