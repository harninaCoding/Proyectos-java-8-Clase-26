package ejercicio06;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import modelo.accesores.Keyable;

public class Alumno implements Keyable<String>,Serializable {
	private HashMap<Materia, Integer> boletin;
	private String nombre;
	
	public Alumno(List<Integer> notas, String nombre) {
		super();
		this.nombre = nombre;
		cargarBoletin(notas);
	}

	private void cargarBoletin(List<Integer> notas2) {
		boletin=new HashMap<Materia, Integer>();
		Arrays.asList(Materia.values()).forEach((materia)->{
			boletin.put(materia, notas2.removeFirst());
		});
	}

	public String getNombre() {
		return nombre;
	}

	public boolean isAprobado() {
		return boletin.entrySet().stream()
				.filter(entry->entry.getValue()<5)
				.count()<2;
	}
	private HashMap<Materia, Integer> getBoletin() {
		return boletin;
	}
	public List<Materia> getMateriasSuspensas(){
		return boletin.entrySet().stream()
				.filter(entry->entry.getValue()<5)
				.map(entry-> entry.getKey())
				.collect(Collectors.toList());
	}

	public boolean isMateriaAprobada(Materia materia) {
		return boletin.get(materia)>4;
	}
	public boolean isEqualsNombre(String nombre) {
		return getNombre().equals(nombre);
	}

	@Override
	public String getKey() {
		return nombre;
	}
}
