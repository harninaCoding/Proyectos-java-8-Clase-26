package ejercicio06;

import java.util.List;
import java.util.stream.Collectors;

public class AlumnosService {
	private AlumnosRepository alumnosRepository;

	public AlumnosService() {
		super();
		this.alumnosRepository = new AlumnosRepository();
	}

	public List<AlumnoResponse> getNombreAlumnosAprobadosYMateriasSuspensas() {
		return alumnosRepository.findAlumnosAprobados().stream()
			.map(alumno
					->new AlumnoResponse(alumno.getNombre(), alumno.getMateriasSuspensas()))
			.collect(Collectors.toList());

	}
}
