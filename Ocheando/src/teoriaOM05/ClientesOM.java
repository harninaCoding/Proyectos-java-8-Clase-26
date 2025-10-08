package teoriaOM05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ClientesOM {

	static int dniClientes=1;
	static List<String> nombres=List.of("Juan","pedro","antonio","rafa","julio","andres");
	static List<Float> descuentos=List.of(0f,10f,0f,0f,0f,10f);
//	esta i soluciona el problema de seguir dos colecciones diferentes dentro del mismo lambda
//	static int i=0;
	public static List<Cliente> getClientes() {
//		//con streams
		//la solucion mas correcta
		return IntStream.range(0, nombres.size())
				.mapToObj(i->{
						return new Cliente(String.valueOf(dniClientes++),nombres.get(i),descuentos.get(i));})
				.collect(Collectors.toList());
//		return nombres.stream()
//				.map(nombre->
//					new Cliente(String.valueOf(dniClientes++),nombre,descuentos.get(i++)))
//				.collect(Collectors.toList());
//		return nombres.stream()
//			.map((nombre)
//				->{return new Cliente(String.valueOf(dniClientes++),nombre,descuentos.get(dniClientes-2));})
//			.collect(Collectors.toList());
//		ArrayList<Cliente> lista=new ArrayList<>();
//		for (int i = 0; i < nombres.size(); i++) {
//			lista.add(new Cliente(String.valueOf(dniClientes++), nombres.get(i), descuentos.get(i)));
//		}
//		return lista;
	}
}
