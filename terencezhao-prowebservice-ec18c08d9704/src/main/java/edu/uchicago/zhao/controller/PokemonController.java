package edu.uchicago.zhao.controller;

import edu.uchicago.zhao.domain.Pokemon;
import edu.uchicago.zhao.service.ElementService;
import edu.uchicago.zhao.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * The PokemonController is the main resource mapping for the Pokedex application.
 * As you can see from the @RequestMapping annotation, it is available at the /pokedex endpoint.
 * The Controller itself is composed of 2 services, one for the pokemon and another for their elements.
 * There are also numerous REST methods which cohere to the CRUD operations (Create, Read, Update, Delete)
 * These mappings allow us to get a list of all available pokemon, get a specific pokemon by its ID,
 * add a new pokemon, edit an existing pokemon, or delete a pokemon by its ID. It also provides various
 * GET methods with a specified endpoint corresponding to our menu actions on specific pokemon.
 * Created by teren on 8/17/2016.
 */

@Controller
@RequestMapping("pokedex")
public class PokemonController {

    private PokemonService pokemonService;
    private ElementService elementService;

    @Autowired
    public PokemonController(PokemonService pokemonService, ElementService elementService) {
        this.pokemonService = pokemonService;
        this.elementService = elementService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("pokemon", pokemonService.list());
        return "pokedex";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("elements", elementService.list());
        model.addAttribute("pokemon", new Pokemon());
        return "pokemonform";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(Pokemon pokemon) {
        pokemonService.create(pokemon);
        return "redirect:/pokedex";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String read(@PathVariable Long id, Model model) {
        model.addAttribute("pokemon", pokemonService.read(id));
        return "pokemon";
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        Pokemon pokemonToEdit = pokemonService.read(id);
        Long elementId = pokemonToEdit.getElement().getId();
        model.addAttribute("pokemon", pokemonService.read(id));
        model.addAttribute("element", elementId);
        model.addAttribute("elements", elementService.list());
        return "pokemonform";
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

    @RequestMapping("/delete/{id}")
    public String edit(@PathVariable Integer id) {
        pokemonService.delete(id);
        return "redirect:/pokedex";
    }

}
