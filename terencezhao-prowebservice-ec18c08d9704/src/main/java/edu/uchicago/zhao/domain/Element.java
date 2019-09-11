package edu.uchicago.zhao.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * The Element domain entity represents the type of the pokemon. Since each pokemon has a type, and many pokemon
 * can be of the same type, there is a many-to-one relationship from pokemon to elements.
 * The element itself has a string that describes it type, whether it be FIRE, WATER, GRASS, etc.
 * Created by teren on 8/17/2016.
 */
@Entity
public class Element {

    /**
     * This annotated ID serves as the entity identification for each element and is generated automatically on creation.
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * The type field holds the element name
     */
    private String type;

    /**
     * This is the Element constructor that takes a single argument for setting the type
     * @param type
     */
    public Element(String type) {
        this.type = type;
    }

    /**
     * An no argument Element constructor
     */
    public Element() {

    }

    /**
     * A simple getter for the Element id
     * @return a Long for the Element id
     */
    public Long getId() {
        return id;
    }

    /**
     * A setter for the Element id
     * @param id is a Long
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * A getter for the String type describing the Element
     * @return A String representation of the Element type
     */
    public String getType() {
        return type;
    }

    /**
     * A setter for the Element type
     * @param type a String type that will be set
     */
    public void setType(String type) {
        this.type = type;
    }
}
