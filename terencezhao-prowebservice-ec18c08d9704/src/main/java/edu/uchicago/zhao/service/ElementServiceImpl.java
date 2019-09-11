package edu.uchicago.zhao.service;

import edu.uchicago.zhao.domain.Element;
import edu.uchicago.zhao.repository.ElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by teren on 8/21/2016.
 */
@Service("elementService")
public class ElementServiceImpl implements ElementService {

    private ElementRepository elementRepository;

    @Autowired
    public ElementServiceImpl(ElementRepository elementRepository) {
        this.elementRepository = elementRepository;
    }

    @Override
    public Iterable<Element> list() {
        return elementRepository.findAll();
    }

    @Override
    public Element create(Element element) {
        return elementRepository.save(element);
    }

    @Override
    public Element read(long id) {
        return elementRepository.findOne(id);
    }

    @Override
    public Element update(long id, Element element) {
        Element elementUpdate = elementRepository.findOne(id);
        elementUpdate.setType(element.getType());
        return elementRepository.save(elementUpdate);
    }

    @Override
    public void delete(long id) {
        elementRepository.delete(id);
    }
}
