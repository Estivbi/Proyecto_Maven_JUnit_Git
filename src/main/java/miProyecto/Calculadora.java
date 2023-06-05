package miProyecto;

/**
 * EJERCICIO PARA HACER PRUEBAS CON JUNIT
 * 
 * @author Carolina Rodriguez DAM online
 *
 */
public class Calculadora {
	private int num1;
	private int num2;

	public Calculadora (int a, int b) {
		num1 = a;
		num2 = b;

	}

	public int suma() {
		return num1 + num2;
	}

	public int resta() {
		return num1 - num2;
	}

	public int multiplica() {
		return num1 * num2;
	}

	public int divide() {
		if (num2 != 0) {
			return (int) num1/num2;
		}else {
			throw new ArithmeticException("Division entre cero no permitida");
		}
		
	}
}
