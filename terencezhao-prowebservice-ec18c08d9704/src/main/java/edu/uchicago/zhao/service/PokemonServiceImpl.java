package edu.uchicago.zhao.service;

import edu.uchicago.zhao.domain.Pokemon;
import edu.uchicago.zhao.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by teren on 8/17/2016.
 */
@Service("pokemonService")
public class PokemonServiceImpl implements PokemonService {

    private PokemonRepository pokemonRepository;

    @Autowired
    public PokemonServiceImpl(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }


    @Override
    public Iterable<Pokemon> list() {
        return pokemonRepository.findAll();
    }

    @Override
    public Pokemon create(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    @Override
    public Pokemon read(long id) {
        return pokemonRepository.findOne(id);
    }

    @Override
    public Pokemon update(long id, Pokemon pokemon) {
        Pokemon pokemonUpdate = pokemonRepository.findOne(id);
        pokemonUpdate.setName(pokemon.getName());
        pokemonUpdate.setDescription(pokemon.getDescription());
        pokemonUpdate.setElement(pokemon.getElement());
        pokemonUpdate.setImgUrl(pokemon.getImgUrl());
        return pokemonRepository.save(pokemonUpdate);
    }

    @Override
    public void delete(long id) {
        pokemonRepository.delete(id);
    }
}
