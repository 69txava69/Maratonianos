/**
 * 
 */
package arrays_y_conjuntos;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *  
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Corredor> corredores = GestionCorredores.crearListaCorredores();
		int j;

		do {
			menu();
			Scanner teclado = new Scanner(System.in);
			int opcion = teclado.nextInt();
			j = opcion;

			switch (opcion) {
			case 1:// lista ordenada por tiempo mostrando todo sobre los corredores
				GestionCorredores.menorAmayor();
				break;
			case 2:// lista ordenada de los 3 primeros de menor a mayor
				GestionCorredores.tresMenorAmayor();
				break;
			case 3:// lista ordenada de los 10 corredores de mayor a menor tiempo
				GestionCorredores.alReves();
				break;
			case 4:// lista ordenada de los 3 primeros de mayor a menor tiempo
				GestionCorredores.tresMayorAMenor();
				break;

			}// fin del switch

		} while (j < 5);

	}// fin del main

	public static void menu() {
		System.out.println("Elija la información que desee mostrar\n\n"
				+ "1: Los 10 primeros corredores ordenados de menor a mayor tiempo\n\n"
				+ "2: Sólo los 3 primeros corredores de menor a mayor tiempo\n"
				+ "3: Los 10 primeros corredores ordenados de mayor a menor tiempo\n\n"
				+ "4: Sólo los 3 primeros corredores de mayor a menor tiempo\n" + "5: Salir");

	}
}// fin de la clase principal
