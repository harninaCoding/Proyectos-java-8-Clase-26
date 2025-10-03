package ejercicios04;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio04 {
	/*
	 * Reclamación:
	 * 
	 * 1. Recorre la colección e imprime el número de serie y el nombre
	 * correspondiente. 
	 * 2. Inserte un mensaje codificado como 5 y llamado Li
	 * Xiaohong en el conjunto de mapas 
	 * 3. Elimine la información numerada 1 en el
	 * mapa 
	 * 4. Modifique la información del nombre numerada 2 en el mapa establecido
	 * en "Zhou Lin"
	 * 
	 */

	public Map<Integer, String> getMap() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, " ");
		map.put(2, "Zhou Zhiruo");
		map.put(3, " ");
		map.put(4, "Exterminador también");
		map.put(5, " ");
		return map;
	}
}
