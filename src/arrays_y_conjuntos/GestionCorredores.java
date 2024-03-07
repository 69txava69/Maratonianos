/**
 * 
 */
package arrays_y_conjuntos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/** 
 * 
 */
public class GestionCorredores {
	static ArrayList<Corredor> corredores = new ArrayList<>();

	/**
	 * 
	 */
	public static ArrayList<Corredor> crearListaCorredores() {
		Scanner teclado = new Scanner(System.in);
		int j = 1;
		while(j==1) {
		System.out.println(
				"\n¿Qué desea hacer?\n\n"
				+ "1: Ingresar corredor\n\n" + "Otro nº: Salir\n" + "----------------------------");
		int opcion = teclado.nextInt();
		j=opcion;
		if (opcion ==1) {

			System.out.println("Nombre: ");
			String nombre = teclado.next();
			System.out.println("Dorsal: ");
			int dorsal = teclado.nextInt();
			System.out.println("Tiempo final: ");
			int tiempo = teclado.nextInt();

			corredores.add(new Corredor(nombre, dorsal, tiempo));
 
		} // fin del if
	
		}//fin del while
		return corredores;
	}// fin del metodo
	
	////////////////   lista de menor a mayor tiempo   ////////////////////
	public static void menorAmayor () {
		Collections.sort(corredores, Comparator.comparingInt(c ->c.getTiempo()));
		for(Corredor corredor:corredores) {
			System.out.println(corredor);
		}
	}
	
	/////////////////    lista de los 3 primeros de menor a mayor tiempo      ///////////////
	public static void tresMenorAmayor () {
		Collections.sort(corredores, Comparator.comparingInt(c ->c.getTiempo()));
		corredores.subList(0, 2);
		
		for(Corredor corredor:corredores) {
			System.out.println(corredor);
		}
	}
	
	//////////////////     lista de los 3 primeros de mayor a menor tiempo   //////////////////
	
	public static void tresMayorAMenor () {
		Collections.reverse(corredores);
		System.out.println(corredores.subList(0, 2));
		
	}
	
	
    
	
	
	
	
}// fin de la clase




