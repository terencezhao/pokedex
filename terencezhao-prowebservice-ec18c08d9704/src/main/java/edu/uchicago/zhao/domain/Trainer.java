package edu.uchicago.zhao.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by teren on 8/20/2016.
 */
@Entity
public class Trainer {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int age;
    private int gender;
    private String homeTown;

    @OneToMany
    private List<Pokemon> pokemon;

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public void catchPokemon(Pokemon pokemon) {
        this.pokemon.add(pokemon);
        pokemon.setTrainer(this);
    }

    public Pokemon releasePokemon(int index) {
        return this.pokemon.remove(index);
    }
}
