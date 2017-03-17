package clases;

public class Calculadora {

	private int num1 = 2;
	private int num2 = 3;

	/**
	 * La calculadora
	 */
	public Calculadora() {
		
	}
	
	public int suma (int x, int y){
		return x + y;
		
	}
	
	public int resta (int x, int y){
		return x - y;
		
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

}
