package ejercicio06;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class AlumnoTest {

	AlumnosService alumnosService;
	
	@Test
	void test() {
		alumnosService=new AlumnosService();
		int aprobados=3;
		assertEquals(aprobados,alumnosService.getNombreAlumnosAprobadosYMateriasSuspensas().size());
	}

}
