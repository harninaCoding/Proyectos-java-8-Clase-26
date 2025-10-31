package ejercicio08gropinggato;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GatosRepository {
	private List<Gato> gatos;
	

	public GatosRepository() {
		super();
		gatos=new GatoOM().getListCats();
	}

	public Map<Raza, Long> findAmountOfCatsByRace() {
		return gatos.stream()
				.collect(Collectors.groupingBy(
						Gato::getRaza,
						Collectors.counting()));
	}
	public Double findAgeAverage() {
		return gatos.stream()
			.collect(Collectors.averagingDouble(Gato::getEdad));
	}
	
	public List<Gato> getGatos() {
		return gatos;
	}

	public void setGatos(List<Gato> gatos) {
		this.gatos = gatos;
	}

	public boolean add(Gato e) {
		return gatos.add(e);
	}

	
	public int size() {
		return gatos.size();
	}

	public  Map<String, Long> findAmountOfCatsByName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
