package conjuntos;

import java.util.TreeSet;

public class setUno {
public static void main(String[] args) {
	//Sin repeticiones y ordenado
	//ordena por equals
	TreeSet<String> palabras=new TreeSet<String>();
	String uno="Hola";
	String dos=new String("Hola");
	if(uno.equals(dos)) System.out.println("son iguales");
	String palabrica=new String("columna");
	System.out.println(palabras.add("columna"));
	System.out.println(palabras.add("zalamero"));
	System.out.println(palabras.add("fila"));
	System.out.println("== "+("columna"==palabrica));
	System.out.println("equals "+("columna".equals(palabrica)));
	System.out.println(palabras.add(palabrica));
}
}
