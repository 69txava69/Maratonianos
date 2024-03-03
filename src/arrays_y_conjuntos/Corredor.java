/**
 * 
 */
package arrays_y_conjuntos;

/**
 * 
 */
public class Corredor {
	String nombre;
	int dorsal;
	int tiempo;

	////////////////// constructor ////////////////
	/**
	 * @param nombre
	 * @param dorsal
	 * @param tiempo
	 */
	public Corredor(String nombre, int dorsal, int tiempo) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.tiempo = tiempo;
	}

	/////////////////// getters & setters //////////////////////
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the dorsal
	 */
	public int getDorsal() {
		return dorsal;
	}

	/**
	 * @param dorsal the dorsal to set
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	/**
	 * @return the tiempo
	 */
	public int getTiempo() {
		return tiempo;
	}

	/**
	 * @param tiempo the tiempo to set
	 */
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

}
