package iterador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ProblemaConcurrencia03 {
	public static void main(String[] args) {
		ArrayList<PersonaDos> listado = new ArrayList<PersonaDos>();
		listado.add(new PersonaDos("Luis", 12));
		listado.add(new PersonaDos("Esteban", 18));
		listado.add(new PersonaDos("Arturo", 14));
		listado.add(new PersonaDos("Roberto", 19));
		System.out.println(listado);
		Collections.sort(listado);
		PersonaDos person = new PersonaDos("Benito", 12);
		System.out.println(listado);
		// si intentamos modificar una lista a la que estamos accediendo
		// tendremos un error
		// de concurrencia
//		 for (PersonaDos personaDos : listado) {
//		 if(person.compareTo(personaDos)>0) listado.add(person);
//		 }
		for (ListIterator iterator = listado.listIterator(); iterator.hasNext();) {
			PersonaDos personaDos = (PersonaDos) iterator.next();
			if (person.compareTo(personaDos) > 0)
				iterator.add(person);
		}
		System.out.println(listado);
	}
}
