package edu.uchicago.zhao.controller;

/**
 * The PokedexApiController is intended to provide JSON representation of the pokemon data.
 * Users can access these resources by hitting the /api endpoint.
 * It uses a separate @RestController annotation to distinguish itself from the @Controller annotation
 * used by the PokemonController. There is a /{id} GET method which allows users to specify a sepcific
 * pokemon for which they want the JSON representation of.
 * Created by teren on 8/19/2016.
 */

import edu.uchicago.zhao.domain.Pokemon;
import edu.uchicago.zhao.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PokedexApiController {
    private PokemonService pokemonService;

    @Autowired
    public PokedexApiController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Pokemon> list() {
        return pokemonService.list();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Pokemon create(@RequestBody Pokemon attr) {
        return pokemonService.create(attr);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Pokemon read(@PathVariable(value = "id") long id) {
        Pokemon post = pokemonService.read(id);
        return post;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Pokemon update(@PathVariable(value = "id") long id, @RequestBody Pokemon attr) {
        return pokemonService.update(id, attr);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") int id) {
        pokemonService.delete(id);
    }
}
