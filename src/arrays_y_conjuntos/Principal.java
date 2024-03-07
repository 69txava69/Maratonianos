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
		menu();
		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();
		switch (opcion) {
		case 1:// lista ordenada por tiempo mostrando todo sobre los corredores
			GestionCorredores.menorAmayor();
			break;
		case 2:// lista ordenada de los 3 primeros de menor a mayor
			GestionCorredores.tresMenorAmayor();
		case 3:// lista ordenada de los 10 corredores de mayor a menor tiempo
			Collections.reverse(corredores);
		case 4:// lista ordenada de los 3 primeros de mayor a menor tiempo
			GestionCorredores.tresMenorAmayor();

		}// fin del switch

		teclado.close();
		
	}// fin del main

	public static void menu() {
		System.out.println("Elija la información que desee mostrar\n\n"
				+ "1: Los 10 primeros corredores ordenados de menor a mayor tiempo\n\n"
				+ "2: Sólo los 3 primeros corredores de menor a mayor tiempo"
				+ "3: Los 10 primeros corredores ordenados de mayor a menor tiempo\n\n"
				+ "4: Sólo los 3 primeros corredores de mayor a menor tiempo\n");

	}
}// fin de la clase principal
