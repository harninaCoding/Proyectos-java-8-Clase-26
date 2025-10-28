package ejercicio07animales;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class AnimalRepository {

	private List<Animal> animales;

	public AnimalRepository() {
		super();
		animales = new AnimalMother().createAnimales();
	}
	
	private Map<String,List<Animal>> getAnimalesByEspecie(){
		return animales.stream()
				.collect(Collectors.groupingBy(
							Animal::getEspecie));
	}

	public Map<String, Long> getCantidadAnimalesByEspecie() {
		return animales.stream()
				.collect(Collectors.groupingBy(
							Animal::getEspecie
							,Collectors.counting()));
		
	}
	public Map<String, Long> getCantidadAnimalesByEspecieRecycled() {
		return getAnimalesByEspecie().entrySet().stream()
				.collect(Collectors.toMap(
						Map.Entry::getKey, 
						entry->(long)entry.getValue().size()
						));
	}
	
	public Map<Boolean,List<Animal>> getCantidadAnimalesByDieta(){
		return animales.stream()
					.collect(Collectors.groupingBy(
							Animal::isCarnivoro));
	}
	
	public Map<Integer,List<Animal>> getAnimalesByDecada(){
		return animales.stream().collect(Collectors.groupingBy(Animal::getDecade));
	}
	
	public Map<Boolean,List<Animal>> getAnimalesByPesoConcreto(int peso){
		return animales.stream()
				.collect(Collectors.groupingBy(
						animal->animal.getPeso()>=peso));
	}
}
