package ejercicios04;

import java.util.LinkedList;
import java.util.List;

public class Ejercicio02 {
	/*
	 * La matriz conocida almacena un lote de números QQ. El número QQ más largo es
	 * de 11 dígitos y el más corto es de 5 dígitos String [] strs = {"12345",
	 * "67891", "12347809933", "98765432102", "67891", "12347809933" }. Almacene
	 * todos los números qq en la matriz en LinkedList, elimine los elementos
	 * repetidos en la lista e imprima todos los elementos en la lista con un
	 * iterador y un bucle for mejorado.
	 */
	public static List<String> omitirRepetidosStream(List<String> lista) {
		//TODO
		return lista;
	}

	private LinkedList<String> getListQQ() {
		String[] strs = { "12345", "67891", "12347809933", "98765432102", "67891", "12347809933" };
		LinkedList<String> al = new LinkedList<String>();
		for (int i = 0; i < strs.length; i++) {
			al.add(strs[i]);
		}
		return al;
	}
}
