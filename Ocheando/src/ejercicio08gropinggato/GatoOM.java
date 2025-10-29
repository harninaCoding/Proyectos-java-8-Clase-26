package ejercicio08gropinggato;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GatoOM {
	List<String> nombres = Arrays.asList("Pitin", "Wifi", "Flash", "Apolo", "Rat�n", "Oreo", "Rayo", "Odin", "Max",
			"Poker", "Alan", "Yael", "Otto", "Kuno", "Max", "Ian", "Kai", "Nic", "Roi", "Joe", "Vito", "Iker", "Ori�n",
			"Leo", "Khan",
			/////////////////////////////////////
			"Tabby", "Jade", " Tabby", " Kin", " Elvis", " Baboo", " Nilo", "Ninja", " Batman", " Night", " Dark",
			" Shadow", " Sauron", " Kuro", " Morito", " Tiz�n", " Salem", " Silver", " Bol�n", " Amaru", " Joel",
			" Luc", " Naim", " Teo", "ZUmi",
			/////////////////////////////
			" Tabby", " Adel");

	// modificando " Dorian"," Rajin"
	byte edadMaxima[] = { 7, 3, 4, 2, 3, 4, 5, 3, 4, 2, 5, 6, 4, 7, 1, 4, 3, 5, 4, 2, 1, 2, 3, 4, 2,
			////////////////////
			4, 5, 6, 4, 1, 1, 3, 2, 3, 1, 3, 4, 2, 4, 4, 2, 3, 5, 6, 7, 5, 6, 3, 7, 5,
			///////////////////////
			3, 7

	};

	public Gato getRandomCat() {
		Random randon = new Random();
		return new Gato(nombres.get(randon.nextInt(nombres.size())), (byte) edadMaxima[randon.nextInt(nombres.size())],
				Raza.values()[randon.nextInt(Raza.values().length)]);
	}

	public List<Gato> getListCats() {
		return IntStream.range(0, nombres.size())
				.mapToObj(i -> new Gato(nombres.get(i), edadMaxima[i], Raza.dameRaza(i)))
				.collect(Collectors.toList());
	}
}
