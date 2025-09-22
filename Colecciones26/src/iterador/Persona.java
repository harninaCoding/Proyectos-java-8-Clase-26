package iterador;

public class Persona implements Comparable<Persona> {
	public String nombre;
	public int edad;

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj))
			return true;
		else {
			Persona parametro = (Persona) obj;
			return nombre.equals(parametro.nombre) && edad == parametro.edad;
		}
	}

	@Override
	public int hashCode() {
		return edad + nombre.hashCode();
	}

	@Override
	public String toString() {
		return nombre + " " + edad;
	}

	@Override
	public int compareTo(Persona o) {
		// en este caso queremos que se ordenen por nombre y luego edad
		// para eso damos un retorno ponderado donde un parametro
		// tiene mas valor que otro (ponderamos en realicion al dominio
		// de los valores del elemento a ordenar)
		int comparacionNombre = this.nombre.compareTo(o.nombre);
		int comparaEdad = this.edad - o.edad;
		// para que no se confunda la diferencia en el nombre con la diferemcoa
		// en la edad
		// ponemos un valor para multiplicar igual al valor maximo aproximado
		return (comparacionNombre * 100) + comparaEdad;
	}
}
