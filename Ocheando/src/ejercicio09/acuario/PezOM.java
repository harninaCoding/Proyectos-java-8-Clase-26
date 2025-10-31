package ejercicio09.acuario;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PezOM {
    private static final List<String> NOMBRES = List.of(
        "Nemo","Bubbles","Goldie","Splash","Finn","Dory","Shadow","Sunny","Pearl","Flash"
    );

    public static Pez getRandomFish() {
        var rnd = ThreadLocalRandom.current();
        String nombre = NOMBRES.get(rnd.nextInt(NOMBRES.size()));
        Especie especie = Especie.values()[rnd.nextInt(Especie.values().length)];
        int edad = rnd.nextInt(0, 6);            // 0–5 años
        double peso = 10 + rnd.nextDouble(90);   // 10–100 g
        return new Pez(nombre, especie, edad, peso);
    }
}
