package ejercicio08gropinggato;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Stream;

public class GatosServiceImpl implements GatosService {
	GatosRepository gatosRepository;
	Comparator<Entry<?, Long>> comparator = (a,b) -> (int) (a.getValue()-b.getValue());

	@Override
	public Map<Raza, Long> getCatsByRace() {
		return gatosRepository.findAmountOfCatsByRace();
	}

	@Override
	public String getMostRepeatedName() {
		Map<String, Long> amountOfCatsByName = gatosRepository.findAmountOfCatsByName();
		Stream<Entry<String, Long>> stream = amountOfCatsByName.entrySet().stream();
		Optional<Entry<String, Long>> max = stream.max(comparator);
		Entry<String, Long> entry = max.get();
		String key = entry.getKey();
		return key;
	}

	@Override
	public Double getAgeAverage() {
		return gatosRepository.findAgeAverage();
	}

	@Override
	public Raza getMostNumerousRace() {
		return gatosRepository.findAmountOfCatsByRace()
			.entrySet().stream()
			.max(comparator)
			.get()
			.getKey();
	}

}
