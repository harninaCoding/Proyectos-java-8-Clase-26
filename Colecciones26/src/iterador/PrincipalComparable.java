package iterador;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComparable {
	public static void main(String[] args) {
		
	ArrayList<Persona> listado=new ArrayList<Persona>();
	listado.add(new Persona("Luis", 12));
	listado.add(new Persona("Esteban", 18));
	listado.add(new Persona("Arturo", 18));
	listado.add(new Persona("BArturo", 17));
	listado.add(new Persona("Arturo", 21));
	listado.add(new Persona("Roberto", 19));
	System.out.println(listado.toString());
	Collections.sort(listado);
	System.out.println(listado.toString());
	Collections.reverse(listado);
	System.out.println(listado.toString());
	}
}
