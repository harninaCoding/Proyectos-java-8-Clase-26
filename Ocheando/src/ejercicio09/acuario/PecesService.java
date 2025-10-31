package ejercicio09.acuario;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Map.Entry;

public interface PecesService {

	/** 1) Añade 100 peces usando Streams (sin bucles). */
	void addHundredFishes();

	/** 2) Cuenta peces por especie. */
	Map<Especie, Long> findFishesBySpecies();

	/** 3) Especie más abundante (entrada del mapa especie→conteo). */
	Optional<Entry<Especie, Long>> findMostCommonSpecies();

	/** 4) Peso medio por especie. */
	Map<Especie, Double> averageWeightBySpecies();

	/** 5) Edad media total. */
	OptionalDouble averageAge();

	/** 6) Peces adultos (edad ≥ 2). */
	List<Pez> getAdultFishes();

	/** 7) Nombre más repetido. */
	Optional<String> findMostCommonName();

}