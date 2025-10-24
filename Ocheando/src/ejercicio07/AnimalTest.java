package ejercicio07;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class AnimalTest {
	List<Animal> lista=AnimalMother.createAnimales();
	HashMap<String ,Integer> ff;
	@Test
	void test01() {
		lista.stream()
			.collect(Collectors.groupingBy(Animal::getEspecie,Collectors.counting()));
	}
	@Test
	void test02() {
		lista.stream()
			.filter(animal->!animal.isCarnivoro())
			.collect(Collectors.groupingBy(Animal::isCarnivoro));
			
	}
}
