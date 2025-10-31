package ejercicio09.acuario;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PecesRepository {
    private final Set<Pez> peces = new HashSet<>();

    public void add(Pez pez) {
        peces.add(pez);
    }

    public void addAll(Set<Pez> nuevos) {
        peces.addAll(nuevos);
    }

    public Set<Pez> findAll() {
        return Collections.unmodifiableSet(peces);
    }

    public void clear() {
        peces.clear();
    }

    public int size() {
        return peces.size();
    }
}
