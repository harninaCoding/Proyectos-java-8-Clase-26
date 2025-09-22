package ejercicio01;

import java.util.List;

public interface AritmeticUno<T extends Number,S extends Number> {
	public T media(List<T> lista) ;
	public S suma(List<S> lista);
}
