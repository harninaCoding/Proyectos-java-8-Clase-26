package inicial;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class PrimeraColeccion {
public static void main(String[] args) {
	ArrayList<Integer> nueva=new ArrayList<>();
	//insertar elementos
	nueva.add(1);
	nueva.add(2);
	nueva.add(3);
	nueva.add(4);
	nueva.add(5);
	
	//Vamos a recorrerla sin modificarla
	for (Integer integer : nueva) {
		System.out.println(integer);
	}
	//La forma de recorrer que si permite modificar
	for (Iterator iterator = nueva.iterator(); iterator.hasNext();) {
		Integer integer = (Integer) iterator.next();
		System.out.println(integer);
		
	}
	LinkedList colecDos=new LinkedList<Integer>();
	colecDos.add(10);
	colecDos.add(18);
	colecDos.add(13);
	colecDos.add(16);
	colecDos.add(11);
	colecDos.add(19);
	//fusionar
	nueva.addAll(colecDos);
	
}
}
