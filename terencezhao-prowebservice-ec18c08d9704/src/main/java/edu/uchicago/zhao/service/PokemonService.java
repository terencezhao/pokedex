package edu.uchicago.zhao.service;

import edu.uchicago.zhao.domain.Pokemon;

/**
 * Created by teren on 8/17/2016.
 */
public interface PokemonService {

    Iterable<Pokemon> list();

    Pokemon create(Pokemon pokemon);

    Pokemon read(long id);

    Pokemon update(long id, Pokemon pokemon);

    void delete(long id);

}
