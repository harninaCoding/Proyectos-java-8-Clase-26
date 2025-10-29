package ejercicio08gropinggato;

public enum Raza {
	angora, persa, siames,colorao, callejero, abisinio, azul_ruso, balines, bengali;
	
	public static Raza dameRaza(int i) {
		 return values()[i % values().length];
	}
}
