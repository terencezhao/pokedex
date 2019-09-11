package edu.uchicago.zhao.repository;

import edu.uchicago.zhao.domain.Element;
import org.springframework.data.repository.CrudRepository;

/**
 * The ElementRepository defines the access and management of Elements by their ids
 * Created by teren on 8/17/2016.
 */
public interface ElementRepository extends CrudRepository<Element, Long> {
}
