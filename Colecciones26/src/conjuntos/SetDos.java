package conjuntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDos {
	public static void main(String[] args) {
		Socio socio = new Socio("juan", 21);
		Socio socioTres = new Socio("aLuis", 21);
		Socio socioDos = new Socio("juan", 21);
		//Ojito con las letras mayusculas
		Socio socioCuatro=new Socio("Zigor",23);
		HashSet<Socio> lisDos = new HashSet<>();
		System.out.println("socio"+lisDos.add(socio));
		System.out.println("socio"+lisDos.add(socio));
		System.out.println("docioDos"+lisDos.add(socioDos));
		System.out.println("socioTres"+lisDos.add(socioTres));
		System.out.println("lista "+lisDos);
		for (Socio socio2 : lisDos) {
			System.out.println(socio2.getNombre());
			System.out.println(socio2.hashCode());
		}
		TreeSet<Socio> lis=new TreeSet<>();
		System.out.println(lis.add(socio));
		System.out.println(lis.add(socio));
		System.out.println(lis.add(socioDos));
		System.out.println("equals "+socio.equals(socioDos));
		System.out.println(lis.add(socioTres));
		System.out.println(lis.add(socioCuatro));
		//el control se establece por == no por equals
		System.out.println(lis);
	}
}
