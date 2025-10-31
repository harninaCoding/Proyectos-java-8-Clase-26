package ejercicio09.acuario;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PecesServiceTest {

    private PecesRepository repo;
    private PecesService service;

    @BeforeEach
    void setUp() {
        repo = new PecesRepository();
        service = new PecesServiceImpl(repo);
        // Semilla determinista mínima
        repo.add(new Pez("Nemo", Especie.GUPPY, 1, 15));
        repo.add(new Pez("Nemo", Especie.GUPPY, 2, 18));
        repo.add(new Pez("Dory", Especie.TETRA, 3, 22));
    }

    @Test
    void addHundredFishes_shouldIncreaseSizeUpTo100() {
        int before = repo.size();
        service.addHundredFishes();
        int after = repo.size();
        assertTrue(after >= before && after <= before + 100);
    }

    @Test
    void findFishesBySpecies_countsPerSpecies() {
        Map<Especie, Long> mapa = service.findFishesBySpecies();
        assertTrue(mapa.getOrDefault(Especie.GUPPY, 0L) >= 2);
        assertTrue(mapa.values().stream().allMatch(c -> c >= 0));
    }

    @Test
    void findMostCommonSpecies_returnsSomethingWhenDataExists() {
        assertTrue(service.findMostCommonSpecies().isPresent());
    }

    @Test
    void averageWeightBySpecies_hasValues() {
        Map<Especie, Double> medias = service.averageWeightBySpecies();
        assertFalse(medias.isEmpty());
        assertTrue(medias.values().stream().allMatch(d -> d > 0.0));
    }

    @Test
    void averageAge_presentAndWithinRange() {
        var avg = service.averageAge();
        assertTrue(avg.isPresent());
        assertTrue(avg.getAsDouble() >= 0);
    }

    @Test
    void getAdultFishes_onlyAdults() {
        assertTrue(service.getAdultFishes().stream().allMatch(p -> p.getEdad() >= 2));
    }

    @Test
    void findMostCommonName_present() {
        assertTrue(service.findMostCommonName().isPresent());
    }
}
