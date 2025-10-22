package ejercicio06;

import java.util.List;

public interface AlumnosRepository {

	//consultas genericas sobre alumnos
	List<Alumno> findAlumnos();

	List<Alumno> findAlumnosAprobados();

	List<Alumno> findAlumnoByNombre(String nombre);

	List<Alumno> findAlumnoByMateriaSuspensa(Materia materia);

}