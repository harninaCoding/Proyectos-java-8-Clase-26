package inicial;

import java.util.ArrayList;
import java.util.LinkedList;


public class MetodosLinked025 {
	public static void main(String[] args) {
		LinkedList lista = new LinkedList();
		ArrayList listaArray = new ArrayList<>();
		listaArray.add(12);
		listaArray.add(22);
		listaArray.add(32);
		listaArray.add(42);
		listaArray.add(25);

		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		UtilesConFinesAcademicos.mostrar(lista);
		// podemnos con una list a�adir en una posicion concreta
		lista.add(2, 10);
		UtilesConFinesAcademicos.mostrar(lista);
		/*
		 * Que tengo aqui en linkedList que no tenga en ArrayList
		 */
		System.out.println("\n" + lista.getFirst());
		System.out.println(lista.getLast());
		lista.removeFirst();
		lista.removeLast();
		UtilesConFinesAcademicos.mostrar(lista);
		// hay muchos m�s metodos que permiten usar linkedList como otra
		// estructura
		System.out.println();
		lista.removeFirstOccurrence(10);
		UtilesConFinesAcademicos.mostrar(lista);
		//Y esto para que?
	}
}
