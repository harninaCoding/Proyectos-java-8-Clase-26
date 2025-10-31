package ejercicio09.acuario;

import java.util.Objects;

public class Pez {
    private final String nombre;
    private final Especie especie;
    private final int    edad;   // años
    private final double peso;   // gramos

    public Pez(String nombre, Especie especie, int edad, double peso) {
        this.nombre = Objects.requireNonNull(nombre);
        this.especie = Objects.requireNonNull(especie);
        if (edad < 0) throw new IllegalArgumentException("edad negativa");
        if (peso <= 0) throw new IllegalArgumentException("peso <= 0");
        this.edad = edad;
        this.peso = peso;
    }

    public String  getNombre()  { return nombre; }
    public Especie getEspecie() { return especie; }
    public int     getEdad()    { return edad; }
    public double  getPeso()    { return peso; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pez)) return false;
        Pez that = (Pez) o;
        return edad == that.edad
            && Double.compare(that.peso, peso) == 0
            && Objects.equals(nombre, that.nombre)
            && especie == that.especie;
    }

    @Override public int hashCode() {
        return Objects.hash(nombre, especie, edad, peso);
    }

    @Override public String toString() {
        return String.format("%s (%s, %da, %.1fg)", nombre, especie, edad, peso);
    }
}
