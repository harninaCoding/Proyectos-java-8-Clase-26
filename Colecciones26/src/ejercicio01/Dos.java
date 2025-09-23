package ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Dos implements Rotador<Character> {
	char numeros[] = { 'a', 'c', 'f', 'h' };
	ArrayList<Character> lista = new ArrayList<Character>();

	public Dos() {
		super();
		for (int i = 0; i < numeros.length; i++) {
			lista.add(numeros[i]);
		}
	}

	@Override
	public void rotar(List<Character> collection) {
		if (!collection.isEmpty()) {
			Character o = collection.getLast();
			boolean remove = collection.remove(o);
			if (remove)
				collection.addFirst(o);
		}
	}
}
