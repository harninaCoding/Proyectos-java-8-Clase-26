package iterador;

public class Socio implements Cloneable {
	private String nombre;
	private int edad;

	public Socio(String nombre, int edad) {
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

	public Socio() {
		super();
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public Socio clone() throws CloneNotSupportedException {
		Socio clon=(Socio) super.clone();
		String miNombre=new String(this.nombre);
		return clon;
	}
	
	@Override
	public boolean equals(Object obj) {
		Socio socio=(Socio) obj;
		return socio.nombre.equals(this.nombre)&&socio.edad==this.edad;
	}
	@Override
	public String toString() {
		
		return this.nombre+" "+this.edad;
	}
}
