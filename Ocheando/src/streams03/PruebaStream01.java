package streams03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PruebaStream01 {
	// Volvemos a coger caracteristicas de la programacion funcional
	// En el ejemplo anterior podeis ver que todos los resultados son inmutables,
	// porque son String
	// Eso quiere decir quColle todos los cambios que hice desde la String original
	// no afectan a esta
	// es decir la cadena original sigue como estaba. Con esto se consigue que no
	// haya efectos colaterales
	// si otro metodo usa esta cadena no se vera afectado por las operaciones
	// anteriores.
	// Para un programador oo esto es raro porque cuenta con el estado. Para un
	// programador funcional esto es
	// obligatorio porque no tiene estado.
	// Usando esta lÃ³gica java 8 se plantea utilizar esta inmutabilidad y pipeline
	// para trabajar con Collection
	// con otras cosas tambien, y lo llama Stream veamos
	// 00 Creando la coleccion
	public static void main(String[] args) {
		String cosas[] = { "periplo", "nocturno", "cempua" };
		List<String> cadenas = Arrays.asList(cosas);
		// 01 Toda colecction tiene un stream
		Stream<String> stream = cadenas.stream();
		// ya trabajamos con el Stream pero no sobre el original
//		System.out.println(stream.count());
		// con esto lo habriamos cerrado y ya no se puede volver a operar sobre el
//		System.out.println(stream.count());
		// Una operacion sobre el flujo que no retorne otro flujo, lo cierra
		// cuenta con muchas funciones que veremos. Vamos a ver una, la mas potente map
		// Observa que map necesita que le pasemos una funcion. Ahi va una lambda
		// vamos a hacer la que convierte en mayusulas
		Stream<String> map = stream.map(a-> a.toUpperCase());
		map.forEach(a-> System.out.println(a));
		cadenas.forEach(a-> System.out.println(a));
		List<String> collect = cadenas.stream().map(a-> a.toUpperCase()).collect(Collectors.toList());
		collect.forEach(System.out::println);
	}
}
