package clases;

/**
 * Crea un objeto calculadora que realiza ciertas operaciones matemáticas.
 * 
 * @author ClaraR
 * @version 1.0
 *
 */
public class Calculadora {

	
	/**
	 * Realiza la suma de dos números.
	 * 
	 * @param x
	 *            Primer número.
	 * @param y
	 *            Segundo número.
	 * @return total Suma de los números
	 */
	public static int suma(int x, int y) {
		int total = (x + y); // auxiliar para guardar la operación en una
								// variable
		return total;
	}

	/**
	 * Realiza la resta de dos números.
	 * 
	 * @param x
	 *            Primer número.
	 * @param y
	 *            Segundo número.
	 * @return total Resta de los números.
	 */
	public static int resta(int x, int y) {
		int total = (x - y); // auxiliar para guardar la operación en una
								// variable
		return total;
	}

	/**
	 * Realiza la multiplicación de dos números.
	 * 
	 * @param x
	 *            Primer número.
	 * @param y
	 *            Segundo número.
	 * @return total Multiplicación de los números.
	 */
	public static int multiplicacion(int x, int y) {
		int total = (x * y); // auxiliar para guardar la operación en una
								// variable
		return total;

	}

	/**
	 * Realiza la división de dos números.
	 * 
	 * @param x
	 *            Primer número.
	 * @param y
	 *            Segundo número.
	 * @return total División de los números.
	 */
	public static int division(int x, int y) {
		int total = (x / y); // auxiliar para guardar la operación en una
								// variable
		return total;

	}

}