package ejercicio06;

import java.util.List;

import modelo.repositorios.serializadomultiobjetoindexado.RepositorioIndexado;
import modelo.repositorios.serializadomultiobjetoindexado.RepositorioSerializadoMultiObjetoIndexable;

public class AlumnosRepositorioPersistencia implements AlumnosRepository {

	RepositorioIndexado<Alumno, String> repo;
	
	public AlumnosRepositorioPersistencia() {
		super();
		this.repo = new RepositorioSerializadoMultiObjetoIndexable<Alumno, String>("alumnos.data");
	}

	@Override
	public List<Alumno> findAlumnos() {
		return repo.getTodos();
	}

	@Override
	public List<Alumno> findAlumnosAprobados() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alumno> findAlumnoByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alumno> findAlumnoByMateriaSuspensa(Materia materia) {
		// TODO Auto-generated method stub
		return null;
	}

}
