package ejercicio01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DosTest {

	@Test
	void testRotar() {
		Dos dos = new Dos();
		ArrayList<Character> listaCopia = (ArrayList<Character>) dos.lista.clone();
		dos.rotar(dos.lista);
		assertEquals(listaCopia.get(listaCopia.size()-1), dos.lista.get(0));
		assertEquals(listaCopia.get(0),	dos.lista.get(1));
	}

}
