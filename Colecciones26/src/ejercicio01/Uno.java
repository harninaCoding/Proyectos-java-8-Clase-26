package ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Uno implements AritmeticUno<Double,Integer> {
	int numeros[] = { 4, 7, 34, 25, 13 };
	ArrayList<Integer> lista = new ArrayList<Integer>();
	
	public Uno() {
		super();
		for (Integer integer : numeros) {
			lista.add(integer);
		}
	}
	
	@Override
	public Double media(List<Double> lista) {
		double acumulador=0;
		for (Double double1 : lista) {
			acumulador+=double1;
		}
		return acumulador/lista.size();
	}
	
	@Override
	public Integer suma(List<Integer> lista) {
		Integer acumulador=0;
		for (Integer double1 : lista) {
			acumulador+=double1;
		}
		return acumulador;
	}
}
