package ejercicio01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class UnoTest {
	Uno uno;
	int numeros[] = { 4, 7, 34, 25, 13 };
	int expected=83;
	double expectedMedia=16.6;
	
	@Test
	void testMedia() {
		uno=new Uno();
		assertEquals(expectedMedia, uno.media(uno.lista.stream().map(Integer::doubleValue).toList()));
	}

	@Test
	void testSuma() {
		uno=new Uno();
		Integer suma = uno.suma(uno.lista);
		assertEquals(expected, suma);
	}

}
