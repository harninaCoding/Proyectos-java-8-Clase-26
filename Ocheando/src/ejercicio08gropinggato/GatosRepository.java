package ejercicio08gropinggato;

import java.util.List;

public class GatosRepository {
	private List<Gato> gatos;
	

	public GatosRepository() {
		super();
		gatos=new GatoOM().getListCats();
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
	
	
}
