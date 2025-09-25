package utiles;
import java.util.ArrayList;
import java.util.Collection;

public class Utiles {
	public static void muestraLista(Collection listado) {
		for (Object PersonaDos : listado) {
			System.out.println(PersonaDos.toString());
		}
	}
}
