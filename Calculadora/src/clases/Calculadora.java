package clases;

/**
 * Crea un objeto calculadora que realiza ciertas operaciones matem�ticas.
 * 
 * @author ClaraR
 * @version 1.0
 *
 */
public class Calculadora {

	
	/**
	 * Realiza la suma de dos n�meros.
	 * 
	 * @param x
	 *            Primer n�mero.
	 * @param y
	 *            Segundo n�mero.
	 * @return total Suma de los n�meros
	 */
	public static int suma(int x, int y) {
		int total = (x + y); // auxiliar para guardar la operaci�n en una
								// variable
		return total;
	}

	/**
	 * Realiza la resta de dos n�meros.
	 * 
	 * @param x
	 *            Primer n�mero.
	 * @param y
	 *            Segundo n�mero.
	 * @return total Resta de los n�meros.
	 */
	public static int resta(int x, int y) {
		int total = (x - y); // auxiliar para guardar la operaci�n en una
								// variable
		return total;
	}

	/**
	 * Realiza la multiplicaci�n de dos n�meros.
	 * 
	 * @param x
	 *            Primer n�mero.
	 * @param y
	 *            Segundo n�mero.
	 * @return total Multiplicaci�n de los n�meros.
	 */
	public static int multiplicacion(int x, int y) {
		int total = (x * y); // auxiliar para guardar la operaci�n en una
								// variable
		return total;

	}

	/**
	 * Realiza la divisi�n de dos n�meros.
	 * 
	 * @param x
	 *            Primer n�mero.
	 * @param y
	 *            Segundo n�mero.
	 * @return total Divisi�n de los n�meros.
	 */
	public static int division(int x, int y) {
		int total = (x / y); // auxiliar para guardar la operaci�n en una
								// variable
		return total;

	}

}