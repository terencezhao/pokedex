package edu.uchicago.zhao.controller;

import edu.uchicago.zhao.domain.Pokemon;
import edu.uchicago.zhao.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * The TrainerController is meant to map the various REST/CRUD operations to pokemon trainers
 * Similar to pokemon, trainers can also be added, viewed, modified, and deleted.
 * Created by teren on 8/20/2016.
 */

@Controller
@RequestMapping("trainers")
public class TrainerController {

    private PokemonService pokemonService;

    @Autowired
    public TrainerController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("pokemon", pokemonService.list());
        return "pokedex";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Pokemon create(@RequestBody Pokemon pokemon) {
        return pokemonService.create(pokemon);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Pokemon read(@PathVariable(value = "id") long id) {
        Pokemon pokemon = pokemonService.read(id);
        return pokemon;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Pokemon update(@PathVariable(value = "id") long id, @RequestBody Pokemon pokemon) {
        Pokemon updatedPokemon = pokemonService.update(id, pokemon);
        return updatedPokemon;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") long id) {
        pokemonService.delete(id);
    }

}