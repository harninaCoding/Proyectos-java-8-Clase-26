package iterador;

public class PersonaDos implements Comparable<PersonaDos>{
	
	public String nombre;
	public int edad;
	
	public PersonaDos(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String damelo() {
		return nombre+" "+edad;
	}
	@Override
	public int compareTo(PersonaDos o) {
		return nombre.compareTo(o.nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj))
		return true;
		else{
			PersonaDos parametro=(PersonaDos)obj;
			return nombre.equals(parametro.nombre)&&edad==parametro.edad;
		}
	}
@Override
public String toString() {
	return this.nombre;
}
}
