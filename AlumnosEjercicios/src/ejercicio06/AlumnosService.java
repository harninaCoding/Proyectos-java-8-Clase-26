package ejercicio06;

import java.util.List;
import java.util.stream.Collectors;

public class AlumnosService {
	private AlumnosRepository alumnosRepository;

	public AlumnosService(AlumnosRepository alumnosRepository) {
		super();
		this.alumnosRepository = alumnosRepository;
	}

	public List<AlumnoResponse> getNombreAlumnosAprobadosYMateriasSuspensas() {
		return alumnosRepository.findAlumnosAprobados().stream()
			.map(alumno
					->new AlumnoResponse(alumno.getNombre(), alumno.getMateriasSuspensas()))
			.collect(Collectors.toList());

	}
	
	public List<String> getNombresAlumnosMateriaSuspensa(Materia materia) {
		return alumnosRepository.findAlumnoByMateriaSuspensa(materia).stream()
				.map(Alumno::getNombre)
				.collect(Collectors.toList());
	}
}
