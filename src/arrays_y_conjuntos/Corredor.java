/**
 * 
 */
package arrays_y_conjuntos;

/**
 * clase para objetos de tipo corredor
 * sus atributos son nombre, dorsal y tiempo
 * String para el nombre 
 * nº entero para el dorsal 
 * nº entero en min. para el tiempo
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
	 * @return  nombre
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
	 * @return  dorsal
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
	 * @return  tiempo
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

	/////////////// to string /////////////
	@Override
	public String toString() {
		return "Corredor [nombre=" + nombre + ", dorsal=" + dorsal + ", tiempo=" + tiempo + "]";
	}

}// fin de la clase
