import java.util.ArrayList;
import java.util.List;

public class BibliotecaPrincipios {
	public static void main(String[] args) {
		String cosa = "Hola";
		//es inmutable
		cosa="Adios";
		StringBuilder otro = new StringBuilder("Hola");
		//no es inmutable
		otro.append(" Mundo");
		otro.append(" superando el limite de veinte caracteres inicial");
		List<CharSequence> lista=new ArrayList<CharSequence>();
		lista.add(cosa);
		lista.add(otro);
	}
}
