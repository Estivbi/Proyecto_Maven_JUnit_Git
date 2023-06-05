package miProyecto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class CalculadoraTest {

	static Calculadora cal;
	@Before
	public void before () {
		System.out.println("Estoy en el metodo before");
		cal = new Calculadora(20,10);
	}
	
	@Test
	public void testSumar() {
		System.out.println("Estoy en el metodo suma");
		int resultado = cal.suma();
		assertEquals(30, resultado);
	}

	@Test
	public void testRestar() {
		System.out.println("Estoy en el metodo resta");
		int resultado = cal.resta();
		assertEquals(10, resultado);
	}

	@Test
	public void testMultiplicar() {
		System.out.println("Estoy en el metodo multiplicar");
		int resultado = cal.multiplica();
		assertEquals(200, resultado);
	}

	@Test
	public void testDividir() {
		System.out.println("Estoy en el metodo dividir");
		int resultado = cal.divide();
		assertEquals(2, resultado);
	}

}
