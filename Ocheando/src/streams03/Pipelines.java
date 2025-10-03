package streams03;

public class Pipelines {
public static void main(String[] args) {
	String cadena="Hola que tal";
	String resultado=cadena.toUpperCase();
	System.out.println(resultado);
	System.out.println(cadena);
	String resultado1=cadena
			.toLowerCase();
	System.out.println(resultado);
	resultado=resultado1
			.toUpperCase()
			.substring(0, 2);
	System.out.println(resultado);
	System.out.println(resultado1);
}
}
