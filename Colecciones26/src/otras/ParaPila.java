package otras;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

import utiles.Utiles;

public class ParaPila {
	public static void main(String[] args) {
		String palabrejas[] = { "columnas", "filas", "zalamero", "zascandil" };
		//No usar, muy antigua
//		Stack<String> palabrasPila = new Stack<String>();
		Deque<String> palabrasPila= new LinkedList<String>();
		// Aunque tiene varios m�todos suelen usarse los de ingreso o extraccion
		// a la pila
		// para poner en la pila
		// push coloca un elemento en la cima de la pila
		palabrasPila.push(palabrejas[0]);
		palabrasPila.push(palabrejas[1]);
		// como se obtienen los elementos seegun el criterio de una pila
		// dos formas
		// 1� obteniendo el elemento y borrandolo de la pila
		// con pop se retorna el elemento en la cima y se borra de la pila
		System.out.println("cima " + palabrasPila.pop());
		System.out.println("cima " + palabrasPila.pop());
		// falla si intentamos un pop en una pila vacia
		if (!palabrasPila.isEmpty())
			System.out.println("cima " + palabrasPila.pop());
		else
			System.out.println("pila vacia");
		// Como hemos dicho se puede trabajar con Stack como si fuese una colecction
		for (int i = 0; i < palabrejas.length; i++) {
			palabrasPila.push(palabrejas[i]);
		}
		// 2� metodo de acceso a Stack como pila
		// Se trata del metodo peek que es como el pop pero
		// no elimina el elemento de la cima
		for (int i = 0; i < 5; i++) {
			System.out.println("cima " + palabrasPila.peek());
		}
		// Esto es para que veamos que puede funcionar como una Collection
		Utiles.muestraLista(palabrasPila);
		// Si usas una Stack es porque lo necesitas. java te permite usarla como
		// una collection normal, pero en realidad solo se deberian usar las
		// cuatro funciones asociadas a a pila
		// pop,push,peek,isEmpty
	}
}
