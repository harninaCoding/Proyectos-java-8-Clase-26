package ejercicios04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Ejercicio02bisTest {

	Ejercicio02bis ejercicio02bis;
	@Test
	void testAlteraCollecion() {
		ejercicio02bis=new Ejercicio02bis();
		//lista inicial
		ArrayList<Vehiculo> vehiculos = ejercicio02bis.vehiculos;
		//lista modificada
		List<Vehiculo> modificada = ejercicio02bis.alteraCollecion();
		List<Integer> of = List.of(0,modificada.size()-1);
		of.stream()
		.forEach(valor-> 
			assertEquals(
					vehiculos.get(valor).getKilometros()*2,
					modificada.get(valor).getKilometros()));
	}

}
