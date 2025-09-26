package mapas;

import java.util.HashMap;
import java.util.TreeMap;

public class MapasUno {
	public static void main(String[] args) {
		// Usamos una implemtancion del mapa
		// TreeMap<K, V>
		// HashMap<K, V>
		HashMap<String, String> telefonos = new HashMap<>();
		// insertar un valor
		telefonos.put("jose", "987654786");
		telefonos.put("ataulfo", "77");
		System.out.println(telefonos.get("jose"));
		// La misma clave sobreescribe el valor anterior
		// y put retorna el antiguo valor
		String put = telefonos.put("jose", "887788");

		// Podemos usar cualquier objeto como K y V
		// Veamos lo que pasa si los elementos son clases propias
		Cliente cliUno = new Cliente("jose", 1, 100);
		Seguro hogar = new Seguro("hogar", 1, 2);
		Seguro coche = new Seguro("coche", 1, 2);
		Cliente cliDos = new Cliente("jose", 2, 200);
		HashMap<Cliente, Seguro> enlace = new HashMap<Cliente, Seguro>();
		enlace.put(cliUno, coche);
		enlace.put(cliDos, hogar);
		System.out.println(enlace.get(cliDos).nombre);
		//Los compara por el numero de cuenta
		//porque asi esta implemtando en el hashcode
		System.out.println(enlace.get(cliUno).nombre);
	}
}
