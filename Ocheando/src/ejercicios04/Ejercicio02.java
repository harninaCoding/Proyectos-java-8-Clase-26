package ejercicios04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio02 {
	/*
	 * La matriz conocida almacena un lote de números QQ. El número QQ más largo es
	 * de 11 dígitos y el más corto es de 5 dígitos String [] strs = {"12345",
	 * "67891", "12347809933", "98765432102", "67891", "12347809933" }. Almacene
	 * todos los números qq en LinkedList, elimine los elementos
	 * repetidos en la lista e imprima todos los elementos en la lista con un
	 * iterador y un bucle for mejorado.
	 */
	public List<String> omitirRepetidosConvencional(List<String> lista) {
		//TODO
		return lista;
	}
	public List<String> omitirRepetidosStream(List<String> lista) {
		return lista.stream().distinct().collect(Collectors.toList());
	}

	private LinkedList<String> getListQQ() {
		String[] strs = { "12345", "67891", "12347809933", "98765432102", "67891", "12347809933" };
		LinkedList<String> al = new LinkedList<String>();
		for (int i = 0; i < strs.length; i++) {
			al.add(strs[i]);
		}
		return al;
	}
	private List<String> getListQQNose() {
		String[] strs = { "12345", "67891", "12347809933", "98765432102", "67891", "12347809933" };
		return Arrays.asList(strs);
		}
}
