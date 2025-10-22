package ejercicio06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlumnosOM {
	private static String[] nombres = { "juan", "esteban", "arturo", "felipe" };
	private static int notas[][] = { 
			{ 5, 6, 7, 5, 6, 4, 8 }, 
			{ 5, 6, 7, 4, 4, 8, 8 }, 
			{ 6, 6, 6, 6, 6, 6, 6 },
			{ 5, 5, 4, 5, 5, 6, 7 } };

	public static List<Alumno> getAlumnos() {
		return IntStream.range(0, nombres.length).mapToObj(
				index -> new Alumno(Arrays.stream(notas[index]).boxed().collect(Collectors.toList()), nombres[index]))
				.collect(Collectors.toList());
	}
}
