package ejercicio06;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Alumno {
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

	String getNombre() {
		return nombre;
	}

	private HashMap<Materia, Integer> getBoletin() {
		return boletin;
	}
	
}
