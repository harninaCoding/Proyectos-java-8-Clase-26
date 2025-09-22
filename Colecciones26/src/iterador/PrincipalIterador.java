package iterador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PrincipalIterador {
public static void main(String[] args) throws CloneNotSupportedException {
	ArrayList<Socio> lista=new ArrayList<Socio>();
	//puedo meter otra cosa que no sea un socio?
//	lista.add("salida");
	//la respuesta es NO y ademas es el control que generan las clases genericas
	lista.add(new Socio("Edelmiro", 21));
	Socio socio=new Socio("Norberto", 19);
	lista.add(socio);
	lista.add(socio.clone());
	for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
		Socio socio1 = (Socio) iterator.next();
		System.out.println(socio1.toString());
	}
	lista.add(new Socio("Ataulfo", 21));
	//falla porque no tiene comparable el socio
//	Collections.sort(lista);
	for (Socio socio2 : lista) {
		System.out.println(socio2.toString());
	}
}
}
