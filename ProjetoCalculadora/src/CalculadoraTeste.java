import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraTeste {

	
	/**
	 * teste Somar
	 */
	@Test
	public void testeSomar() {
		int nro1 = 5;
		int nro2 = 5;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 10;
		int resultadoReal = calc.somar(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	
	/**
	 * teste Sub
	 */
	
	@Test
	public void testeSubitrair() {
		int nro1 = 5;
		int nro2 = 3;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 2;
		int resultadoReal = calc.subtrair(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	/**
	 * teste Multi
	 */
	
	@Test
	public void testeMulti() {
		int n1 = 5;
		int n2 = 3;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 15;
		int resultadoReal = calc.multiplicar(n1, n2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	/**
	 * teste Dividir
	 */
	
	@Test
	public void testeDividir() {
		int n1 = 8;
		int n2 = 2;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 4;
		int resultadoReal = calc.dividir(n1, n2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	
}
