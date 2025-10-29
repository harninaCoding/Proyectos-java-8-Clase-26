package ejercicio08gropinggato;

import java.util.Map;

public interface GatosService {

	Map<Raza, Long> getCatsByRace();

	String getMostRepeatedName();

	Double getAgeAverage();

	Raza getMostNumerousRace();

}