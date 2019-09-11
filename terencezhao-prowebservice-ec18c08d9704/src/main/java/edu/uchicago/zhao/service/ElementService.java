package edu.uchicago.zhao.service;

import edu.uchicago.zhao.domain.Element;

/**
 * Created by teren on 8/21/2016.
 */
public interface ElementService {
    Iterable<Element> list();

    Element create(Element element);

    Element read(long id);

    Element update(long id, Element element);

    void delete(long id);
}
