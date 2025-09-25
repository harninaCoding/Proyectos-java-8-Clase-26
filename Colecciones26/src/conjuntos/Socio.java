package conjuntos;

import java.util.Objects;

//public class Socio {
	public class Socio implements Comparable<Socio>{
	private String nombre;
	private int edad;

	public Socio(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
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
		Socio other = (Socio) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Socio() {
		super();
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public int compareTo(Socio o) {
		int comparacionNombre=nombre.compareTo(o.nombre);
		int comparaEdad=edad-o.edad;
		return (comparacionNombre*100)+comparaEdad;
	}

}
