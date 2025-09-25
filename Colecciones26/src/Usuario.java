import java.util.Objects;

public class Usuario {
	private String id;
	private String nombre;
	private byte edad;





	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}

	/////////////////////////////////////////// constructores
	public Usuario(String id, String nombre, byte edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	public Usuario() {
		super();
	}

//////////////////////////////////get&set
	private String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private byte getEdad() {
		return edad;
	}

	private void setEdad(byte edad) {
		this.edad = edad;
	}

}
