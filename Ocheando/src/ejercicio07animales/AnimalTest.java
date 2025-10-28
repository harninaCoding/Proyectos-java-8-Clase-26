package ejercicio07animales;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalTest {
	AnimalRepository animalRepository;
	
	@BeforeEach
	void bef() {
		animalRepository=new AnimalRepository();
	}

	@Test
	void test01() {
		animalRepository.getCantidadAnimalesByEspecie();
	}

	@Test
	void test02() {
		animalRepository.getCantidadAnimalesByDieta();
	}
	
	@Test
	void test03(){
		Map<String, Long> cantidadAnimalesByEspecie = animalRepository.getCantidadAnimalesByEspecie();
		Map<String, Long> cantidadAnimalesByEspecieRecycled = animalRepository.getCantidadAnimalesByEspecieRecycled();
		assertEquals(cantidadAnimalesByEspecie,cantidadAnimalesByEspecieRecycled);
	}
}
