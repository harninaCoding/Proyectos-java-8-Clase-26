package otras;

import java.util.LinkedList;
import java.util.Queue;

public class ImitandoCola {
public static void main(String[] args) {
	LinkedList<Persona> linkedList;
	//Es una implementacion de una lista que trabaja como cola
	Queue<Persona> queue=new LinkedList<>();
//	vamos a trabajar con la cola
	queue.offer(new Persona("Dedalo",25));
	System.out.println(queue.size());
	System.out.println(queue.peek());
	//observa que peek no lo elimina
	System.out.println(queue.size());
	System.out.println(queue.poll());
	//observa que poll SI lo elimina
	System.out.println(queue.size());
	//si la cola esta vacia
	System.out.println(queue.peek());
	queue.offer(new Persona("Dedalo1",25));
	queue.offer(new Persona("Dedalo2",25));
	queue.offer(new Persona("Dedalo3",25));
	//siempre el mismo porque no desencola
	System.out.println(queue.peek());
	System.out.println(queue.peek());
	//desencolando
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
//	System.out.println(queue.poll());
}
}
