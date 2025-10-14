package ejercicio06;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class AlumnoTest {

	
	@Test
	void test() {
		ArrayList<Integer> valores=new ArrayList<Integer>();
		valores.add(5);
		valores.add(4);
		valores.add(5);
		valores.add(6);
		valores.add(7);
		valores.add(5);
		valores.add(4);
		//Error al intentar borrar de una lista inmutable
//		Alumno alumno=new Alumno(List.of(5,4,5,6,7,5,4), "Diocleciano");
		Alumno alumno=new Alumno(valores, "Diocleciano");
		System.out.println();
	}

}
