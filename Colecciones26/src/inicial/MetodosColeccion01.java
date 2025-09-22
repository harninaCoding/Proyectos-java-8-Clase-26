package inicial;
import java.util.ArrayList;
import java.util.Collection;


public class MetodosColeccion01 {
	public Collection noseQuienEs;
	//jamas un programador entrara en el reino de os cielos del codigo si pone lo siguiente
//	Collection seMucho=new ArrayList<>();
	Collection seMucho;
	public MetodosColeccion01(Collection noseQuienEs) {
		super();
		this.noseQuienEs = noseQuienEs;
	}
	public static void main(String[] args) {
		MetodosColeccion01 metodosColeccion01=new MetodosColeccion01(new ArrayList<>());
		//como no hemos definido un tipo
		metodosColeccion01.noseQuienEs.add("colores");
		metodosColeccion01.noseQuienEs.add(9);
		metodosColeccion01.noseQuienEs.add(true);
		System.out.println(metodosColeccion01.noseQuienEs.size());
		metodosColeccion01.noseQuienEs.remove(9);
		if(metodosColeccion01.noseQuienEs.contains("colores"))
			System.out.println("si existe");
		System.out.println("despues de borrar hay "+metodosColeccion01.noseQuienEs.size());	}
}
