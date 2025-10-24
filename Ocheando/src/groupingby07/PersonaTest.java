package groupingby07;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class PersonaTest {
	List<Persona> personas = PersonaMother.createPersonas();
	
	@Test
	void test() {
		//Personas agrupadas por edad
		Map<Byte, List<Persona>> collect = personas.stream()
		.collect(Collectors.groupingBy(Persona::getEdad));
		collect.entrySet().stream().forEach(entrada -> {
			System.out.print(entrada.getKey());
			System.out.println(" " + entrada.getValue());
		});
	}
	@Test
	void test1() {
		Map<Byte,Set<Persona>> collect = personas.stream()
				.collect(Collectors.groupingBy(Persona::getEdad,Collectors.toSet()));
	}
	@Test
	void test2() {
		Map<Byte, Long> collect = personas.stream()
				.collect(Collectors.groupingBy(Persona::getEdad,Collectors.counting()));
	}
	@Test
	void test3() {
		Map<Byte, Double> collect = personas.stream()
				.collect(Collectors.groupingBy(Persona::getEdad,
						Collectors.averagingDouble(Persona::getSaldo)));
	}
	@Test
	void test05() {
		Map<Byte, Map<Categoria, List<Persona>>> collect = personas.stream()
				.collect(Collectors.groupingBy(Persona::getEdad,
						Collectors.groupingBy(Persona::getCategoria)));
//		collect.entrySet().stream().forEach(entrada -> {
//			System.out.print(entrada.getKey());
//			System.out.println(" " + entrada.getValue());
//		});
	}
	@Test
	void test06() {
		Map<Byte, Map<Categoria, Long>> collect = personas.stream()
				.collect(Collectors.groupingBy(Persona::getEdad,
						Collectors.groupingBy(Persona::getCategoria,
								Collectors.counting())));
//		collect.entrySet().stream().forEach(entrada -> {
//			System.out.print(entrada.getKey());
//			System.out.println(" " + entrada.getValue());
//		});
	}
	@Test
	void test07() {
		Map<Byte, Map<Categoria, Double>> collect = personas.stream()
				.collect(Collectors.groupingBy(Persona::getEdad,
						Collectors.groupingBy(Persona::getCategoria,
								Collectors.averagingDouble(Persona::getSaldo))));
//		collect.entrySet().stream().forEach(entrada -> {
//			System.out.print(entrada.getKey());
//			System.out.println(" " + entrada.getValue());
//		});
	}
}
