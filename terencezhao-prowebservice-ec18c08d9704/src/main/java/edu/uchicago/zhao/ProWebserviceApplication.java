package edu.uchicago.zhao;

import edu.uchicago.zhao.domain.Element;
import edu.uchicago.zhao.domain.Pokemon;
import edu.uchicago.zhao.repository.ElementRepository;
import edu.uchicago.zhao.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

/**
 * The ProWebserviceApplication defines the initial Elements and Pokemon that are created with the application.
 */
@SpringBootApplication
public class ProWebserviceApplication implements CommandLineRunner {

    @Autowired
    private PokemonRepository pokemonRepository;

    @Autowired
    private ElementRepository elementRepository;


    public static void main(String[] args) {
        SpringApplication.run(ProWebserviceApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        Element[] elements = new Element[18];
        elements[0] = new Element("Normal");
        elements[1] = new Element("Fire");
        elements[2] = new Element("Water");
        elements[3] = new Element("Flying");
        elements[4] = new Element("Grass");
        elements[5] = new Element("Poison");
        elements[6] = new Element("Electric");
        elements[7] = new Element("Ground");
        elements[8] = new Element("Psychic");
        elements[9] = new Element("Rock");
        elements[10] = new Element("Ice");
        elements[11] = new Element("Bug");
        elements[12] = new Element("Dragon");
        elements[13] = new Element("Ghost");
        elements[14] = new Element("Dark");
        elements[15] = new Element("Steel");
        elements[16] = new Element("Fairy");
        elements[17] = new Element("???");
        elementRepository.save(Arrays.asList(elements));

        Pokemon[] pokemon = new Pokemon[9];
        pokemon[0] = new Pokemon("Bulbasaur", elements[4], 1, 0.7, 6.9, 13, 40, "http://cdn.bulbagarden.net/upload/thumb/2/21/001Bulbasaur.png/250px-001Bulbasaur.png", "A strange seed was planted on its back at birth. Thus, a plant sprouted and now grows with this Pokemon.");
        pokemon[1] = new Pokemon("Ivysaur", elements[4], 2, 1.0, 13.0, 20, 60, "http://cdn.bulbagarden.net/upload/thumb/7/73/002Ivysaur.png/250px-002Ivysaur.png", "When the bulb on its back grows large, the Pokemon seems to lose the ability to stand on its hind legs.");
        pokemon[2] = new Pokemon("Venosaur", elements[4], 3, 2.0, 100.0, 67, 100, "http://cdn.bulbagarden.net/upload/thumb/a/ae/003Venusaur.png/250px-003Venusaur.png", "This plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.");
        pokemon[3] = new Pokemon("Charmander", elements[1], 4, 0.6, 8.5, 10, 50, "http://cdn.bulbagarden.net/upload/thumb/7/73/004Charmander.png/250px-004Charmander.png", "Obviously prefers hot places. If it gets caught in the rain, steam is said to spout from the tip of its tail.");
        pokemon[4] = new Pokemon("Charmeleon", elements[1], 5, 1.1, 19.0, 32, 80, "http://cdn.bulbagarden.net/upload/thumb/4/4a/005Charmeleon.png/250px-005Charmeleon.png", "http://cdn.bulbagarden.net/upload/thumb/4/4a/005Charmeleon.png/250px-005Charmeleon.png");
        pokemon[5] = new Pokemon("Charizard", elements[1], 6, 1.7, 90.5, 76, 120, "http://cdn.bulbagarden.net/upload/thumb/7/7e/006Charizard.png/250px-006Charizard.png", "Spits fire that is hot enough to melt boulders. Known to cause forest fires unintentionally.");
        pokemon[6] = new Pokemon("Squirtle", elements[2], 7, 0.5, 9.0, 8, 40, "http://cdn.bulbagarden.net/upload/thumb/3/39/007Squirtle.png/250px-007Squirtle.png", "After birth, its back swells and hardens into a shell. It powerfully sprays foam from its mouth.");
        pokemon[7] = new Pokemon("Wartortle", elements[2], 8, 1.0, 22.5, 25, 70, "http://cdn.bulbagarden.net/upload/thumb/0/0c/008Wartortle.png/250px-008Wartortle.png", "Often hides in water to stalk unwary prey. For swimming fast, it moves its ears to maintain balance.");
        pokemon[8] = new Pokemon("Blastoise", elements[2], 9, 1.6, 85.5, 52, 100, "http://cdn.bulbagarden.net/upload/thumb/0/02/009Blastoise.png/250px-009Blastoise.png", "A brutal Pokémon with pressurized water jets on its shell. They are used for high speed tackles.");
        pokemonRepository.save(Arrays.asList(pokemon));

    }
}
