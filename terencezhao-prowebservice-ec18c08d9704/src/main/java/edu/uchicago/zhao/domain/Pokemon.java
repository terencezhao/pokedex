package edu.uchicago.zhao.domain;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * The Pokemon Entity class is used to represent a Pokemon and has various fields describing its characteristics.
 * There is a ManyToOne relationship between Pokemon and Element that is similar to the relationship between Vans and Makes.
 * Pokemon themselves can be specified with a variety of information including their name, number, height, weight, level,
 * hit points, and a link to their image, and a description.
 * Created by teren on 8/17/2016.
 */
@Entity
public class Pokemon {

    /**
     * The generated id is necessary to identify each Pokemon entity
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * This is the name of the pokemon
     */
    private String name;

    /**
     * Each pokemon has an element that defines their strength and weaknesses in regards to other Pokemon
     */
    @ManyToOne
    private Element element;

    @ManyToOne
    private Trainer trainer;

    /**
     * The number represents the actual pokedex entry number of the pokemon in the pokemon universe
     */
    private Integer number;

    /**
     * The height holds the vertical measurement in meters of the pokemon at its tallest point
     */
    private Double height;

    /**
     * The weight is the pokemon's mass in kilograms
     */
    private Double weight;

    /**
     * The level is a measure of the pokemon's maturity, power, and age more or less
     */
    private Integer level;

    /**
     * The hit points are how much health the pokemon has
     */
    private Integer hitPoints;

    /**
     * The image url is a link to a picture of the pokemon
     */
    private String imgUrl;

    /**
     * The description is a text field containing an observation made of the pokemon in the wild
     */
    @Column(columnDefinition = "TEXT")
    private String description;

    /**
     * The timestamp holds when the pokemon entity was created
     */
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    /**
     * A empty but necessary no-argument constructor
     */
    public Pokemon() {

    }

    /**
     * A getter for the pokemon id
     * @return the pokemon's id
     */
    public Long getId() {
        return id;
    }

    /**
     * A setting for the pokemon's id
     * @param id the id to be set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * A getter for the pokemon's name
     * @return the name of the Pokemon
     */
    public String getName() {
        return name;
    }

    /**
     * A setting for the Pokemon's name
     * @param name the name to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A getter for the Pokemon's element
     * @return the Pokemon's element
     */
    public Element getElement() {
        return element;
    }

    /**
     * A setter for the Pokemon's element
     * @param element that will be set
     */
    public void setElement(Element element) {
        this.element = element;
    }

    /**
     * A getter for the Pokemon's trainer
     * @return the Pokemon's Trainer
     */
    public Trainer getTrainer() {
        return trainer;
    }

    /**
     * A setter for the Pokemon's Trainer
     * @param trainer of the Pokemon
     */
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    /**
     * A getter for the Pokemon's number
     * @return the nubmer of the Pokemon
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * A setter for the Pokemon's number
     * @param number to be set on the Pokemon
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * A getter for the height of the Pokemon
     * @return the Pokemon's height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * A setter for the Pokemon's height
     * @param height to set for the Pokemon
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * A getter for the Pokemon's weight
     * @return the Pokemon's weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * A setter for the Pokemon's weight
     * @param weight to be set on the Pokemon
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * A getter for the Pokemon's level
     * @return the level of the Pokemon
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * A setter for the Pokemon's level
     * @param level to be set for the Pokemon
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * A getter for the Pokemon's hit points
     * @return the hit points of the Pokemon
     */
    public Integer getHitPoints() {
        return hitPoints;
    }

    /**
     * A setter for the Pokemon's hitpoints
     * @param hitPoints the hitpoints to be set for the Pokemon
     */
    public void setHitPoints(Integer hitPoints) {
        this.hitPoints = hitPoints;
    }

    /**
     * A getter for the image url for the Pokemon
     * @return the image Url of the Pokemon
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * A setter for the image url of the Pokemon
     * @param imgUrl to be set for the Pokemon
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * A getter for the description of the Pokemon
     * @return the description of the Pokemon
     */
    public String getDescription() {
        return description;
    }

    /**
     * A setter for the Pokemon's description
     * @param description of the Pokemon to be set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The Pokemon constructor takes the following parameters
     * @param name is what the Pokemon is called
     * @param element is the natural affinity of the Pokemon
     * @param number is the pokedex number of the Pokemon
     * @param height is the vertical measurement of the Pokemon in meters
     * @param weight is how heavy the Pokemon is in kilograms
     * @param level is the strength and age of the pokemon
     * @param hitPoints is the health and stamina of the Pokemon
     * @param imgUrl is the link to a picture of the Pokemon
     * @param description is an recorded observation of the Pokemon
     */
    public Pokemon(String name, Element element, Integer number, Double height, Double weight, Integer level, Integer hitPoints, String imgUrl, String description) {
        this.name = name;
        this.element = element;
        this.number = number;
        this.height = height;
        this.weight = weight;
        this.level = level;
        this.hitPoints = hitPoints;
        this.imgUrl = imgUrl;
        this.description = description;
    }

    /**
     * The toString method concatenates the various fields along with the field identifier
     * @return a comma separated concatenated string of Pokemon information
     */
    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", height=" + height +
                ", weight=" + weight +
                ", level=" + level +
                ", hitPoints=" + hitPoints +
                ", description='" + description + '\'' +
                ", element=" + element +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
