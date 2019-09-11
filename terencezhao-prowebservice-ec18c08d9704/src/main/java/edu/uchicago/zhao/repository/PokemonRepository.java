package edu.uchicago.zhao.repository;

import edu.uchicago.zhao.domain.Pokemon;
import org.springframework.data.repository.CrudRepository;

/**
 * The PokemonRepository defines the access and management of Pokemon by their ids
 * Created by teren on 8/17/2016.
 */
public interface PokemonRepository extends CrudRepository<Pokemon, Long> {
}
