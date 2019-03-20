package br.com.fiap.Pro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Calculo {


	
	@Test
	public void testGet () {
		Produto cal = new Produto(10, 50);
		double altura = cal.getAltura();
		double peso = cal.getPeso();
		double alturaPrevista = 50;
		double pesoPrevisto = 10;
		
		assertEquals(altura, alturaPrevista);
		assertEquals(peso, pesoPrevisto);
	}
	
	public void testSet() {
		Produto cal = new Produto();
		double peso = 20;
		double alt = 5;
		
		cal.setPeso(peso);
		cal.setAltura(alt);
		
		double alturaPrevista = 5;
		double pesoPrevisto = 20;
		assertEquals(alt,alturaPrevista);
		assertEquals(peso,pesoPrevisto);
		
	}
	
}
